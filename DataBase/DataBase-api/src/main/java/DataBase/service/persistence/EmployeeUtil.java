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

import DataBase.model.Employee;

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
 * The persistence utility for the employee service. This utility wraps <code>DataBase.service.persistence.impl.EmployeePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeePersistence
 * @generated
 */
public class EmployeeUtil {

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
	public static void clearCache(Employee employee) {
		getPersistence().clearCache(employee);
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
	public static Map<Serializable, Employee> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Employee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Employee update(Employee employee) {
		return getPersistence().update(employee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Employee update(
		Employee employee, ServiceContext serviceContext) {

		return getPersistence().update(employee, serviceContext);
	}

	/**
	 * Returns all the employees where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching employees
	 */
	public static List<Employee> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_First(
			String uuid, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_First(
		String uuid, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByUuid_Last(
			String uuid, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByUuid_Last(
		String uuid, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where uuid = &#63;.
	 *
	 * @param Prson_id the primary key of the current employee
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByUuid_PrevAndNext(
			long Prson_id, String uuid,
			OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByUuid_PrevAndNext(
			Prson_id, uuid, orderByComparator);
	}

	/**
	 * Removes all the employees where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of employees where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching employees
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the employees where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @return the matching employees
	 */
	public static List<Employee> findByPrson_id(long Prson_id) {
		return getPersistence().findByPrson_id(Prson_id);
	}

	/**
	 * Returns a range of all the employees where Prson_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Prson_id the prson_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByPrson_id(
		long Prson_id, int start, int end) {

		return getPersistence().findByPrson_id(Prson_id, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where Prson_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Prson_id the prson_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByPrson_id(
		long Prson_id, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByPrson_id(
			Prson_id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where Prson_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Prson_id the prson_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByPrson_id(
		long Prson_id, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPrson_id(
			Prson_id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByPrson_id_First(
			long Prson_id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPrson_id_First(
			Prson_id, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByPrson_id_First(
		long Prson_id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByPrson_id_First(
			Prson_id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByPrson_id_Last(
			long Prson_id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPrson_id_Last(
			Prson_id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByPrson_id_Last(
		long Prson_id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByPrson_id_Last(
			Prson_id, orderByComparator);
	}

	/**
	 * Removes all the employees where Prson_id = &#63; from the database.
	 *
	 * @param Prson_id the prson_id
	 */
	public static void removeByPrson_id(long Prson_id) {
		getPersistence().removeByPrson_id(Prson_id);
	}

	/**
	 * Returns the number of employees where Prson_id = &#63;.
	 *
	 * @param Prson_id the prson_id
	 * @return the number of matching employees
	 */
	public static int countByPrson_id(long Prson_id) {
		return getPersistence().countByPrson_id(Prson_id);
	}

	/**
	 * Returns all the employees where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @return the matching employees
	 */
	public static List<Employee> findByIsArchive(long IsArchive) {
		return getPersistence().findByIsArchive(IsArchive);
	}

	/**
	 * Returns a range of all the employees where IsArchive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param IsArchive the is archive
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByIsArchive(
		long IsArchive, int start, int end) {

		return getPersistence().findByIsArchive(IsArchive, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where IsArchive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param IsArchive the is archive
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByIsArchive(
		long IsArchive, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByIsArchive(
			IsArchive, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where IsArchive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param IsArchive the is archive
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByIsArchive(
		long IsArchive, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByIsArchive(
			IsArchive, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByIsArchive_First(
			long IsArchive, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByIsArchive_First(
			IsArchive, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByIsArchive_First(
		long IsArchive, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByIsArchive_First(
			IsArchive, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByIsArchive_Last(
			long IsArchive, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByIsArchive_Last(
			IsArchive, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByIsArchive_Last(
		long IsArchive, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByIsArchive_Last(
			IsArchive, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where IsArchive = &#63;.
	 *
	 * @param Prson_id the primary key of the current employee
	 * @param IsArchive the is archive
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByIsArchive_PrevAndNext(
			long Prson_id, long IsArchive,
			OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByIsArchive_PrevAndNext(
			Prson_id, IsArchive, orderByComparator);
	}

	/**
	 * Removes all the employees where IsArchive = &#63; from the database.
	 *
	 * @param IsArchive the is archive
	 */
	public static void removeByIsArchive(long IsArchive) {
		getPersistence().removeByIsArchive(IsArchive);
	}

	/**
	 * Returns the number of employees where IsArchive = &#63;.
	 *
	 * @param IsArchive the is archive
	 * @return the number of matching employees
	 */
	public static int countByIsArchive(long IsArchive) {
		return getPersistence().countByIsArchive(IsArchive);
	}

	/**
	 * Returns all the employees where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @return the matching employees
	 */
	public static List<Employee> findByBank_id(long Bank_id) {
		return getPersistence().findByBank_id(Bank_id);
	}

	/**
	 * Returns a range of all the employees where Bank_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Bank_id the bank_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByBank_id(
		long Bank_id, int start, int end) {

		return getPersistence().findByBank_id(Bank_id, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where Bank_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Bank_id the bank_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByBank_id(
		long Bank_id, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByBank_id(
			Bank_id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where Bank_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Bank_id the bank_id
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByBank_id(
		long Bank_id, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByBank_id(
			Bank_id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByBank_id_First(
			long Bank_id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByBank_id_First(Bank_id, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByBank_id_First(
		long Bank_id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByBank_id_First(
			Bank_id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByBank_id_Last(
			long Bank_id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByBank_id_Last(Bank_id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByBank_id_Last(
		long Bank_id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByBank_id_Last(Bank_id, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where Bank_id = &#63;.
	 *
	 * @param Prson_id the primary key of the current employee
	 * @param Bank_id the bank_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByBank_id_PrevAndNext(
			long Prson_id, long Bank_id,
			OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByBank_id_PrevAndNext(
			Prson_id, Bank_id, orderByComparator);
	}

	/**
	 * Removes all the employees where Bank_id = &#63; from the database.
	 *
	 * @param Bank_id the bank_id
	 */
	public static void removeByBank_id(long Bank_id) {
		getPersistence().removeByBank_id(Bank_id);
	}

	/**
	 * Returns the number of employees where Bank_id = &#63;.
	 *
	 * @param Bank_id the bank_id
	 * @return the number of matching employees
	 */
	public static int countByBank_id(long Bank_id) {
		return getPersistence().countByBank_id(Bank_id);
	}

	/**
	 * Returns all the employees where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @return the matching employees
	 */
	public static List<Employee> findByPosition_Id(long Position_Id) {
		return getPersistence().findByPosition_Id(Position_Id);
	}

	/**
	 * Returns a range of all the employees where Position_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Position_Id the position_ ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of matching employees
	 */
	public static List<Employee> findByPosition_Id(
		long Position_Id, int start, int end) {

		return getPersistence().findByPosition_Id(Position_Id, start, end);
	}

	/**
	 * Returns an ordered range of all the employees where Position_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Position_Id the position_ ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByPosition_Id(
		long Position_Id, int start, int end,
		OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findByPosition_Id(
			Position_Id, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees where Position_Id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param Position_Id the position_ ID
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching employees
	 */
	public static List<Employee> findByPosition_Id(
		long Position_Id, int start, int end,
		OrderByComparator<Employee> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByPosition_Id(
			Position_Id, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first employee in the ordered set where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByPosition_Id_First(
			long Position_Id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPosition_Id_First(
			Position_Id, orderByComparator);
	}

	/**
	 * Returns the first employee in the ordered set where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByPosition_Id_First(
		long Position_Id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByPosition_Id_First(
			Position_Id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee
	 * @throws NoSuchEmployeeException if a matching employee could not be found
	 */
	public static Employee findByPosition_Id_Last(
			long Position_Id, OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPosition_Id_Last(
			Position_Id, orderByComparator);
	}

	/**
	 * Returns the last employee in the ordered set where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching employee, or <code>null</code> if a matching employee could not be found
	 */
	public static Employee fetchByPosition_Id_Last(
		long Position_Id, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().fetchByPosition_Id_Last(
			Position_Id, orderByComparator);
	}

	/**
	 * Returns the employees before and after the current employee in the ordered set where Position_Id = &#63;.
	 *
	 * @param Prson_id the primary key of the current employee
	 * @param Position_Id the position_ ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee[] findByPosition_Id_PrevAndNext(
			long Prson_id, long Position_Id,
			OrderByComparator<Employee> orderByComparator)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPosition_Id_PrevAndNext(
			Prson_id, Position_Id, orderByComparator);
	}

	/**
	 * Removes all the employees where Position_Id = &#63; from the database.
	 *
	 * @param Position_Id the position_ ID
	 */
	public static void removeByPosition_Id(long Position_Id) {
		getPersistence().removeByPosition_Id(Position_Id);
	}

	/**
	 * Returns the number of employees where Position_Id = &#63;.
	 *
	 * @param Position_Id the position_ ID
	 * @return the number of matching employees
	 */
	public static int countByPosition_Id(long Position_Id) {
		return getPersistence().countByPosition_Id(Position_Id);
	}

	/**
	 * Caches the employee in the entity cache if it is enabled.
	 *
	 * @param employee the employee
	 */
	public static void cacheResult(Employee employee) {
		getPersistence().cacheResult(employee);
	}

	/**
	 * Caches the employees in the entity cache if it is enabled.
	 *
	 * @param employees the employees
	 */
	public static void cacheResult(List<Employee> employees) {
		getPersistence().cacheResult(employees);
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param Prson_id the primary key for the new employee
	 * @return the new employee
	 */
	public static Employee create(long Prson_id) {
		return getPersistence().create(Prson_id);
	}

	/**
	 * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Prson_id the primary key of the employee
	 * @return the employee that was removed
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee remove(long Prson_id)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().remove(Prson_id);
	}

	public static Employee updateImpl(Employee employee) {
		return getPersistence().updateImpl(employee);
	}

	/**
	 * Returns the employee with the primary key or throws a <code>NoSuchEmployeeException</code> if it could not be found.
	 *
	 * @param Prson_id the primary key of the employee
	 * @return the employee
	 * @throws NoSuchEmployeeException if a employee with the primary key could not be found
	 */
	public static Employee findByPrimaryKey(long Prson_id)
		throws DataBase.exception.NoSuchEmployeeException {

		return getPersistence().findByPrimaryKey(Prson_id);
	}

	/**
	 * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Prson_id the primary key of the employee
	 * @return the employee, or <code>null</code> if a employee with the primary key could not be found
	 */
	public static Employee fetchByPrimaryKey(long Prson_id) {
		return getPersistence().fetchByPrimaryKey(Prson_id);
	}

	/**
	 * Returns all the employees.
	 *
	 * @return the employees
	 */
	public static List<Employee> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 */
	public static List<Employee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employees
	 */
	public static List<Employee> findAll(
		int start, int end, OrderByComparator<Employee> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employees
	 */
	public static List<Employee> findAll(
		int start, int end, OrderByComparator<Employee> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the employees from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmployeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmployeePersistence, EmployeePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(EmployeePersistence.class);

		ServiceTracker<EmployeePersistence, EmployeePersistence>
			serviceTracker =
				new ServiceTracker<EmployeePersistence, EmployeePersistence>(
					bundle.getBundleContext(), EmployeePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}