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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link DataBase.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmployeeSoap implements Serializable {

	public static EmployeeSoap toSoapModel(Employee model) {
		EmployeeSoap soapModel = new EmployeeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPrson_id(model.getPrson_id());
		soapModel.setLastName(model.getLastName());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setPatronymic(model.getPatronymic());
		soapModel.setDate_of_birth(model.getDate_of_birth());
		soapModel.setDate_of_start_work(model.getDate_of_start_work());
		soapModel.setWorkNumber(model.getWorkNumber());
		soapModel.setPosition_Id(model.getPosition_Id());
		soapModel.setHomeNumber(model.getHomeNumber());
		soapModel.setBank_id(model.getBank_id());
		soapModel.setIsArchive(model.getIsArchive());

		return soapModel;
	}

	public static EmployeeSoap[] toSoapModels(Employee[] models) {
		EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
		EmployeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployeeSoap[] toSoapModels(List<Employee> models) {
		List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(
			models.size());

		for (Employee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
	}

	public EmployeeSoap() {
	}

	public long getPrimaryKey() {
		return _Prson_id;
	}

	public void setPrimaryKey(long pk) {
		setPrson_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPrson_id() {
		return _Prson_id;
	}

	public void setPrson_id(long Prson_id) {
		_Prson_id = Prson_id;
	}

	public String getLastName() {
		return _LastName;
	}

	public void setLastName(String LastName) {
		_LastName = LastName;
	}

	public String getFirstName() {
		return _FirstName;
	}

	public void setFirstName(String FirstName) {
		_FirstName = FirstName;
	}

	public String getPatronymic() {
		return _Patronymic;
	}

	public void setPatronymic(String Patronymic) {
		_Patronymic = Patronymic;
	}

	public Date getDate_of_birth() {
		return _Date_of_birth;
	}

	public void setDate_of_birth(Date Date_of_birth) {
		_Date_of_birth = Date_of_birth;
	}

	public Date getDate_of_start_work() {
		return _Date_of_start_work;
	}

	public void setDate_of_start_work(Date Date_of_start_work) {
		_Date_of_start_work = Date_of_start_work;
	}

	public long getWorkNumber() {
		return _WorkNumber;
	}

	public void setWorkNumber(long WorkNumber) {
		_WorkNumber = WorkNumber;
	}

	public long getPosition_Id() {
		return _Position_Id;
	}

	public void setPosition_Id(long Position_Id) {
		_Position_Id = Position_Id;
	}

	public long getHomeNumber() {
		return _HomeNumber;
	}

	public void setHomeNumber(long HomeNumber) {
		_HomeNumber = HomeNumber;
	}

	public long getBank_id() {
		return _Bank_id;
	}

	public void setBank_id(long Bank_id) {
		_Bank_id = Bank_id;
	}

	public long getIsArchive() {
		return _IsArchive;
	}

	public void setIsArchive(long IsArchive) {
		_IsArchive = IsArchive;
	}

	private String _uuid;
	private long _Prson_id;
	private String _LastName;
	private String _FirstName;
	private String _Patronymic;
	private Date _Date_of_birth;
	private Date _Date_of_start_work;
	private long _WorkNumber;
	private long _Position_Id;
	private long _HomeNumber;
	private long _Bank_id;
	private long _IsArchive;

}