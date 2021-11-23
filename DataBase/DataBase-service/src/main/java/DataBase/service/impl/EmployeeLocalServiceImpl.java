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

package DataBase.service.impl;

import DataBase.exception.NoSuchEmployeeException;
import DataBase.model.Employee;
import DataBase.service.base.EmployeeLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>DataBase.service.EmployeeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=DataBase.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {


	public List<Employee> getNotArchiveEmployee(int isArchived, int start, int end){
		System.out.println("is archived:" + isArchived);
		return employeePersistence.findByIsArchive(isArchived,start,end);
	}

	public Employee addEmployee(
			long userId,
			String[] strings,
			Date[] dates,
			long[] numbers,
			ServiceContext serviceContext)
			throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);
		System.out.println("user: " + user);
		long employeeId = getEmployeesCount() + 1;
		Employee employee = employeePersistence.create(employeeId);

		employee.setUuid(serviceContext.getUuid());
		employee.setFirstName(strings[0]);
		employee.setLastName(strings[1]);
		employee.setPatronymic(strings[2]);
		employee.setDate_of_birth(dates[0]);
		employee.setDate_of_start_work(dates[1]);
		employee.setHomeNumber(numbers[0]);
		employee.setWorkNumber(numbers[1]);

		employee.setExpandoBridgeAttributes(serviceContext);

		employeePersistence.update(employee);

		return employee;

	}
	public List<Employee> getEntries(long employeeId) {
		return employeePersistence.findByPrson_id(employeeId);
	}

	public List<Employee> getEntries(long employeeId, int start, int end)
			throws SystemException {

		return employeePersistence.findByPrson_id(employeeId, start,  end );
	}

	public List<Employee> getEntries(
			 long employeeId, int start, int end, OrderByComparator<Employee> obc) {

		return employeePersistence.findByPrson_id(employeeId, start, end, obc);
	}

	public int getEntriesCount(long employeeId) {
		return employeePersistence.countByPrson_id(employeeId);
	}


	public List<Employee> getEmpByBank(long bankId) {
		List<Employee> employees = new ArrayList<>();
		List<Employee> empTemp = employeePersistence.findAll();
		for (Employee employee : empTemp) {
			if(employee.getBank_id() == bankId) employees.add(employee);
		}
		return employees;
	}

	public void updateEmployee(long userId, String[] strings, Date[] dates, long[] numbers, ServiceContext serviceContext) throws NoSuchEmployeeException {

		Employee employee = employeePersistence.findByPrimaryKey(userId);

		employee.setUuid(serviceContext.getUuid());
		employee.setFirstName(strings[0]);
		employee.setLastName(strings[1]);
		employee.setPatronymic(strings[2]);
		employee.setDate_of_birth(dates[0]);
		employee.setDate_of_start_work(dates[1]);
		employee.setHomeNumber(numbers[0]);
		employee.setWorkNumber(numbers[1]);
		employee.setBank_id(numbers[2]);
		employee.setPosition_Id(numbers[3]);


		employee.setExpandoBridgeAttributes(serviceContext);

		employeePersistence.update(employee);

	}

	@Override
	public List<Employee> getNotArchivedEmployee(long isArchived, int start, int end) {
		return employeePersistence.findByIsArchive(isArchived);
	}

	public Employee deleteEmployee(long Prson_id) throws PortalException{
		System.out.println(Prson_id);
		Employee employee = employeePersistence.findByPrimaryKey(Prson_id);
		employee.setIsArchive(1);
		employeePersistence.update(employee);
		return employee;
	}


	public void recoverEmployee(long id) throws PortalException{
		System.out.println(id);
		Employee employee = employeePersistence.findByPrimaryKey(id);
		employee.setIsArchive(0);
		employeePersistence.update(employee);
	}

	@Override
	public List<Employee> getNotAchiveEmployee(int isArchived, int start, int end) {
		return employeePersistence.findByIsArchive(isArchived, start, end);
	}

	@Override
	public List<Employee> getEmpByPosition(long id) {
		return employeePersistence.findByPosition_Id(id,-1,-1);
	}

	protected void validate(String name, String entry)
			throws PortalException {

		/*if (Validator.isNull(name)) {
			throw new EntryNameException();
		}*/
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>DataBase.service.EmployeeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>DataBase.service.EmployeeLocalServiceUtil</code>.
	 */
}