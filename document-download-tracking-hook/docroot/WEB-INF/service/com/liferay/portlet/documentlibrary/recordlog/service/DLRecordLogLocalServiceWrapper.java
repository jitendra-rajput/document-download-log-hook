/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.documentlibrary.recordlog.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DLRecordLogLocalService}.
 * </p>
 *
 * @author    Jitendra Rajput
 * @see       DLRecordLogLocalService
 * @generated
 */
public class DLRecordLogLocalServiceWrapper implements DLRecordLogLocalService,
	ServiceWrapper<DLRecordLogLocalService> {
	public DLRecordLogLocalServiceWrapper(
		DLRecordLogLocalService dlRecordLogLocalService) {
		_dlRecordLogLocalService = dlRecordLogLocalService;
	}

	/**
	* Adds the d l record log to the database. Also notifies the appropriate model listeners.
	*
	* @param dlRecordLog the d l record log
	* @return the d l record log that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog addDLRecordLog(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.addDLRecordLog(dlRecordLog);
	}

	/**
	* Creates a new d l record log with the primary key. Does not add the d l record log to the database.
	*
	* @param logId the primary key for the new d l record log
	* @return the new d l record log
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog createDLRecordLog(
		long logId) {
		return _dlRecordLogLocalService.createDLRecordLog(logId);
	}

	/**
	* Deletes the d l record log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log that was removed
	* @throws PortalException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog deleteDLRecordLog(
		long logId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.deleteDLRecordLog(logId);
	}

	/**
	* Deletes the d l record log from the database. Also notifies the appropriate model listeners.
	*
	* @param dlRecordLog the d l record log
	* @return the d l record log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog deleteDLRecordLog(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.deleteDLRecordLog(dlRecordLog);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dlRecordLogLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchDLRecordLog(
		long logId) throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.fetchDLRecordLog(logId);
	}

	/**
	* Returns the d l record log with the primary key.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log
	* @throws PortalException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog getDLRecordLog(
		long logId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.getDLRecordLog(logId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d l record logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d l record logs
	* @param end the upper bound of the range of d l record logs (not inclusive)
	* @return the range of d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> getDLRecordLogs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.getDLRecordLogs(start, end);
	}

	/**
	* Returns the number of d l record logs.
	*
	* @return the number of d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public int getDLRecordLogsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.getDLRecordLogsCount();
	}

	/**
	* Updates the d l record log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dlRecordLog the d l record log
	* @return the d l record log that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog updateDLRecordLog(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.updateDLRecordLog(dlRecordLog);
	}

	/**
	* Updates the d l record log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dlRecordLog the d l record log
	* @param merge whether to merge the d l record log with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d l record log that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog updateDLRecordLog(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.updateDLRecordLog(dlRecordLog, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dlRecordLogLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dlRecordLogLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dlRecordLogLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> getDLLogsByFileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLogLocalService.getDLLogsByFileEntryId(fileEntryId,
			start, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DLRecordLogLocalService getWrappedDLRecordLogLocalService() {
		return _dlRecordLogLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDLRecordLogLocalService(
		DLRecordLogLocalService dlRecordLogLocalService) {
		_dlRecordLogLocalService = dlRecordLogLocalService;
	}

	public DLRecordLogLocalService getWrappedService() {
		return _dlRecordLogLocalService;
	}

	public void setWrappedService(
		DLRecordLogLocalService dlRecordLogLocalService) {
		_dlRecordLogLocalService = dlRecordLogLocalService;
	}

	private DLRecordLogLocalService _dlRecordLogLocalService;
}