/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.documentlibrary.hook.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.PortalSessionThreadLocal;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Company;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;
import com.liferay.portlet.documentlibrary.recordlog.service.DLRecordLogLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;

/**
 * @author Mika Koivisto
 */
public class DLRecordFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain)
		throws IOException, ServletException {
	
		boolean isLogsEnabled = GetterUtil.getBoolean(
				PropsUtil.get("document.download.logs.enabled"), Boolean.FALSE);
		if (isLogsEnabled) {
			try {

				HttpServletRequest httpRequest = PortalUtil
						.getOriginalServletRequest((HttpServletRequest) servletRequest);
				String uri = (String) servletRequest
						.getAttribute(WebKeys.INVOKER_FILTER_URI);
				/**
				 * In WebServerServlet(Parent servlet) it returns path like /1024/123/Document+Name/uuid
				 * While in this filter URI is like /document/1024/123/Document+Name/uuid. So to use OOB methods
				 * I have replaced intial /document/ with blank.
				 */
				uri = StringUtil.replaceFirst(uri, "/documents/",
						StringPool.BLANK);
				String[] pathArray = StringUtil.split(uri, CharPool.SLASH);

				if (Validator.isNumber(pathArray[0])) {
				
					User user = _getUser(httpRequest);
					PrincipalThreadLocal.setName(user.getUserId());
					PrincipalThreadLocal.setPassword(
						PortalUtil.getUserPassword(httpRequest));

					PermissionChecker permissionChecker =
						PermissionCheckerFactoryUtil.create(user);

					PermissionThreadLocal.setPermissionChecker(permissionChecker);

					FileEntry fileEntry = getFileEntry(pathArray);
					
					String remoteIpAddress = httpRequest.getRemoteAddr();
					addDLRecordLog(fileEntry, user, remoteIpAddress);
				}

				//System.out.println("URI " + uri);
			} 
			catch (Exception e) {
				LOGGER.error(e.getMessage(),e);
			}
		}
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) {
		
	}
	
	/**
	 * Get FileEntry object by passing document download URL in array.
	 * User will not have permission to download document then it will throw Principal Exception
	 * @param pathArray
	 * @return
	 * @throws Exception
	 */
	protected FileEntry getFileEntry(String[] pathArray) throws Exception {
		if (pathArray.length == 1) {
			long dlFileShortcutId = GetterUtil.getLong(pathArray[0]);

			DLFileShortcut dlFileShortcut = DLAppServiceUtil.getFileShortcut(
				dlFileShortcutId);

			return DLAppServiceUtil.getFileEntry(
				dlFileShortcut.getToFileEntryId());
		}
		else if (pathArray.length == 2) {
			long groupId = GetterUtil.getLong(pathArray[0]);

			return DLAppServiceUtil.getFileEntryByUuidAndGroupId(
				pathArray[1], groupId);
		}
		else if (pathArray.length == 3) {
			long groupId = GetterUtil.getLong(pathArray[0]);
			long folderId = GetterUtil.getLong(pathArray[1]);
			String fileName = HttpUtil.decodeURL(pathArray[2]);

			if (fileName.contains(StringPool.QUESTION)) {
				fileName = fileName.substring(
					0, fileName.indexOf(StringPool.QUESTION));
			}

			return DLAppServiceUtil.getFileEntry(groupId, folderId, fileName);
		}
		else {
			long groupId = GetterUtil.getLong(pathArray[0]);

			String uuid = pathArray[3];

			return DLAppServiceUtil.getFileEntryByUuidAndGroupId(uuid, groupId);
		}
	}
	
	/**
	 * Get logged in user . 
	 * If user is not logged in then it will return default user.
	 * @param request
	 * @return
	 * @throws Exception
	 */
	private static User _getUser(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();

		if (PortalSessionThreadLocal.getHttpSession() == null) {
			PortalSessionThreadLocal.setHttpSession(session);
		}

		User user = PortalUtil.getUser(request);

		if (user != null) {
			return user;
		}

		String userIdString = (String)session.getAttribute("j_username");
		String password = (String)session.getAttribute("j_password");

		if ((userIdString != null) && (password != null)) {
			long userId = GetterUtil.getLong(userIdString);

			user = UserLocalServiceUtil.getUser(userId);
		}
		else {
			long companyId = PortalUtil.getCompanyId(request);

			Company company = CompanyLocalServiceUtil.getCompany(companyId);

			user = company.getDefaultUser();
		}

		return user;
	}

	/**
	 * Save document download logs
	 * @param fileEntry
	 * @param user
	 * @param remoteAddress
	 */
	protected void addDLRecordLog(FileEntry fileEntry , User user , String remoteAddress){
		
		try {
			
			if (Validator.isNotNull(fileEntry)) {

				long logId = CounterLocalServiceUtil
						.increment(DLRecordLog.class.getName());
				DLRecordLog dlRecordLog = DLRecordLogLocalServiceUtil
						.createDLRecordLog(logId);
				dlRecordLog.setFileEntryId(fileEntry.getFileEntryId());
				dlRecordLog.setCreateDate(new Date());
				if (Validator.isNotNull(user)) {
					dlRecordLog.setUserId(user.getUserId());
					dlRecordLog.setCompanyId(user.getCompanyId());
					dlRecordLog.setUserName(user.getFullName());
				}
				dlRecordLog.setIpAddress(remoteAddress);
				if (Validator.isNotNull(user) && user.isDefaultUser()) {
					dlRecordLog.setUserName(GroupConstants.GUEST);
				}
				DLRecordLogLocalServiceUtil.addDLRecordLog(dlRecordLog);
			}

		} catch (SystemException e) {
			LOGGER.error(e.getMessage(),e);;
		}
		
	}


	
	private static final Log LOGGER = LogFactoryUtil.getLog(DLRecordFilter.class);

}