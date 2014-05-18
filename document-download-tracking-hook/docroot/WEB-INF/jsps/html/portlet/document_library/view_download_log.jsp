<%-- 
 *
 * @project Document download log tracker
 * @author Jitendra Rajput
 * @description JSP to display download logs for selected document 
 *
--%>

<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/portlet/document_library/init.jsp" %>
<%@page import="com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog"%>


<script type="text/javascript">

function submitForom(url){
	document.getElementById('dlRecordLogForm').action=url;
	document.getElementById('dlRecordLogForm').submit();
}
</script>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<% String fileEntryId = (String)request.getAttribute("fileEntryId"); %>


<portlet:renderURL var="deleteLogURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
			<portlet:param name="struts_action" value="/document_library/view_download_log" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="fileEntryId" value="<%= fileEntryId %>" />
</portlet:renderURL>


<portlet:renderURL var="clearAllURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
			<portlet:param name="struts_action" value="/document_library/view_download_log" />
			<portlet:param name="<%= Constants.CMD %>" value="deleteAll" />
</portlet:renderURL>




<form name="dlRecordLogForm"  id="dlRecordLogForm" method="post">

<c:choose>

<c:when test="${isLogsEnabled}">


<div>
<input type="button" value="Clear Current Logs" onclick="submitForom('<%= deleteLogURL%>')"/>
<input type="button" value="Clear All Logs" onclick="submitForom('<%= clearAllURL%>')"/></div>

<br/>
<liferay-ui:search-container hover="false"  searchContainer="${searchContainer}">

	<liferay-ui:search-container-results 
		results="${searchContainer.results}"
		total="${searchContainer.total}" />
	<liferay-ui:search-container-row 
		className="com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog"
		keyProperty="logId" modelVar="logObj">
		
		<liferay-ui:search-container-column-text name="user-name" property="userName"/>
		<liferay-ui:search-container-column-text name="ip-address" property="ipAddress"/>
		<liferay-ui:search-container-column-text name="downloaded-on" property="createDate"/>
		
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>

</c:when>
<c:otherwise>

<div class="portlet-msg-info">
	<liferay-ui:message key="document-download-logs-disabled-msg" />
</div>

</c:otherwise>
</c:choose>

</form>