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
 * This class is a wrapper for {@link Bank}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankWrapper
	extends BaseModelWrapper<Bank> implements Bank, ModelWrapper<Bank> {

	public BankWrapper(Bank bank) {
		super(bank);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("Bank_id", getBank_id());
		attributes.put("BankName", getBankName());
		attributes.put("Bic", getBic());
		attributes.put("Address", getAddress());
		attributes.put("isArchive", getIsArchive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long Bank_id = (Long)attributes.get("Bank_id");

		if (Bank_id != null) {
			setBank_id(Bank_id);
		}

		String BankName = (String)attributes.get("BankName");

		if (BankName != null) {
			setBankName(BankName);
		}

		Long Bic = (Long)attributes.get("Bic");

		if (Bic != null) {
			setBic(Bic);
		}

		String Address = (String)attributes.get("Address");

		if (Address != null) {
			setAddress(Address);
		}

		Integer isArchive = (Integer)attributes.get("isArchive");

		if (isArchive != null) {
			setIsArchive(isArchive);
		}
	}

	/**
	 * Returns the address of this bank.
	 *
	 * @return the address of this bank
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the bank_id of this bank.
	 *
	 * @return the bank_id of this bank
	 */
	@Override
	public long getBank_id() {
		return model.getBank_id();
	}

	/**
	 * Returns the bank name of this bank.
	 *
	 * @return the bank name of this bank
	 */
	@Override
	public String getBankName() {
		return model.getBankName();
	}

	/**
	 * Returns the bic of this bank.
	 *
	 * @return the bic of this bank
	 */
	@Override
	public long getBic() {
		return model.getBic();
	}

	/**
	 * Returns the is archive of this bank.
	 *
	 * @return the is archive of this bank
	 */
	@Override
	public int getIsArchive() {
		return model.getIsArchive();
	}

	/**
	 * Returns the primary key of this bank.
	 *
	 * @return the primary key of this bank
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this bank.
	 *
	 * @return the uuid of this bank
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
	 * Sets the address of this bank.
	 *
	 * @param Address the address of this bank
	 */
	@Override
	public void setAddress(String Address) {
		model.setAddress(Address);
	}

	/**
	 * Sets the bank_id of this bank.
	 *
	 * @param Bank_id the bank_id of this bank
	 */
	@Override
	public void setBank_id(long Bank_id) {
		model.setBank_id(Bank_id);
	}

	/**
	 * Sets the bank name of this bank.
	 *
	 * @param BankName the bank name of this bank
	 */
	@Override
	public void setBankName(String BankName) {
		model.setBankName(BankName);
	}

	/**
	 * Sets the bic of this bank.
	 *
	 * @param Bic the bic of this bank
	 */
	@Override
	public void setBic(long Bic) {
		model.setBic(Bic);
	}

	/**
	 * Sets the is archive of this bank.
	 *
	 * @param isArchive the is archive of this bank
	 */
	@Override
	public void setIsArchive(int isArchive) {
		model.setIsArchive(isArchive);
	}

	/**
	 * Sets the primary key of this bank.
	 *
	 * @param primaryKey the primary key of this bank
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this bank.
	 *
	 * @param uuid the uuid of this bank
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected BankWrapper wrap(Bank bank) {
		return new BankWrapper(bank);
	}

}