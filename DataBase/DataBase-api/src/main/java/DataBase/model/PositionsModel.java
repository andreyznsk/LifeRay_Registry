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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Positions service. Represents a row in the &quot;My_Positions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>DataBase.model.impl.PositionsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>DataBase.model.impl.PositionsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Positions
 * @generated
 */
@ProviderType
public interface PositionsModel extends BaseModel<Positions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a positions model instance should use the {@link Positions} interface instead.
	 */

	/**
	 * Returns the primary key of this positions.
	 *
	 * @return the primary key of this positions
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this positions.
	 *
	 * @param primaryKey the primary key of this positions
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this positions.
	 *
	 * @return the uuid of this positions
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this positions.
	 *
	 * @param uuid the uuid of this positions
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the positions_id of this positions.
	 *
	 * @return the positions_id of this positions
	 */
	public long getPositions_id();

	/**
	 * Sets the positions_id of this positions.
	 *
	 * @param Positions_id the positions_id of this positions
	 */
	public void setPositions_id(long Positions_id);

	/**
	 * Returns the position_name of this positions.
	 *
	 * @return the position_name of this positions
	 */
	@AutoEscape
	public String getPosition_name();

	/**
	 * Sets the position_name of this positions.
	 *
	 * @param Position_name the position_name of this positions
	 */
	public void setPosition_name(String Position_name);

	/**
	 * Returns the is_ archive of this positions.
	 *
	 * @return the is_ archive of this positions
	 */
	public long getIs_Archive();

	/**
	 * Sets the is_ archive of this positions.
	 *
	 * @param is_Archive the is_ archive of this positions
	 */
	public void setIs_Archive(long is_Archive);

	/**
	 * Returns the salary of this positions.
	 *
	 * @return the salary of this positions
	 */
	public long getSalary();

	/**
	 * Sets the salary of this positions.
	 *
	 * @param Salary the salary of this positions
	 */
	public void setSalary(long Salary);

}