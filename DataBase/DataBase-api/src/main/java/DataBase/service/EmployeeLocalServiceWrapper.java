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

package DataBase.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalService
 * @generated
 */
public class EmployeeLocalServiceWrapper
	implements EmployeeLocalService, ServiceWrapper<EmployeeLocalService> {

	public EmployeeLocalServiceWrapper(
		EmployeeLocalService employeeLocalService) {

		_employeeLocalService = employeeLocalService;
	}

	/**
	 * Adds the employee to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was added
	 */
	@Override
	public DataBase.model.Employee addEmployee(
		DataBase.model.Employee employee) {

		return _employeeLocalService.addEmployee(employee);
	}

	@Override
	public DataBase.model.Employee addEmployee(
			long userId, String[] strings, java.util.Date[] dates,
			long[] numbers,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.addEmployee(
			userId, strings, dates, numbers, serviceContext);
	}

	/**
	 * Creates a new employee with the primary key. Does not add the employee to the database.
	 *
	 * @param Prson_id the primary key for the new employee
	 * @return the new employee
	 */
	@Override
	public DataBase.model.Employee createEmployee(long Prson_id) {
		return _employeeLocalService.createEmployee(Prson_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the employee from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was removed
	 */
	@Override
	public DataBase.model.Employee deleteEmployee(
		DataBase.model.Employee employee) {

		return _employeeLocalService.deleteEmployee(employee);
	}

	/**
	 * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Prson_id the primary key of the employee
	 * @return the employee that was removed
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	@Override
	public DataBase.model.Employee deleteEmployee(long Prson_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.deleteEmployee(Prson_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _employeeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _employeeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _employeeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public DataBase.model.Employee fetchEmployee(long Prson_id) {
		return _employeeLocalService.fetchEmployee(Prson_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _employeeLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<DataBase.model.Employee> getEmpByBank(long bankId) {
		return _employeeLocalService.getEmpByBank(bankId);
	}

	@Override
	public java.util.List<DataBase.model.Employee> getEmpByPosition(long id) {
		return _employeeLocalService.getEmpByPosition(id);
	}

	/**
	 * Returns the employee with the primary key.
	 *
	 * @param Prson_id the primary key of the employee
	 * @return the employee
	 * @throws PortalException if a employee with the primary key could not be found
	 */
	@Override
	public DataBase.model.Employee getEmployee(long Prson_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.getEmployee(Prson_id);
	}

	/**
	 * Returns a range of all the employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.EmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employees
	 * @param end the upper bound of the range of employees (not inclusive)
	 * @return the range of employees
	 */
	@Override
	public java.util.List<DataBase.model.Employee> getEmployees(
		int start, int end) {

		return _employeeLocalService.getEmployees(start, end);
	}

	/**
	 * Returns the number of employees.
	 *
	 * @return the number of employees
	 */
	@Override
	public int getEmployeesCount() {
		return _employeeLocalService.getEmployeesCount();
	}

	@Override
	public java.util.List<DataBase.model.Employee> getEntries(long employeeId) {
		return _employeeLocalService.getEntries(employeeId);
	}

	@Override
	public java.util.List<DataBase.model.Employee> getEntries(
			long employeeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _employeeLocalService.getEntries(employeeId, start, end);
	}

	@Override
	public java.util.List<DataBase.model.Employee> getEntries(
		long employeeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DataBase.model.Employee> obc) {

		return _employeeLocalService.getEntries(employeeId, start, end, obc);
	}

	@Override
	public int getEntriesCount(long employeeId) {
		return _employeeLocalService.getEntriesCount(employeeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _employeeLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<DataBase.model.Employee> getNotAchiveEmployee(
		int isArchived, int start, int end) {

		return _employeeLocalService.getNotAchiveEmployee(
			isArchived, start, end);
	}

	@Override
	public java.util.List<DataBase.model.Employee> getNotArchivedEmployee(
		long isArchived, int start, int end) {

		return _employeeLocalService.getNotArchivedEmployee(
			isArchived, start, end);
	}

	@Override
	public java.util.List<DataBase.model.Employee> getNotArchiveEmployee(
		int isArchived, int start, int end) {

		return _employeeLocalService.getNotArchiveEmployee(
			isArchived, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void recoverEmployee(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_employeeLocalService.recoverEmployee(id);
	}

	/**
	 * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EmployeeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param employee the employee
	 * @return the employee that was updated
	 */
	@Override
	public DataBase.model.Employee updateEmployee(
		DataBase.model.Employee employee) {

		return _employeeLocalService.updateEmployee(employee);
	}

	@Override
	public void updateEmployee(
			long userId, String[] strings, java.util.Date[] dates,
			long[] numbers,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws DataBase.exception.NoSuchEmployeeException {

		_employeeLocalService.updateEmployee(
			userId, strings, dates, numbers, serviceContext);
	}

	@Override
	public EmployeeLocalService getWrappedService() {
		return _employeeLocalService;
	}

	@Override
	public void setWrappedService(EmployeeLocalService employeeLocalService) {
		_employeeLocalService = employeeLocalService;
	}

	private EmployeeLocalService _employeeLocalService;

}