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

package DataBase.model.impl;

import DataBase.model.Employee;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (Prson_id == employeeCacheModel.Prson_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Prson_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Prson_id=");
		sb.append(Prson_id);
		sb.append(", LastName=");
		sb.append(LastName);
		sb.append(", FirstName=");
		sb.append(FirstName);
		sb.append(", Patronymic=");
		sb.append(Patronymic);
		sb.append(", Date_of_birth=");
		sb.append(Date_of_birth);
		sb.append(", Date_of_start_work=");
		sb.append(Date_of_start_work);
		sb.append(", WorkNumber=");
		sb.append(WorkNumber);
		sb.append(", Position_Id=");
		sb.append(Position_Id);
		sb.append(", HomeNumber=");
		sb.append(HomeNumber);
		sb.append(", Bank_id=");
		sb.append(Bank_id);
		sb.append(", IsArchive=");
		sb.append(IsArchive);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		if (uuid == null) {
			employeeImpl.setUuid("");
		}
		else {
			employeeImpl.setUuid(uuid);
		}

		employeeImpl.setPrson_id(Prson_id);

		if (LastName == null) {
			employeeImpl.setLastName("");
		}
		else {
			employeeImpl.setLastName(LastName);
		}

		if (FirstName == null) {
			employeeImpl.setFirstName("");
		}
		else {
			employeeImpl.setFirstName(FirstName);
		}

		if (Patronymic == null) {
			employeeImpl.setPatronymic("");
		}
		else {
			employeeImpl.setPatronymic(Patronymic);
		}

		if (Date_of_birth == Long.MIN_VALUE) {
			employeeImpl.setDate_of_birth(null);
		}
		else {
			employeeImpl.setDate_of_birth(new Date(Date_of_birth));
		}

		if (Date_of_start_work == Long.MIN_VALUE) {
			employeeImpl.setDate_of_start_work(null);
		}
		else {
			employeeImpl.setDate_of_start_work(new Date(Date_of_start_work));
		}

		employeeImpl.setWorkNumber(WorkNumber);
		employeeImpl.setPosition_Id(Position_Id);
		employeeImpl.setHomeNumber(HomeNumber);
		employeeImpl.setBank_id(Bank_id);
		employeeImpl.setIsArchive(IsArchive);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Prson_id = objectInput.readLong();
		LastName = objectInput.readUTF();
		FirstName = objectInput.readUTF();
		Patronymic = objectInput.readUTF();
		Date_of_birth = objectInput.readLong();
		Date_of_start_work = objectInput.readLong();

		WorkNumber = objectInput.readLong();

		Position_Id = objectInput.readLong();

		HomeNumber = objectInput.readLong();

		Bank_id = objectInput.readLong();

		IsArchive = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(Prson_id);

		if (LastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LastName);
		}

		if (FirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(FirstName);
		}

		if (Patronymic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Patronymic);
		}

		objectOutput.writeLong(Date_of_birth);
		objectOutput.writeLong(Date_of_start_work);

		objectOutput.writeLong(WorkNumber);

		objectOutput.writeLong(Position_Id);

		objectOutput.writeLong(HomeNumber);

		objectOutput.writeLong(Bank_id);

		objectOutput.writeLong(IsArchive);
	}

	public String uuid;
	public long Prson_id;
	public String LastName;
	public String FirstName;
	public String Patronymic;
	public long Date_of_birth;
	public long Date_of_start_work;
	public long WorkNumber;
	public long Position_Id;
	public long HomeNumber;
	public long Bank_id;
	public long IsArchive;

}