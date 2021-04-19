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

package DataBase.service.persistence.impl;

import DataBase.exception.NoSuchPositionsException;

import DataBase.model.Positions;
import DataBase.model.impl.PositionsImpl;
import DataBase.model.impl.PositionsModelImpl;

import DataBase.service.persistence.PositionsPersistence;
import DataBase.service.persistence.impl.constants.MyPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the positions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PositionsPersistence.class)
public class PositionsPersistenceImpl
	extends BasePersistenceImpl<Positions> implements PositionsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PositionsUtil</code> to access the positions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PositionsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching positionses
	 */
	@Override
	public List<Positions> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Positions> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Positions> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Positions> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Positions> list = null;

		if (useFinderCache) {
			list = (List<Positions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Positions positions : list) {
					if (!uuid.equals(positions.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_POSITIONS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PositionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Positions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	@Override
	public Positions findByUuid_First(
			String uuid, OrderByComparator<Positions> orderByComparator)
		throws NoSuchPositionsException {

		Positions positions = fetchByUuid_First(uuid, orderByComparator);

		if (positions != null) {
			return positions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPositionsException(sb.toString());
	}

	/**
	 * Returns the first positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	@Override
	public Positions fetchByUuid_First(
		String uuid, OrderByComparator<Positions> orderByComparator) {

		List<Positions> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	@Override
	public Positions findByUuid_Last(
			String uuid, OrderByComparator<Positions> orderByComparator)
		throws NoSuchPositionsException {

		Positions positions = fetchByUuid_Last(uuid, orderByComparator);

		if (positions != null) {
			return positions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPositionsException(sb.toString());
	}

	/**
	 * Returns the last positions in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	@Override
	public Positions fetchByUuid_Last(
		String uuid, OrderByComparator<Positions> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Positions> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Positions[] findByUuid_PrevAndNext(
			long Positions_id, String uuid,
			OrderByComparator<Positions> orderByComparator)
		throws NoSuchPositionsException {

		uuid = Objects.toString(uuid, "");

		Positions positions = findByPrimaryKey(Positions_id);

		Session session = null;

		try {
			session = openSession();

			Positions[] array = new PositionsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, positions, uuid, orderByComparator, true);

			array[1] = positions;

			array[2] = getByUuid_PrevAndNext(
				session, positions, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Positions getByUuid_PrevAndNext(
		Session session, Positions positions, String uuid,
		OrderByComparator<Positions> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_POSITIONS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(PositionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(positions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Positions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the positionses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Positions positions :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(positions);
		}
	}

	/**
	 * Returns the number of positionses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching positionses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_POSITIONS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"positions.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(positions.uuid IS NULL OR positions.uuid = '')";

	private FinderPath _finderPathWithPaginationFindByPositions_id;
	private FinderPath _finderPathWithoutPaginationFindByPositions_id;
	private FinderPath _finderPathCountByPositions_id;

	/**
	 * Returns all the positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the matching positionses
	 */
	@Override
	public List<Positions> findByPositions_id(long Positions_id) {
		return findByPositions_id(
			Positions_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Positions> findByPositions_id(
		long Positions_id, int start, int end) {

		return findByPositions_id(Positions_id, start, end, null);
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
	@Override
	public List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		OrderByComparator<Positions> orderByComparator) {

		return findByPositions_id(
			Positions_id, start, end, orderByComparator, true);
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
	@Override
	public List<Positions> findByPositions_id(
		long Positions_id, int start, int end,
		OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByPositions_id;
				finderArgs = new Object[] {Positions_id};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByPositions_id;
			finderArgs = new Object[] {
				Positions_id, start, end, orderByComparator
			};
		}

		List<Positions> list = null;

		if (useFinderCache) {
			list = (List<Positions>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Positions positions : list) {
					if (Positions_id != positions.getPositions_id()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_POSITIONS_WHERE);

			sb.append(_FINDER_COLUMN_POSITIONS_ID_POSITIONS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PositionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Positions_id);

				list = (List<Positions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	@Override
	public Positions findByPositions_id_First(
			long Positions_id, OrderByComparator<Positions> orderByComparator)
		throws NoSuchPositionsException {

		Positions positions = fetchByPositions_id_First(
			Positions_id, orderByComparator);

		if (positions != null) {
			return positions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Positions_id=");
		sb.append(Positions_id);

		sb.append("}");

		throw new NoSuchPositionsException(sb.toString());
	}

	/**
	 * Returns the first positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching positions, or <code>null</code> if a matching positions could not be found
	 */
	@Override
	public Positions fetchByPositions_id_First(
		long Positions_id, OrderByComparator<Positions> orderByComparator) {

		List<Positions> list = findByPositions_id(
			Positions_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions
	 * @throws NoSuchPositionsException if a matching positions could not be found
	 */
	@Override
	public Positions findByPositions_id_Last(
			long Positions_id, OrderByComparator<Positions> orderByComparator)
		throws NoSuchPositionsException {

		Positions positions = fetchByPositions_id_Last(
			Positions_id, orderByComparator);

		if (positions != null) {
			return positions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("Positions_id=");
		sb.append(Positions_id);

		sb.append("}");

		throw new NoSuchPositionsException(sb.toString());
	}

	/**
	 * Returns the last positions in the ordered set where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching positions, or <code>null</code> if a matching positions could not be found
	 */
	@Override
	public Positions fetchByPositions_id_Last(
		long Positions_id, OrderByComparator<Positions> orderByComparator) {

		int count = countByPositions_id(Positions_id);

		if (count == 0) {
			return null;
		}

		List<Positions> list = findByPositions_id(
			Positions_id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the positionses where Positions_id = &#63; from the database.
	 *
	 * @param Positions_id the positions_id
	 */
	@Override
	public void removeByPositions_id(long Positions_id) {
		for (Positions positions :
				findByPositions_id(
					Positions_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(positions);
		}
	}

	/**
	 * Returns the number of positionses where Positions_id = &#63;.
	 *
	 * @param Positions_id the positions_id
	 * @return the number of matching positionses
	 */
	@Override
	public int countByPositions_id(long Positions_id) {
		FinderPath finderPath = _finderPathCountByPositions_id;

		Object[] finderArgs = new Object[] {Positions_id};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_POSITIONS_WHERE);

			sb.append(_FINDER_COLUMN_POSITIONS_ID_POSITIONS_ID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(Positions_id);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_POSITIONS_ID_POSITIONS_ID_2 =
		"positions.Positions_id = ?";

	public PositionsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Positions.class);

		setModelImplClass(PositionsImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the positions in the entity cache if it is enabled.
	 *
	 * @param positions the positions
	 */
	@Override
	public void cacheResult(Positions positions) {
		entityCache.putResult(
			PositionsImpl.class, positions.getPrimaryKey(), positions);
	}

	/**
	 * Caches the positionses in the entity cache if it is enabled.
	 *
	 * @param positionses the positionses
	 */
	@Override
	public void cacheResult(List<Positions> positionses) {
		for (Positions positions : positionses) {
			if (entityCache.getResult(
					PositionsImpl.class, positions.getPrimaryKey()) == null) {

				cacheResult(positions);
			}
		}
	}

	/**
	 * Clears the cache for all positionses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PositionsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the positions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Positions positions) {
		entityCache.removeResult(PositionsImpl.class, positions);
	}

	@Override
	public void clearCache(List<Positions> positionses) {
		for (Positions positions : positionses) {
			entityCache.removeResult(PositionsImpl.class, positions);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PositionsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new positions with the primary key. Does not add the positions to the database.
	 *
	 * @param Positions_id the primary key for the new positions
	 * @return the new positions
	 */
	@Override
	public Positions create(long Positions_id) {
		Positions positions = new PositionsImpl();

		positions.setNew(true);
		positions.setPrimaryKey(Positions_id);

		String uuid = PortalUUIDUtil.generate();

		positions.setUuid(uuid);

		return positions;
	}

	/**
	 * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions that was removed
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	@Override
	public Positions remove(long Positions_id) throws NoSuchPositionsException {
		return remove((Serializable)Positions_id);
	}

	/**
	 * Removes the positions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the positions
	 * @return the positions that was removed
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	@Override
	public Positions remove(Serializable primaryKey)
		throws NoSuchPositionsException {

		Session session = null;

		try {
			session = openSession();

			Positions positions = (Positions)session.get(
				PositionsImpl.class, primaryKey);

			if (positions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPositionsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(positions);
		}
		catch (NoSuchPositionsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Positions removeImpl(Positions positions) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(positions)) {
				positions = (Positions)session.get(
					PositionsImpl.class, positions.getPrimaryKeyObj());
			}

			if (positions != null) {
				session.delete(positions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (positions != null) {
			clearCache(positions);
		}

		return positions;
	}

	@Override
	public Positions updateImpl(Positions positions) {
		boolean isNew = positions.isNew();

		if (!(positions instanceof PositionsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(positions.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(positions);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in positions proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Positions implementation " +
					positions.getClass());
		}

		PositionsModelImpl positionsModelImpl = (PositionsModelImpl)positions;

		if (Validator.isNull(positions.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			positions.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(positions);
			}
			else {
				positions = (Positions)session.merge(positions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PositionsImpl.class, positionsModelImpl, false, true);

		if (isNew) {
			positions.setNew(false);
		}

		positions.resetOriginalValues();

		return positions;
	}

	/**
	 * Returns the positions with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the positions
	 * @return the positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	@Override
	public Positions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPositionsException {

		Positions positions = fetchByPrimaryKey(primaryKey);

		if (positions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPositionsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return positions;
	}

	/**
	 * Returns the positions with the primary key or throws a <code>NoSuchPositionsException</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions
	 * @throws NoSuchPositionsException if a positions with the primary key could not be found
	 */
	@Override
	public Positions findByPrimaryKey(long Positions_id)
		throws NoSuchPositionsException {

		return findByPrimaryKey((Serializable)Positions_id);
	}

	/**
	 * Returns the positions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions, or <code>null</code> if a positions with the primary key could not be found
	 */
	@Override
	public Positions fetchByPrimaryKey(long Positions_id) {
		return fetchByPrimaryKey((Serializable)Positions_id);
	}

	/**
	 * Returns all the positionses.
	 *
	 * @return the positionses
	 */
	@Override
	public List<Positions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Positions> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Positions> findAll(
		int start, int end, OrderByComparator<Positions> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Positions> findAll(
		int start, int end, OrderByComparator<Positions> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Positions> list = null;

		if (useFinderCache) {
			list = (List<Positions>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_POSITIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_POSITIONS;

				sql = sql.concat(PositionsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Positions>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the positionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Positions positions : findAll()) {
			remove(positions);
		}
	}

	/**
	 * Returns the number of positionses.
	 *
	 * @return the number of positionses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_POSITIONS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "Positions_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_POSITIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PositionsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the positions persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new PositionsModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Positions.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindByPositions_id = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPositions_id",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"Positions_id"}, true);

		_finderPathWithoutPaginationFindByPositions_id = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPositions_id",
			new String[] {Long.class.getName()}, new String[] {"Positions_id"},
			true);

		_finderPathCountByPositions_id = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPositions_id",
			new String[] {Long.class.getName()}, new String[] {"Positions_id"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PositionsImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = MyPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MyPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_POSITIONS =
		"SELECT positions FROM Positions positions";

	private static final String _SQL_SELECT_POSITIONS_WHERE =
		"SELECT positions FROM Positions positions WHERE ";

	private static final String _SQL_COUNT_POSITIONS =
		"SELECT COUNT(positions) FROM Positions positions";

	private static final String _SQL_COUNT_POSITIONS_WHERE =
		"SELECT COUNT(positions) FROM Positions positions WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "positions.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Positions exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Positions exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PositionsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class PositionsModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			PositionsModelImpl positionsModelImpl =
				(PositionsModelImpl)baseModel;

			long columnBitmask = positionsModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(positionsModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						positionsModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(positionsModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			PositionsModelImpl positionsModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = positionsModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = positionsModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}