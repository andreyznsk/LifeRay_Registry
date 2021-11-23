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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link DataBase.service.http.PositionsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PositionsSoap implements Serializable {

	public static PositionsSoap toSoapModel(Positions model) {
		PositionsSoap soapModel = new PositionsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPositions_id(model.getPositions_id());
		soapModel.setPosition_name(model.getPosition_name());
		soapModel.setIs_Archive(model.getIs_Archive());
		soapModel.setSalary(model.getSalary());

		return soapModel;
	}

	public static PositionsSoap[] toSoapModels(Positions[] models) {
		PositionsSoap[] soapModels = new PositionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PositionsSoap[][] toSoapModels(Positions[][] models) {
		PositionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PositionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PositionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PositionsSoap[] toSoapModels(List<Positions> models) {
		List<PositionsSoap> soapModels = new ArrayList<PositionsSoap>(
			models.size());

		for (Positions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PositionsSoap[soapModels.size()]);
	}

	public PositionsSoap() {
	}

	public long getPrimaryKey() {
		return _Positions_id;
	}

	public void setPrimaryKey(long pk) {
		setPositions_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPositions_id() {
		return _Positions_id;
	}

	public void setPositions_id(long Positions_id) {
		_Positions_id = Positions_id;
	}

	public String getPosition_name() {
		return _Position_name;
	}

	public void setPosition_name(String Position_name) {
		_Position_name = Position_name;
	}

	public long getIs_Archive() {
		return _is_Archive;
	}

	public void setIs_Archive(long is_Archive) {
		_is_Archive = is_Archive;
	}

	public long getSalary() {
		return _Salary;
	}

	public void setSalary(long Salary) {
		_Salary = Salary;
	}

	private String _uuid;
	private long _Positions_id;
	private String _Position_name;
	private long _is_Archive;
	private long _Salary;

}