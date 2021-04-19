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
 * This class is used by SOAP remote services, specifically {@link DataBase.service.http.BankServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class BankSoap implements Serializable {

	public static BankSoap toSoapModel(Bank model) {
		BankSoap soapModel = new BankSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBank_id(model.getBank_id());
		soapModel.setBankName(model.getBankName());
		soapModel.setBic(model.getBic());
		soapModel.setAddress(model.getAddress());

		return soapModel;
	}

	public static BankSoap[] toSoapModels(Bank[] models) {
		BankSoap[] soapModels = new BankSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BankSoap[][] toSoapModels(Bank[][] models) {
		BankSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BankSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BankSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BankSoap[] toSoapModels(List<Bank> models) {
		List<BankSoap> soapModels = new ArrayList<BankSoap>(models.size());

		for (Bank model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BankSoap[soapModels.size()]);
	}

	public BankSoap() {
	}

	public long getPrimaryKey() {
		return _Bank_id;
	}

	public void setPrimaryKey(long pk) {
		setBank_id(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBank_id() {
		return _Bank_id;
	}

	public void setBank_id(long Bank_id) {
		_Bank_id = Bank_id;
	}

	public String getBankName() {
		return _BankName;
	}

	public void setBankName(String BankName) {
		_BankName = BankName;
	}

	public long getBic() {
		return _Bic;
	}

	public void setBic(long Bic) {
		_Bic = Bic;
	}

	public String getAddress() {
		return _Address;
	}

	public void setAddress(String Address) {
		_Address = Address;
	}

	private String _uuid;
	private long _Bank_id;
	private String _BankName;
	private long _Bic;
	private String _Address;

}