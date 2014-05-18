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

package com.liferay.portlet.documentlibrary.recordlog.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DLRecordLog}.
 * </p>
 *
 * @author    Jitendra Rajput
 * @see       DLRecordLog
 * @generated
 */
public class DLRecordLogWrapper implements DLRecordLog,
	ModelWrapper<DLRecordLog> {
	public DLRecordLogWrapper(DLRecordLog dlRecordLog) {
		_dlRecordLog = dlRecordLog;
	}

	public Class<?> getModelClass() {
		return DLRecordLog.class;
	}

	public String getModelClassName() {
		return DLRecordLog.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("logId", getLogId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long logId = (Long)attributes.get("logId");

		if (logId != null) {
			setLogId(logId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	* Returns the primary key of this d l record log.
	*
	* @return the primary key of this d l record log
	*/
	public long getPrimaryKey() {
		return _dlRecordLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d l record log.
	*
	* @param primaryKey the primary key of this d l record log
	*/
	public void setPrimaryKey(long primaryKey) {
		_dlRecordLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the log ID of this d l record log.
	*
	* @return the log ID of this d l record log
	*/
	public long getLogId() {
		return _dlRecordLog.getLogId();
	}

	/**
	* Sets the log ID of this d l record log.
	*
	* @param logId the log ID of this d l record log
	*/
	public void setLogId(long logId) {
		_dlRecordLog.setLogId(logId);
	}

	/**
	* Returns the file entry ID of this d l record log.
	*
	* @return the file entry ID of this d l record log
	*/
	public long getFileEntryId() {
		return _dlRecordLog.getFileEntryId();
	}

	/**
	* Sets the file entry ID of this d l record log.
	*
	* @param fileEntryId the file entry ID of this d l record log
	*/
	public void setFileEntryId(long fileEntryId) {
		_dlRecordLog.setFileEntryId(fileEntryId);
	}

	/**
	* Returns the company ID of this d l record log.
	*
	* @return the company ID of this d l record log
	*/
	public long getCompanyId() {
		return _dlRecordLog.getCompanyId();
	}

	/**
	* Sets the company ID of this d l record log.
	*
	* @param companyId the company ID of this d l record log
	*/
	public void setCompanyId(long companyId) {
		_dlRecordLog.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this d l record log.
	*
	* @return the user ID of this d l record log
	*/
	public long getUserId() {
		return _dlRecordLog.getUserId();
	}

	/**
	* Sets the user ID of this d l record log.
	*
	* @param userId the user ID of this d l record log
	*/
	public void setUserId(long userId) {
		_dlRecordLog.setUserId(userId);
	}

	/**
	* Returns the user uuid of this d l record log.
	*
	* @return the user uuid of this d l record log
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlRecordLog.getUserUuid();
	}

	/**
	* Sets the user uuid of this d l record log.
	*
	* @param userUuid the user uuid of this d l record log
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_dlRecordLog.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this d l record log.
	*
	* @return the user name of this d l record log
	*/
	public java.lang.String getUserName() {
		return _dlRecordLog.getUserName();
	}

	/**
	* Sets the user name of this d l record log.
	*
	* @param userName the user name of this d l record log
	*/
	public void setUserName(java.lang.String userName) {
		_dlRecordLog.setUserName(userName);
	}

	/**
	* Returns the ip address of this d l record log.
	*
	* @return the ip address of this d l record log
	*/
	public java.lang.String getIpAddress() {
		return _dlRecordLog.getIpAddress();
	}

	/**
	* Sets the ip address of this d l record log.
	*
	* @param ipAddress the ip address of this d l record log
	*/
	public void setIpAddress(java.lang.String ipAddress) {
		_dlRecordLog.setIpAddress(ipAddress);
	}

	/**
	* Returns the create date of this d l record log.
	*
	* @return the create date of this d l record log
	*/
	public java.util.Date getCreateDate() {
		return _dlRecordLog.getCreateDate();
	}

	/**
	* Sets the create date of this d l record log.
	*
	* @param createDate the create date of this d l record log
	*/
	public void setCreateDate(java.util.Date createDate) {
		_dlRecordLog.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _dlRecordLog.isNew();
	}

	public void setNew(boolean n) {
		_dlRecordLog.setNew(n);
	}

	public boolean isCachedModel() {
		return _dlRecordLog.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dlRecordLog.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dlRecordLog.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dlRecordLog.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dlRecordLog.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dlRecordLog.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dlRecordLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DLRecordLogWrapper((DLRecordLog)_dlRecordLog.clone());
	}

	public int compareTo(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog) {
		return _dlRecordLog.compareTo(dlRecordLog);
	}

	@Override
	public int hashCode() {
		return _dlRecordLog.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> toCacheModel() {
		return _dlRecordLog.toCacheModel();
	}

	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog toEscapedModel() {
		return new DLRecordLogWrapper(_dlRecordLog.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dlRecordLog.toString();
	}

	public java.lang.String toXmlString() {
		return _dlRecordLog.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dlRecordLog.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DLRecordLog getWrappedDLRecordLog() {
		return _dlRecordLog;
	}

	public DLRecordLog getWrappedModel() {
		return _dlRecordLog;
	}

	public void resetOriginalValues() {
		_dlRecordLog.resetOriginalValues();
	}

	private DLRecordLog _dlRecordLog;
}