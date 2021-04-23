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

package DataBase.service.impl;

import DataBase.exception.NoSuchBankException;
import DataBase.model.Bank;
import DataBase.service.base.BankLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the bank local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>DataBase.service.BankLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BankLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=DataBase.model.Bank",
	service = AopService.class
)
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {

	public Bank addBank(
			long bankId,
			String name,
			String address,
			long bic,
			ServiceContext serviceContext)
			throws PortalException {

		bankId = getBanksCount() + 1;

		Bank bank = bankPersistence.create(bankId);
		bank.setBankName(name);
		bank.setAddress(address);
		bank.setBic(bic);
		bank.setExpandoBridgeAttributes(serviceContext);
		bankPersistence.update(bank);

		return bank;
	}

	public Bank updateBank(
			long bankId, String name, String address,
			long bic, ServiceContext serviceContext)
			throws PortalException {

		Bank bank = getBank(bankId);

		bank.setBankName(name);
		bank.setAddress(address);


		bankPersistence.update(bank);

		return bank;
	}

	public Bank deleteBank(
			long bankId, String name, String address,
			long bic, ServiceContext serviceContext)
			throws PortalException {

		Bank bank = getBank(bankId);
		bank = deleteBank(bank);
		return bank;
	}

	public List<Bank> getEntries(int start, int end)throws SystemException {
		return bankPersistence.findAll(start,end);
	}




	public int getBanksCount() {
		return bankPersistence.countAll();
	}

}