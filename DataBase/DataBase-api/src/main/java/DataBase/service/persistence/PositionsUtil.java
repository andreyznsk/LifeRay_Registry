/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package DataBase.service.persistence;

import DataBase.model.Positions;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the positions service. This utility wraps <code>DataBase.service.persistence.impl.PositionsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsPersistence
 * @generated
 */
public class PositionsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Positions positions) {
		getPersistence().clearCache(positions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Positions> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Positions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Positions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Positions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Positions update(Positions positions) {
		return getPersistence().update(positions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Positions update(
		Positions positions, ServiceContext serviceContext) {

		return getPersistence().update(positions, serviceContext);
	}

	/**
	 * Returns all the positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching positionses
	 */
	public static List<Positions> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the positionses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @return the range of matching positionses
	 */
	public static List<Positions> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the positionses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the positionses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByUuid_First(
			String uuid, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByUuid_First(
		String uuid, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByUuid_Last(
			String uuid, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByUuid_Last(
		String uuid, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the positionses before and after the current positions in the ordered set where uuid = &#63;.
	 *
	 * @param Positions_id the primary key of the current positions
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public static Positions[] findByUuid_PrevAndNext(
			long Positions_id, String uuid,
			OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByUuid_PrevAndNext(
			Positions_id, uuid, orderByComparator);
	}

	/**
	 * Removes all the positionses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching positionses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the matching positionses
	 */
	public static List<Positions> findByPositions_id(long Positions_id) {
		return getPersistence().findByPositions_id(Positions_id);
	}

	/**
	 * Returns a range of all the positionses where Positions_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param Positions_id the positions_id
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @return the range of matching positionses
	 */
	public static List<Positions> findByPositions_id(
		long Positions_id, int start, int end) {

		return getPersistence().findByPositions_id(Positions_id, start, end);
	}

	/**
	 * Returns an ordered range of all the positionses where Positions_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param Positions_id the positions_id
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return getPersistence().findByPositions_id(
			Positions_id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the positionses where Positions_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param Positions_id the positions_id
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPositions_id(
			Positions_id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByPositions_id_First(
			long Positions_id, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByPositions_id_First(
			Positions_id, orderByComparator);
	}

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByPositions_id_First(
		long Positions_id, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByPositions_id_First(
			Positions_id, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByPositions_id_Last(
			long Positions_id, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByPositions_id_Last(
			Positions_id, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByPositions_id_Last(
		long Positions_id, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByPositions_id_Last(
			Positions_id, orderByComparator);
	}

	/**
	 * Removes all the positionses where Positions_id = &#63; from the database.
	 *
	 * @param Positions_id the positions_id
	 */
	public static void removeByPositions_id(long Positions_id) {
		getPersistence().removeByPositions_id(Positions_id);
	}

	/**
	 * Returns the number of positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the number of matching positionses
	 */
	public static int countByPositions_id(long Positions_id) {
		return getPersistence().countByPositions_id(Positions_id);
	}

	/**
	 * Returns all the positionses where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @return the matching positionses
	 */
	public static List<Positions> findByIsArchive(long is_Archive) {
		return getPersistence().findByIsArchive(is_Archive);
	}

	/**
	 * Returns a range of all the positionses where is_Archive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param is_Archive the is_ archive
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @return the range of matching positionses
	 */
	public static List<Positions> findByIsArchive(
		long is_Archive, int start, int end) {

		return getPersistence().findByIsArchive(is_Archive, start, end);
	}

	/**
	 * Returns an ordered range of all the positionses where is_Archive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param is_Archive the is_ archive
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByIsArchive(
		long is_Archive, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return getPersistence().findByIsArchive(
			is_Archive, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the positionses where is_Archive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param is_Archive the is_ archive
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching positionses
	 */
	public static List<Positions> findByIsArchive(
		long is_Archive, int start, int end,
		OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByIsArchive(
			is_Archive, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByIsArchive_First(
			long is_Archive, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByIsArchive_First(
			is_Archive, orderByComparator);
	}

	/**
	 * Returns the first positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByIsArchive_First(
		long is_Archive, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByIsArchive_First(
			is_Archive, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public static Positions findByIsArchive_Last(
			long is_Archive, OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByIsArchive_Last(
			is_Archive, orderByComparator);
	}

	/**
	 * Returns the last positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public static Positions fetchByIsArchive_Last(
		long is_Archive, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().fetchByIsArchive_Last(
			is_Archive, orderByComparator);
	}

	/**
	 * Returns the positionses before and after the current positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param Positions_id the primary key of the current positions
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public static Positions[] findByIsArchive_PrevAndNext(
			long Positions_id, long is_Archive,
			OrderByComparator<Positions> orderByComparator)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByIsArchive_PrevAndNext(
			Positions_id, is_Archive, orderByComparator);
	}

	/**
	 * Removes all the positionses where is_Archive = &#63; from the database.
	 *
	 * @param is_Archive the is_ archive
	 */
	public static void removeByIsArchive(long is_Archive) {
		getPersistence().removeByIsArchive(is_Archive);
	}

	/**
	 * Returns the number of positionses where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @return the number of matching positionses
	 */
	public static int countByIsArchive(long is_Archive) {
		return getPersistence().countByIsArchive(is_Archive);
	}

	/**
	 * Caches the positions in the entity cache if it is enabled.
	 *
	 * @param positions the positions
	 */
	public static void cacheResult(Positions positions) {
		getPersistence().cacheResult(positions);
	}

	/**
	 * Caches the positionses in the entity cache if it is enabled.
	 *
	 * @param positionses the positionses
	 */
	public static void cacheResult(List<Positions> positionses) {
		getPersistence().cacheResult(positionses);
	}

	/**
	 * Creates a new positions with the primary key. Does not add the positions to the database.
	 *
	 * @param Positions_id the primary key for the new positions
	 * @return the new positions
	 */
	public static Positions create(long Positions_id) {
		return getPersistence().create(Positions_id);
	}

	/**
	 * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions that was removed
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public static Positions remove(long Positions_id)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().remove(Positions_id);
	}

	public static Positions updateImpl(Positions positions) {
		return getPersistence().updateImpl(positions);
	}

	/**
	 * Returns the positions with the primary key or throws a <code>NoSuchPositionsException</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public static Positions findByPrimaryKey(long Positions_id)
		throws DataBase.exception.NoSuchPositionsException {

		return getPersistence().findByPrimaryKey(Positions_id);
	}

	/**
	 * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions, or <code>null</code> if a positions with the primary key could not be found
	 */
	public static Positions fetchByPrimaryKey(long Positions_id) {
		return getPersistence().fetchByPrimaryKey(Positions_id);
	}

	/**
	 * Returns all the positionses.
	 *
	 * @return the positionses
	 */
	public static List<Positions> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the positionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @return the range of positionses
	 */
	public static List<Positions> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the positionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of positionses
	 */
	public static List<Positions> findAll(
		int start, int end, OrderByComparator<Positions> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the positionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of positionses
	 */
	public static List<Positions> findAll(
		int start, int end, OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the positionses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of positionses.
	 *
	 * @return the number of positionses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PositionsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PositionsPersistence, PositionsPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PositionsPersistence.class);

		ServiceTracker<PositionsPersistence, PositionsPersistence>
			serviceTracker =
				new ServiceTracker<PositionsPersistence, PositionsPersistence>(
					bundle.getBundleContext(), PositionsPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}