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

import DataBase.model.Bank;

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
 * The persistence utility for the bank service. This utility wraps <code>DataBase.service.persistence.impl.BankPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BankPersistence
 * @generated
 */
public class BankUtil {

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
	public static void clearCache(Bank bank) {
		getPersistence().clearCache(bank);
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
	public static Map<Serializable, Bank> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Bank> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bank> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bank> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Bank> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Bank update(Bank bank) {
		return getPersistence().update(bank);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Bank update(Bank bank, ServiceContext serviceContext) {
		return getPersistence().update(bank, serviceContext);
	}

	/**
	 * Returns all the banks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching banks
	 */
	public static List<Bank> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @return the range of matching banks
	 */
	public static List<Bank> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching banks
	 */
	public static List<Bank> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bank> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the banks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching banks
	 */
	public static List<Bank> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Bank> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public static Bank findByUuid_First(
			String uuid, OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public static Bank fetchByUuid_First(
		String uuid, OrderByComparator<Bank> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public static Bank findByUuid_Last(
			String uuid, OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last bank in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public static Bank fetchByUuid_Last(
		String uuid, OrderByComparator<Bank> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the banks before and after the current bank in the ordered set where uuid = &#63;.
	 *
	 * @param Bank_id the primary key of the current bank
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bank
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public static Bank[] findByUuid_PrevAndNext(
			long Bank_id, String uuid,
			OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByUuid_PrevAndNext(
			Bank_id, uuid, orderByComparator);
	}

	/**
	 * Removes all the banks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of banks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching banks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the banks where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @return the matching banks
	 */
	public static List<Bank> findByBankName(String BankName) {
		return getPersistence().findByBankName(BankName);
	}

	/**
	 * Returns a range of all the banks where BankName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param BankName the bank name
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @return the range of matching banks
	 */
	public static List<Bank> findByBankName(
		String BankName, int start, int end) {

		return getPersistence().findByBankName(BankName, start, end);
	}

	/**
	 * Returns an ordered range of all the banks where BankName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param BankName the bank name
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching banks
	 */
	public static List<Bank> findByBankName(
		String BankName, int start, int end,
		OrderByComparator<Bank> orderByComparator) {

		return getPersistence().findByBankName(
			BankName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the banks where BankName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param BankName the bank name
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching banks
	 */
	public static List<Bank> findByBankName(
		String BankName, int start, int end,
		OrderByComparator<Bank> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByBankName(
			BankName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first bank in the ordered set where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public static Bank findByBankName_First(
			String BankName, OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByBankName_First(
			BankName, orderByComparator);
	}

	/**
	 * Returns the first bank in the ordered set where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public static Bank fetchByBankName_First(
		String BankName, OrderByComparator<Bank> orderByComparator) {

		return getPersistence().fetchByBankName_First(
			BankName, orderByComparator);
	}

	/**
	 * Returns the last bank in the ordered set where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank
	 * @throws NoSuchBankException if a matching bank could not be found
	 */
	public static Bank findByBankName_Last(
			String BankName, OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByBankName_Last(
			BankName, orderByComparator);
	}

	/**
	 * Returns the last bank in the ordered set where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bank, or <code>null</code> if a matching bank could not be found
	 */
	public static Bank fetchByBankName_Last(
		String BankName, OrderByComparator<Bank> orderByComparator) {

		return getPersistence().fetchByBankName_Last(
			BankName, orderByComparator);
	}

	/**
	 * Returns the banks before and after the current bank in the ordered set where BankName = &#63;.
	 *
	 * @param Bank_id the primary key of the current bank
	 * @param BankName the bank name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bank
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public static Bank[] findByBankName_PrevAndNext(
			long Bank_id, String BankName,
			OrderByComparator<Bank> orderByComparator)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByBankName_PrevAndNext(
			Bank_id, BankName, orderByComparator);
	}

	/**
	 * Removes all the banks where BankName = &#63; from the database.
	 *
	 * @param BankName the bank name
	 */
	public static void removeByBankName(String BankName) {
		getPersistence().removeByBankName(BankName);
	}

	/**
	 * Returns the number of banks where BankName = &#63;.
	 *
	 * @param BankName the bank name
	 * @return the number of matching banks
	 */
	public static int countByBankName(String BankName) {
		return getPersistence().countByBankName(BankName);
	}

	/**
	 * Caches the bank in the entity cache if it is enabled.
	 *
	 * @param bank the bank
	 */
	public static void cacheResult(Bank bank) {
		getPersistence().cacheResult(bank);
	}

	/**
	 * Caches the banks in the entity cache if it is enabled.
	 *
	 * @param banks the banks
	 */
	public static void cacheResult(List<Bank> banks) {
		getPersistence().cacheResult(banks);
	}

	/**
	 * Creates a new bank with the primary key. Does not add the bank to the database.
	 *
	 * @param Bank_id the primary key for the new bank
	 * @return the new bank
	 */
	public static Bank create(long Bank_id) {
		return getPersistence().create(Bank_id);
	}

	/**
	 * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Bank_id the primary key of the bank
	 * @return the bank that was removed
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public static Bank remove(long Bank_id)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().remove(Bank_id);
	}

	public static Bank updateImpl(Bank bank) {
		return getPersistence().updateImpl(bank);
	}

	/**
	 * Returns the bank with the primary key or throws a <code>NoSuchBankException</code> if it could not be found.
	 *
	 * @param Bank_id the primary key of the bank
	 * @return the bank
	 * @throws NoSuchBankException if a bank with the primary key could not be found
	 */
	public static Bank findByPrimaryKey(long Bank_id)
		throws DataBase.exception.NoSuchBankException {

		return getPersistence().findByPrimaryKey(Bank_id);
	}

	/**
	 * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Bank_id the primary key of the bank
	 * @return the bank, or <code>null</code> if a bank with the primary key could not be found
	 */
	public static Bank fetchByPrimaryKey(long Bank_id) {
		return getPersistence().fetchByPrimaryKey(Bank_id);
	}

	/**
	 * Returns all the banks.
	 *
	 * @return the banks
	 */
	public static List<Bank> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @return the range of banks
	 */
	public static List<Bank> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of banks
	 */
	public static List<Bank> findAll(
		int start, int end, OrderByComparator<Bank> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the banks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BankModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of banks
	 * @param end the upper bound of the range of banks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of banks
	 */
	public static List<Bank> findAll(
		int start, int end, OrderByComparator<Bank> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the banks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of banks.
	 *
	 * @return the number of banks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BankPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BankPersistence, BankPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(BankPersistence.class);

		ServiceTracker<BankPersistence, BankPersistence> serviceTracker =
			new ServiceTracker<BankPersistence, BankPersistence>(
				bundle.getBundleContext(), BankPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}