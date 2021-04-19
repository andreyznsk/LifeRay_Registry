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

import DataBase.model.Bank;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BankCacheModel)) {
			return false;
		}

		BankCacheModel bankCacheModel = (BankCacheModel)object;

		if (Bank_id == bankCacheModel.Bank_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Bank_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Bank_id=");
		sb.append(Bank_id);
		sb.append(", BankName=");
		sb.append(BankName);
		sb.append(", Bic=");
		sb.append(Bic);
		sb.append(", Address=");
		sb.append(Address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bank toEntityModel() {
		BankImpl bankImpl = new BankImpl();

		if (uuid == null) {
			bankImpl.setUuid("");
		}
		else {
			bankImpl.setUuid(uuid);
		}

		bankImpl.setBank_id(Bank_id);

		if (BankName == null) {
			bankImpl.setBankName("");
		}
		else {
			bankImpl.setBankName(BankName);
		}

		bankImpl.setBic(Bic);

		if (Address == null) {
			bankImpl.setAddress("");
		}
		else {
			bankImpl.setAddress(Address);
		}

		bankImpl.resetOriginalValues();

		return bankImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Bank_id = objectInput.readLong();
		BankName = objectInput.readUTF();

		Bic = objectInput.readLong();
		Address = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(Bank_id);

		if (BankName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(BankName);
		}

		objectOutput.writeLong(Bic);

		if (Address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Address);
		}
	}

	public String uuid;
	public long Bank_id;
	public String BankName;
	public long Bic;
	public String Address;

}