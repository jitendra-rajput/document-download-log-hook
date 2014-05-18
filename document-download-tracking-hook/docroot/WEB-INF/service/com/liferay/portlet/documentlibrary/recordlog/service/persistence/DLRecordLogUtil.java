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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog;

import java.util.List;

/**
 * The persistence utility for the d l record log service. This utility wraps {@link DLRecordLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jitendra Rajput
 * @see DLRecordLogPersistence
 * @see DLRecordLogPersistenceImpl
 * @generated
 */
public class DLRecordLogUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DLRecordLog dlRecordLog) {
		getPersistence().clearCache(dlRecordLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DLRecordLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DLRecordLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DLRecordLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DLRecordLog update(DLRecordLog dlRecordLog, boolean merge)
		throws SystemException {
		return getPersistence().update(dlRecordLog, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DLRecordLog update(DLRecordLog dlRecordLog, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dlRecordLog, merge, serviceContext);
	}

	/**
	* Caches the d l record log in the entity cache if it is enabled.
	*
	* @param dlRecordLog the d l record log
	*/
	public static void cacheResult(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog) {
		getPersistence().cacheResult(dlRecordLog);
	}

	/**
	* Caches the d l record logs in the entity cache if it is enabled.
	*
	* @param dlRecordLogs the d l record logs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> dlRecordLogs) {
		getPersistence().cacheResult(dlRecordLogs);
	}

	/**
	* Creates a new d l record log with the primary key. Does not add the d l record log to the database.
	*
	* @param logId the primary key for the new d l record log
	* @return the new d l record log
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog create(
		long logId) {
		return getPersistence().create(logId);
	}

	/**
	* Removes the d l record log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log that was removed
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog remove(
		long logId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException {
		return getPersistence().remove(logId);
	}

	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog updateImpl(
		com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog dlRecordLog,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dlRecordLog, merge);
	}

	/**
	* Returns the d l record log with the primary key or throws a {@link com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException} if it could not be found.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByPrimaryKey(
		long logId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException {
		return getPersistence().findByPrimaryKey(logId);
	}

	/**
	* Returns the d l record log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param logId the primary key of the d l record log
	* @return the d l record log, or <code>null</code> if a d l record log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByPrimaryKey(
		long logId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(logId);
	}

	/**
	* Returns all the d l record logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileEntryId(fileEntryId);
	}

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
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByfileEntryId(fileEntryId, start, end);
	}

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
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findByfileEntryId(
		long fileEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfileEntryId(fileEntryId, start, end, orderByComparator);
	}

	/**
	* Returns the first d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByfileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException {
		return getPersistence()
				   .findByfileEntryId_First(fileEntryId, orderByComparator);
	}

	/**
	* Returns the first d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d l record log, or <code>null</code> if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByfileEntryId_First(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileEntryId_First(fileEntryId, orderByComparator);
	}

	/**
	* Returns the last d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d l record log
	* @throws com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog findByfileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException {
		return getPersistence()
				   .findByfileEntryId_Last(fileEntryId, orderByComparator);
	}

	/**
	* Returns the last d l record log in the ordered set where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d l record log, or <code>null</code> if a matching d l record log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog fetchByfileEntryId_Last(
		long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByfileEntryId_Last(fileEntryId, orderByComparator);
	}

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
	public static com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog[] findByfileEntryId_PrevAndNext(
		long logId, long fileEntryId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.documentlibrary.recordlog.NoSuchDLRecordLogException {
		return getPersistence()
				   .findByfileEntryId_PrevAndNext(logId, fileEntryId,
			orderByComparator);
	}

	/**
	* Returns all the d l record logs.
	*
	* @return the d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.portlet.documentlibrary.recordlog.model.DLRecordLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the d l record logs where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByfileEntryId(fileEntryId);
	}

	/**
	* Removes all the d l record logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of d l record logs where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfileEntryId(long fileEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByfileEntryId(fileEntryId);
	}

	/**
	* Returns the number of d l record logs.
	*
	* @return the number of d l record logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DLRecordLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DLRecordLogPersistence)PortletBeanLocatorUtil.locate(com.liferay.portlet.documentlibrary.recordlog.service.ClpSerializer.getServletContextName(),
					DLRecordLogPersistence.class.getName());

			ReferenceRegistry.registerReference(DLRecordLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(DLRecordLogPersistence persistence) {
	}

	private static DLRecordLogPersistence _persistence;
}