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

import DataBase.model.Positions;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Positions in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PositionsCacheModel
	implements CacheModel<Positions>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PositionsCacheModel)) {
			return false;
		}

		PositionsCacheModel positionsCacheModel = (PositionsCacheModel)object;

		if (Positions_id == positionsCacheModel.Positions_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Positions_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", Positions_id=");
		sb.append(Positions_id);
		sb.append(", Position_name=");
		sb.append(Position_name);
		sb.append(", is_Archive=");
		sb.append(is_Archive);
		sb.append(", Salary=");
		sb.append(Salary);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Positions toEntityModel() {
		PositionsImpl positionsImpl = new PositionsImpl();

		if (uuid == null) {
			positionsImpl.setUuid("");
		}
		else {
			positionsImpl.setUuid(uuid);
		}

		positionsImpl.setPositions_id(Positions_id);

		if (Position_name == null) {
			positionsImpl.setPosition_name("");
		}
		else {
			positionsImpl.setPosition_name(Position_name);
		}

		positionsImpl.setIs_Archive(is_Archive);

		if (Salary == null) {
			positionsImpl.setSalary("");
		}
		else {
			positionsImpl.setSalary(Salary);
		}

		positionsImpl.resetOriginalValues();

		return positionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		Positions_id = objectInput.readLong();
		Position_name = objectInput.readUTF();

		is_Archive = objectInput.readLong();
		Salary = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(Positions_id);

		if (Position_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Position_name);
		}

		objectOutput.writeLong(is_Archive);

		if (Salary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Salary);
		}
	}

	public String uuid;
	public long Positions_id;
	public String Position_name;
	public long is_Archive;
	public String Salary;

}