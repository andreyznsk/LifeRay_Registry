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

package DataBase.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper
	extends BaseModelWrapper<Employee>
	implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		super(employee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Prson_id", getPrson_id());
		attributes.put("LastName", getLastName());
		attributes.put("FirstName", getFirstName());
		attributes.put("Patronymic", getPatronymic());
		attributes.put("Date_of_birth", getDate_of_birth());
		attributes.put("Date_of_start_work", getDate_of_start_work());
		attributes.put("WorkNumber", getWorkNumber());
		attributes.put("Position_Id", getPosition_Id());
		attributes.put("HomeNumber", getHomeNumber());
		attributes.put("Bank_id", getBank_id());
		attributes.put("IsArchive", getIsArchive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Prson_id = (Long)attributes.get("Prson_id");

		if (Prson_id != null) {
			setPrson_id(Prson_id);
		}

		String LastName = (String)attributes.get("LastName");

		if (LastName != null) {
			setLastName(LastName);
		}

		String FirstName = (String)attributes.get("FirstName");

		if (FirstName != null) {
			setFirstName(FirstName);
		}

		String Patronymic = (String)attributes.get("Patronymic");

		if (Patronymic != null) {
			setPatronymic(Patronymic);
		}

		Date Date_of_birth = (Date)attributes.get("Date_of_birth");

		if (Date_of_birth != null) {
			setDate_of_birth(Date_of_birth);
		}

		Date Date_of_start_work = (Date)attributes.get("Date_of_start_work");

		if (Date_of_start_work != null) {
			setDate_of_start_work(Date_of_start_work);
		}

		Long WorkNumber = (Long)attributes.get("WorkNumber");

		if (WorkNumber != null) {
			setWorkNumber(WorkNumber);
		}

		Long Position_Id = (Long)attributes.get("Position_Id");

		if (Position_Id != null) {
			setPosition_Id(Position_Id);
		}

		Long HomeNumber = (Long)attributes.get("HomeNumber");

		if (HomeNumber != null) {
			setHomeNumber(HomeNumber);
		}

		Long Bank_id = (Long)attributes.get("Bank_id");

		if (Bank_id != null) {
			setBank_id(Bank_id);
		}

		Long IsArchive = (Long)attributes.get("IsArchive");

		if (IsArchive != null) {
			setIsArchive(IsArchive);
		}
	}

	/**
	 * Returns the bank_id of this employee.
	 *
	 * @return the bank_id of this employee
	 */
	@Override
	public long getBank_id() {
		return model.getBank_id();
	}

	/**
	 * Returns the date_of_birth of this employee.
	 *
	 * @return the date_of_birth of this employee
	 */
	@Override
	public Date getDate_of_birth() {
		return model.getDate_of_birth();
	}

	/**
	 * Returns the date_of_start_work of this employee.
	 *
	 * @return the date_of_start_work of this employee
	 */
	@Override
	public Date getDate_of_start_work() {
		return model.getDate_of_start_work();
	}

	/**
	 * Returns the first name of this employee.
	 *
	 * @return the first name of this employee
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the home number of this employee.
	 *
	 * @return the home number of this employee
	 */
	@Override
	public long getHomeNumber() {
		return model.getHomeNumber();
	}

	/**
	 * Returns the is archive of this employee.
	 *
	 * @return the is archive of this employee
	 */
	@Override
	public long getIsArchive() {
		return model.getIsArchive();
	}

	/**
	 * Returns the last name of this employee.
	 *
	 * @return the last name of this employee
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the patronymic of this employee.
	 *
	 * @return the patronymic of this employee
	 */
	@Override
	public String getPatronymic() {
		return model.getPatronymic();
	}

	/**
	 * Returns the position_ ID of this employee.
	 *
	 * @return the position_ ID of this employee
	 */
	@Override
	public long getPosition_Id() {
		return model.getPosition_Id();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prson_id of this employee.
	 *
	 * @return the prson_id of this employee
	 */
	@Override
	public long getPrson_id() {
		return model.getPrson_id();
	}

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the work number of this employee.
	 *
	 * @return the work number of this employee
	 */
	@Override
	public long getWorkNumber() {
		return model.getWorkNumber();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the bank_id of this employee.
	 *
	 * @param Bank_id the bank_id of this employee
	 */
	@Override
	public void setBank_id(long Bank_id) {
		model.setBank_id(Bank_id);
	}

	/**
	 * Sets the date_of_birth of this employee.
	 *
	 * @param Date_of_birth the date_of_birth of this employee
	 */
	@Override
	public void setDate_of_birth(Date Date_of_birth) {
		model.setDate_of_birth(Date_of_birth);
	}

	/**
	 * Sets the date_of_start_work of this employee.
	 *
	 * @param Date_of_start_work the date_of_start_work of this employee
	 */
	@Override
	public void setDate_of_start_work(Date Date_of_start_work) {
		model.setDate_of_start_work(Date_of_start_work);
	}

	/**
	 * Sets the first name of this employee.
	 *
	 * @param FirstName the first name of this employee
	 */
	@Override
	public void setFirstName(String FirstName) {
		model.setFirstName(FirstName);
	}

	/**
	 * Sets the home number of this employee.
	 *
	 * @param HomeNumber the home number of this employee
	 */
	@Override
	public void setHomeNumber(long HomeNumber) {
		model.setHomeNumber(HomeNumber);
	}

	/**
	 * Sets the is archive of this employee.
	 *
	 * @param IsArchive the is archive of this employee
	 */
	@Override
	public void setIsArchive(long IsArchive) {
		model.setIsArchive(IsArchive);
	}

	/**
	 * Sets the last name of this employee.
	 *
	 * @param LastName the last name of this employee
	 */
	@Override
	public void setLastName(String LastName) {
		model.setLastName(LastName);
	}

	/**
	 * Sets the patronymic of this employee.
	 *
	 * @param Patronymic the patronymic of this employee
	 */
	@Override
	public void setPatronymic(String Patronymic) {
		model.setPatronymic(Patronymic);
	}

	/**
	 * Sets the position_ ID of this employee.
	 *
	 * @param Position_Id the position_ ID of this employee
	 */
	@Override
	public void setPosition_Id(long Position_Id) {
		model.setPosition_Id(Position_Id);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prson_id of this employee.
	 *
	 * @param Prson_id the prson_id of this employee
	 */
	@Override
	public void setPrson_id(long Prson_id) {
		model.setPrson_id(Prson_id);
	}

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the work number of this employee.
	 *
	 * @param WorkNumber the work number of this employee
	 */
	@Override
	public void setWorkNumber(long WorkNumber) {
		model.setWorkNumber(WorkNumber);
	}

	@Override
	protected EmployeeWrapper wrap(Employee employee) {
		return new EmployeeWrapper(employee);
	}

}