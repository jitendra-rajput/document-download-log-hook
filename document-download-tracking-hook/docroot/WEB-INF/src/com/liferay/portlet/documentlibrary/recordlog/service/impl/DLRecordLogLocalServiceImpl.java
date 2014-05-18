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

package com.liferay.portlet.documentlibrary.recordlog.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;
import com.liferay.portlet.documentlibrary.recordlog.service.base.DLRecordLogLocalServiceBaseImpl;

/**
 * The implementation of the d l record log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portlet.documentlibrary.recordlog.service.DLRecordLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.documentlibrary.recordlog.service.base.DLRecordLogLocalServiceBaseImpl
 * @see com.liferay.portlet.documentlibrary.recordlog.service.DLRecordLogLocalServiceUtil
 */
public class DLRecordLogLocalServiceImpl extends DLRecordLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portlet.documentlibrary.recordlog.service.DLRecordLogLocalServiceUtil} to access the d l record log local service.
	 */
	
	public List<DLRecordLog> getDLLogsByFileEntryId(long fileEntryId , int start , int end) throws SystemException{
		
		return dlRecordLogPersistence.findByfileEntryId(fileEntryId, start, end);
	}
}