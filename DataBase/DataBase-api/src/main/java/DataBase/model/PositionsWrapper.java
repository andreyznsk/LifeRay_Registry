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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Positions}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Positions
 * @generated
 */
public class PositionsWrapper
	extends BaseModelWrapper<Positions>
	implements ModelWrapper<Positions>, Positions {

	public PositionsWrapper(Positions positions) {
		super(positions);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Positions_id", getPositions_id());
		attributes.put("Position_name", getPosition_name());
		attributes.put("is_Archive", getIs_Archive());
		attributes.put("Salary", getSalary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Positions_id = (Long)attributes.get("Positions_id");

		if (Positions_id != null) {
			setPositions_id(Positions_id);
		}

		String Position_name = (String)attributes.get("Position_name");

		if (Position_name != null) {
			setPosition_name(Position_name);
		}

		Long is_Archive = (Long)attributes.get("is_Archive");

		if (is_Archive != null) {
			setIs_Archive(is_Archive);
		}

		Long Salary = (Long)attributes.get("Salary");

		if (Salary != null) {
			setSalary(Salary);
		}
	}

	/**
	 * Returns the is_ archive of this positions.
	 *
	 * @return the is_ archive of this positions
	 */
	@Override
	public long getIs_Archive() {
		return model.getIs_Archive();
	}

	/**
	 * Returns the position_name of this positions.
	 *
	 * @return the position_name of this positions
	 */
	@Override
	public String getPosition_name() {
		return model.getPosition_name();
	}

	/**
	 * Returns the positions_id of this positions.
	 *
	 * @return the positions_id of this positions
	 */
	@Override
	public long getPositions_id() {
		return model.getPositions_id();
	}

	/**
	 * Returns the primary key of this positions.
	 *
	 * @return the primary key of this positions
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the salary of this positions.
	 *
	 * @return the salary of this positions
	 */
	@Override
	public long getSalary() {
		return model.getSalary();
	}

	/**
	 * Returns the uuid of this positions.
	 *
	 * @return the uuid of this positions
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the is_ archive of this positions.
	 *
	 * @param is_Archive the is_ archive of this positions
	 */
	@Override
	public void setIs_Archive(long is_Archive) {
		model.setIs_Archive(is_Archive);
	}

	/**
	 * Sets the position_name of this positions.
	 *
	 * @param Position_name the position_name of this positions
	 */
	@Override
	public void setPosition_name(String Position_name) {
		model.setPosition_name(Position_name);
	}

	/**
	 * Sets the positions_id of this positions.
	 *
	 * @param Positions_id the positions_id of this positions
	 */
	@Override
	public void setPositions_id(long Positions_id) {
		model.setPositions_id(Positions_id);
	}

	/**
	 * Sets the primary key of this positions.
	 *
	 * @param primaryKey the primary key of this positions
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the salary of this positions.
	 *
	 * @param Salary the salary of this positions
	 */
	@Override
	public void setSalary(long Salary) {
		model.setSalary(Salary);
	}

	/**
	 * Sets the uuid of this positions.
	 *
	 * @param uuid the uuid of this positions
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected PositionsWrapper wrap(Positions positions) {
		return new PositionsWrapper(positions);
	}

}