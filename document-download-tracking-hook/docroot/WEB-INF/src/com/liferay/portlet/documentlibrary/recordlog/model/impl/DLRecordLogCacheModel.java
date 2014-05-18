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

package com.liferay.portlet.documentlibrary.recordlog.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DLRecordLog in entity cache.
 *
 * @author Jitendra Rajput
 * @see DLRecordLog
 * @generated
 */
public class DLRecordLogCacheModel implements CacheModel<DLRecordLog>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{logId=");
		sb.append(logId);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public DLRecordLog toEntityModel() {
		DLRecordLogImpl dlRecordLogImpl = new DLRecordLogImpl();

		dlRecordLogImpl.setLogId(logId);
		dlRecordLogImpl.setFileEntryId(fileEntryId);
		dlRecordLogImpl.setCompanyId(companyId);
		dlRecordLogImpl.setUserId(userId);

		if (userName == null) {
			dlRecordLogImpl.setUserName(StringPool.BLANK);
		}
		else {
			dlRecordLogImpl.setUserName(userName);
		}

		if (ipAddress == null) {
			dlRecordLogImpl.setIpAddress(StringPool.BLANK);
		}
		else {
			dlRecordLogImpl.setIpAddress(ipAddress);
		}

		if (createDate == Long.MIN_VALUE) {
			dlRecordLogImpl.setCreateDate(null);
		}
		else {
			dlRecordLogImpl.setCreateDate(new Date(createDate));
		}

		dlRecordLogImpl.resetOriginalValues();

		return dlRecordLogImpl;
	}

	public long logId;
	public long fileEntryId;
	public long companyId;
	public long userId;
	public String userName;
	public String ipAddress;
	public long createDate;
}