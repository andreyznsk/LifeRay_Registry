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

import DataBase.exception.NoSuchPositionsException;

import DataBase.model.Positions;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsUtil
 * @generated
 */
@ProviderType
public interface PositionsPersistence extends BasePersistence<Positions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PositionsUtil} to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching positionses
	 */
	public java.util.List<Positions> findByUuid(String uuid);

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
	public java.util.List<Positions> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Positions> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

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
	public java.util.List<Positions> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Returns the positionses before and after the current positions in the ordered set where uuid = &#63;.
	 *
	 * @param Positions_id the primary key of the current positions
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public Positions[] findByUuid_PrevAndNext(
			long Positions_id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Removes all the positionses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching positionses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the matching positionses
	 */
	public java.util.List<Positions> findByPositions_id(long Positions_id);

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
	public java.util.List<Positions> findByPositions_id(
		long Positions_id, int start, int end);

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
	public java.util.List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

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
	public java.util.List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByPositions_id_First(
			long Positions_id,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByPositions_id_First(
		long Positions_id,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByPositions_id_Last(
			long Positions_id,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByPositions_id_Last(
		long Positions_id,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Removes all the positionses where Positions_id = &#63; from the database.
	 *
	 * @param Positions_id the positions_id
	 */
	public void removeByPositions_id(long Positions_id);

	/**
	 * Returns the number of positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the number of matching positionses
	 */
	public int countByPositions_id(long Positions_id);

	/**
	 * Returns all the positionses where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @return the matching positionses
	 */
	public java.util.List<Positions> findByIsArchive(long is_Archive);

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
	public java.util.List<Positions> findByIsArchive(
		long is_Archive, int start, int end);

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
	public java.util.List<Positions> findByIsArchive(
		long is_Archive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

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
	public java.util.List<Positions> findByIsArchive(
		long is_Archive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByIsArchive_First(
			long is_Archive,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the first positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByIsArchive_First(
		long is_Archive,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Returns the last positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	public Positions findByIsArchive_Last(
			long is_Archive,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Returns the last positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	public Positions fetchByIsArchive_Last(
		long is_Archive,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

	/**
	 * Returns the positionses before and after the current positions in the ordered set where is_Archive = &#63;.
	 *
	 * @param Positions_id the primary key of the current positions
	 * @param is_Archive the is_ archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public Positions[] findByIsArchive_PrevAndNext(
			long Positions_id, long is_Archive,
			com.liferay.portal.kernel.util.OrderByComparator<Positions>
				orderByComparator)
		throws NoSuchPositionsException;

	/**
	 * Removes all the positionses where is_Archive = &#63; from the database.
	 *
	 * @param is_Archive the is_ archive
	 */
	public void removeByIsArchive(long is_Archive);

	/**
	 * Returns the number of positionses where is_Archive = &#63;.
	 *
	 * @param is_Archive the is_ archive
	 * @return the number of matching positionses
	 */
	public int countByIsArchive(long is_Archive);

	/**
	 * Caches the positions in the entity cache if it is enabled.
	 *
	 * @param positions the positions
	 */
	public void cacheResult(Positions positions);

	/**
	 * Caches the positionses in the entity cache if it is enabled.
	 *
	 * @param positionses the positionses
	 */
	public void cacheResult(java.util.List<Positions> positionses);

	/**
	 * Creates a new positions with the primary key. Does not add the positions to the database.
	 *
	 * @param Positions_id the primary key for the new positions
	 * @return the new positions
	 */
	public Positions create(long Positions_id);

	/**
	 * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions that was removed
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public Positions remove(long Positions_id) throws NoSuchPositionsException;

	public Positions updateImpl(Positions positions);

	/**
	 * Returns the positions with the primary key or throws a <code>NoSuchPositionsException</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	public Positions findByPrimaryKey(long Positions_id)
		throws NoSuchPositionsException;

	/**
	 * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions, or <code>null</code> if a positions with the primary key could not be found
	 */
	public Positions fetchByPrimaryKey(long Positions_id);

	/**
	 * Returns all the positionses.
	 *
	 * @return the positionses
	 */
	public java.util.List<Positions> findAll();

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
	public java.util.List<Positions> findAll(int start, int end);

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
	public java.util.List<Positions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator);

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
	public java.util.List<Positions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Positions>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the positionses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of positionses.
	 *
	 * @return the number of positionses
	 */
	public int countAll();

}