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

package com.liferay.portlet.documentlibrary.recordlog.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;

/**
 * The persistence interface for the d l record log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jitendra Rajput
 * @see DLRecordLogPersistenceImpl
 * @see DLRecordLogUtil
 * @generated
 */
public interface DLRecordLogPersistence extends BasePersistence<DLRecordLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DLRecordLogUtil} to access the d l record log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the d l record log in the entity cache if it is enabled.
	*
	* @param dlRecordLog the d l record log
	*/
	public void cacheResult(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog);

	/**
	* Caches the d l record logs in the entity cache if it is enabled.
	*
	* @param dlRecordLogs the d l record logs
	*/
	public void cacheResult(
		java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> dlRecordLogs);

	/**
	* Creates a new d l record log with the primary key. Does not add the d l record log to the database.
	*
	* @param logId the primary key for the new d l record log
	* @return the new d l record log
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog create(
		long logId);

	/**
	* Removes the d l record log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log that was removed
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog remove(
		long logId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException;

	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog updateImpl(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d l record log with the primary key or throws a {@link com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException} if it could not be found.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByPrimaryKey(
		long logId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException;

	/**
	* Returns the d l record log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log, or <code>null</code> if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByPrimaryKey(
		long logId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the d l record logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the d l record logs where fileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileEntryId the file entry ID
	* @param start the lower bound of the range of d l record logs
	* @param end the upper bound of the range of d l record logs (not inclusive)
	* @return the range of matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d l record logs where fileEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileEntryId the file entry ID
	* @param start the lower bound of the range of d l record logs
	* @param end the upper bound of the range of d l record logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByfileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException;

	/**
	* Returns the first d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d l record log, or <code>null</code> if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByfileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByfileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException;

	/**
	* Returns the last d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d l record log, or <code>null</code> if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByfileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the d l record logs before and after the current d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param logId the primary key of the current d l record log
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog[] findByfileEntryId_PrevAndNext(
		long logId, long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException;

	/**
	* Returns all the d l record logs.
	*
	* @return the d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the d l record logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d l record logs
	* @param end the upper bound of the range of d l record logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d l record logs where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the d l record logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d l record logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByfileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of d l record logs.
	*
	* @return the number of d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}