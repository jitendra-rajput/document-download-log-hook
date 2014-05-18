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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Jitendra Rajput
 * @generated
 */
public class DLRecordLogSoap implements Serializable {
	public static DLRecordLogSoap toSoapModel(DLRecordLog model) {
		DLRecordLogSoap soapModel = new DLRecordLogSoap();

		soapModel.setLogId(model.getLogId());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static DLRecordLogSoap[] toSoapModels(DLRecordLog[] models) {
		DLRecordLogSoap[] soapModels = new DLRecordLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DLRecordLogSoap[][] toSoapModels(DLRecordLog[][] models) {
		DLRecordLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DLRecordLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DLRecordLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DLRecordLogSoap[] toSoapModels(List<DLRecordLog> models) {
		List<DLRecordLogSoap> soapModels = new ArrayList<DLRecordLogSoap>(models.size());

		for (DLRecordLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DLRecordLogSoap[soapModels.size()]);
	}

	public DLRecordLogSoap() {
	}

	public long getPrimaryKey() {
		return _logId;
	}

	public void setPrimaryKey(long pk) {
		setLogId(pk);
	}

	public long getLogId() {
		return _logId;
	}

	public void setLogId(long logId) {
		_logId = logId;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _logId;
	private long _fileEntryId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private String _ipAddress;
	private Date _createDate;
}