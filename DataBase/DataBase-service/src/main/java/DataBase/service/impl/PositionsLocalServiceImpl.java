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

import DataBase.model.Positions;
import DataBase.service.base.PositionsLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the positions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>DataBase.service.PositionsLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionsLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=DataBase.model.Positions",
	service = AopService.class
)
public class PositionsLocalServiceImpl extends PositionsLocalServiceBaseImpl {
	public Positions addPositions(
			long positionId,
			String name,
			long salary,
			ServiceContext serviceContext)
			throws PortalException {

		positionId = getPositionsCount() + 1;

		Positions positions = positionsPersistence.create(positionId);
		positions.setPosition_name(name);
		positions.setSalary(salary);

		positionsPersistence.update(positions);

		return positions;
	}

	public Positions updatePositions(
			long positionId,
			String name,
			long salary,
			ServiceContext serviceContext)
			throws PortalException {

		Positions positions = getPositions(positionId);

		positions.setPosition_name(name);
		positions.setSalary(salary);
		positionsPersistence.update(positions);
		return positions;
	}

	public Positions deletePosition(
			long positionId, String name,
			long salary, ServiceContext serviceContext)
			throws PortalException {

		Positions positions = getPositions(positionId);
		positions = deletePositions(positions);
		return positions;
	}

	public List<Positions> getEntries(int start, int end)throws SystemException {
		return positionsPersistence.findAll(start,end);
	}

	public int getPositionsCount() {
		return positionsPersistence.countAll();
	}


	public List<Positions> getNotArchivedPositionses(long isArchived, int start, int end) {
	 	return 	positionsPersistence.findByIsArchive(isArchived,start,end);
	}


	public Positions deletePosition(long positionId) throws PortalException {

		Positions positions = getPositions(positionId);
		positions.setIs_Archive(1);
		positionsPersistence.update(positions);
		return positions;
	}


	public void recoverPosition(long positionId) throws PortalException {
		Positions positions = getPositions(positionId);
		positions.setIs_Archive(0);
		positionsPersistence.update(positions);
	}
}