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
 * The base model interface for the Bank service. Represents a row in the &quot;My_Bank&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>DataBase.model.impl.BankModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>DataBase.model.impl.BankImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
@ProviderType
public interface BankModel extends BaseModel<Bank> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a bank model instance should use the {@link Bank} interface instead.
	 */

	/**
	 * Returns the primary key of this bank.
	 *
	 * @return the primary key of this bank
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this bank.
	 *
	 * @param primaryKey the primary key of this bank
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this bank.
	 *
	 * @return the uuid of this bank
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this bank.
	 *
	 * @param uuid the uuid of this bank
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the bank_id of this bank.
	 *
	 * @return the bank_id of this bank
	 */
	public long getBank_id();

	/**
	 * Sets the bank_id of this bank.
	 *
	 * @param Bank_id the bank_id of this bank
	 */
	public void setBank_id(long Bank_id);

	/**
	 * Returns the bank name of this bank.
	 *
	 * @return the bank name of this bank
	 */
	@AutoEscape
	public String getBankName();

	/**
	 * Sets the bank name of this bank.
	 *
	 * @param BankName the bank name of this bank
	 */
	public void setBankName(String BankName);

	/**
	 * Returns the bic of this bank.
	 *
	 * @return the bic of this bank
	 */
	public long getBic();

	/**
	 * Sets the bic of this bank.
	 *
	 * @param Bic the bic of this bank
	 */
	public void setBic(long Bic);

	/**
	 * Returns the address of this bank.
	 *
	 * @return the address of this bank
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this bank.
	 *
	 * @param Address the address of this bank
	 */
	public void setAddress(String Address);

}