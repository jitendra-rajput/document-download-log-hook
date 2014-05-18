package com.liferay.documentlibrary.portlet;

import java.util.List;

import javax.portlet.PortletConfig;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowStateException;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;
import com.liferay.portlet.documentlibrary.recordlog.service.DLRecordLogLocalServiceUtil;

public class ViewDownloadLogAction extends BaseStrutsPortletAction {

	@Override
	public String render(PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {

		/**
		 * Read from portal-ext. If logs are enabled then only store info in Database
		 */
		boolean isLogsEnabled = GetterUtil.getBoolean(
				PropsUtil.get("document.download.logs.enabled"), Boolean.FALSE);
		if (isLogsEnabled) {
			//System.out.println("View/delete Document log");

			String cmd = ParamUtil.getString(renderRequest, Constants.CMD);

			String dlFileEntryId = ParamUtil.getString(renderRequest,
					"fileEntryId");
			if (Validator.isNotNull(cmd)
					&& Validator.equals(cmd, Constants.DELETE)) {
				clearDownloadLogs(GetterUtil.getLong(dlFileEntryId));
			}

			if (Validator.isNotNull(cmd) && Validator.equals(cmd, "deleteAll")) {
				clearAllLogs();
			}

			renderRequest.setAttribute("searchContainer",
					getSearchContainer(renderRequest, renderResponse));
			renderRequest.setAttribute("fileEntryId", dlFileEntryId);
		}
		renderRequest.setAttribute("isLogsEnabled", isLogsEnabled);
		return "/portlet/document_library/view_download_log.jsp";
	}
	
	
	
		/**
		 * Search container - Contains information of list of download logs
		 * @param renderRequest
		 * @param renderResponse
		 * @return
		 */
		protected SearchContainer<DLRecordLog> getSearchContainer(RenderRequest renderRequest ,RenderResponse renderResponse){
	    	
	    	SearchContainer<DLRecordLog> searchContainer = null;
	    	long fileEntryId = ParamUtil.getLong(renderRequest, "fileEntryId");
	    	
	    	
	    	PortletURL portletURL = getIteratorURL(renderResponse, fileEntryId);
	    	searchContainer = new SearchContainer<DLRecordLog>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, null, "no-download-logs-were-found");
	    	List<DLRecordLog> logList = getDownloadLogs(fileEntryId, searchContainer.getStart(),searchContainer.getEnd());
	    	List<DLRecordLog> fullLogsList = getDownloadLogs(fileEntryId, QueryUtil.ALL_POS,QueryUtil.ALL_POS);
			if (Validator.isNotNull(logList)) {
				
				searchContainer.setResults(logList);
			}
			if(Validator.isNotNull(fullLogsList)){
				searchContainer.setTotal(fullLogsList.size());
			}
			return searchContainer;
	    	
	    }
	  
	/**
	 * Get download logs by passing fileEntryId	
	 * @param fileEntryId
	 * @param start
	 * @param end
	 * @return
	 */
	protected List<DLRecordLog> getDownloadLogs(long fileEntryId, int start,
			int end) {

		List<DLRecordLog> dlLogList = null;

		try {
			dlLogList = DLRecordLogLocalServiceUtil.getDLLogsByFileEntryId(
					fileEntryId, start, end);
		} catch (SystemException e) {
			LOGGER.error(e.getMessage(),e);
		}

		return dlLogList;
	}
	
	/**
	 * Get search container pagination URL
	 * @param renderResponse
	 * @param fileEntryId
	 * @return
	 */
	protected PortletURL getIteratorURL(RenderResponse renderResponse , long fileEntryId){
			
		PortletURL portletURL = renderResponse.createRenderURL();
    	portletURL.setParameter("struts_action", "/document_library/view_download_log");
    	portletURL.setParameter("fileEntryId", String.valueOf(fileEntryId));
    	try {
			portletURL.setWindowState(LiferayWindowState.POP_UP);
		} catch (WindowStateException e) {
			LOGGER.error(e.getMessage());
		}
    	
    	return portletURL;
	}
	
	/**
	 * Clear logs by passing fileEntryId
	 * @param fileEntryId
	 */
	protected void clearDownloadLogs(long fileEntryId){
		
		List<DLRecordLog> dlRecordLogList = getDownloadLogs(fileEntryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		deleteLogList(dlRecordLogList);
		
	}
	
	/**
	 * Clear All logs - For all documents
	 */
	protected void clearAllLogs(){
		
		try {
			List<DLRecordLog> fullLogList = DLRecordLogLocalServiceUtil.getDLRecordLogs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			deleteLogList(fullLogList);
		} catch (SystemException e) {
			LOGGER.error(e.getMessage(),e);
		}
	}

	
	/**
	 * Delete individual log by iterating list.
	 * @param dlRecordLogList
	 */
	protected void deleteLogList(List<DLRecordLog> dlRecordLogList) {

		if (Validator.isNotNull(dlRecordLogList)) {

			for (DLRecordLog dlRecordLog : dlRecordLogList) {
				try {
					DLRecordLogLocalServiceUtil.deleteDLRecordLog(dlRecordLog);
				} catch (SystemException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
		}

	}

	private static final Log LOGGER = LogFactoryUtil.getLog(ViewDownloadLogAction.class);
	
	
}
