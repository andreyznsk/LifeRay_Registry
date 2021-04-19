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

package DataBase.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PositionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PositionsLocalService
 * @generated
 */
public class PositionsLocalServiceWrapper
	implements PositionsLocalService, ServiceWrapper<PositionsLocalService> {

	public PositionsLocalServiceWrapper(
		PositionsLocalService positionsLocalService) {

		_positionsLocalService = positionsLocalService;
	}

	/**
	 * Adds the positions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positions the positions
	 * @return the positions that was added
	 */
	@Override
	public DataBase.model.Positions addPositions(
		DataBase.model.Positions positions) {

		return _positionsLocalService.addPositions(positions);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new positions with the primary key. Does not add the positions to the database.
	 *
	 * @param Positions_id the primary key for the new positions
	 * @return the new positions
	 */
	@Override
	public DataBase.model.Positions createPositions(long Positions_id) {
		return _positionsLocalService.createPositions(Positions_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionsLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the positions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions that was removed
	 * @throws PortalException if a positions with the primary key could not be found
	 */
	@Override
	public DataBase.model.Positions deletePositions(long Positions_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionsLocalService.deletePositions(Positions_id);
	}

	/**
	 * Deletes the positions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positions the positions
	 * @return the positions that was removed
	 */
	@Override
	public DataBase.model.Positions deletePositions(
		DataBase.model.Positions positions) {

		return _positionsLocalService.deletePositions(positions);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _positionsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _positionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _positionsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _positionsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _positionsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _positionsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public DataBase.model.Positions fetchPositions(long Positions_id) {
		return _positionsLocalService.fetchPositions(Positions_id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _positionsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _positionsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _positionsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the positions with the primary key.
	 *
	 * @param Positions_id the primary key of the positions
	 * @return the positions
	 * @throws PortalException if a positions with the primary key could not be found
	 */
	@Override
	public DataBase.model.Positions getPositions(long Positions_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionsLocalService.getPositions(Positions_id);
	}

	/**
	 * Returns a range of all the positionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DataBase.model.impl.PositionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of positionses
	 * @param end the upper bound of the range of positionses (not inclusive)
	 * @return the range of positionses
	 */
	@Override
	public java.util.List<DataBase.model.Positions> getPositionses(
		int start, int end) {

		return _positionsLocalService.getPositionses(start, end);
	}

	/**
	 * Returns the number of positionses.
	 *
	 * @return the number of positionses
	 */
	@Override
	public int getPositionsesCount() {
		return _positionsLocalService.getPositionsesCount();
	}

	/**
	 * Updates the positions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positions the positions
	 * @return the positions that was updated
	 */
	@Override
	public DataBase.model.Positions updatePositions(
		DataBase.model.Positions positions) {

		return _positionsLocalService.updatePositions(positions);
	}

	@Override
	public PositionsLocalService getWrappedService() {
		return _positionsLocalService;
	}

	@Override
	public void setWrappedService(PositionsLocalService positionsLocalService) {
		_positionsLocalService = positionsLocalService;
	}

	private PositionsLocalService _positionsLocalService;

}