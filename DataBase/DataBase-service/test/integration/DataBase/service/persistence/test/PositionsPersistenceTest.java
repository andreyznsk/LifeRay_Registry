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

package DataBase.service.persistence.test;

import DataBase.exception.NoSuchPositionsException;

import DataBase.model.Positions;

import DataBase.service.PositionsLocalServiceUtil;
import DataBase.service.persistence.PositionsPersistence;
import DataBase.service.persistence.PositionsUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class PositionsPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "DataBase.service"));

	@Before
	public void setUp() {
		_persistence = PositionsUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Positions> iterator = _positionses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Positions positions = _persistence.create(pk);

		Assert.assertNotNull(positions);

		Assert.assertEquals(positions.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Positions newPositions = addPositions();

		_persistence.remove(newPositions);

		Positions existingPositions = _persistence.fetchByPrimaryKey(
			newPositions.getPrimaryKey());

		Assert.assertNull(existingPositions);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addPositions();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Positions newPositions = _persistence.create(pk);

		newPositions.setUuid(RandomTestUtil.randomString());

		newPositions.setPosition_name(RandomTestUtil.randomString());

		newPositions.setIs_Archive(RandomTestUtil.nextLong());

		newPositions.setSalary(RandomTestUtil.nextLong());

		_positionses.add(_persistence.update(newPositions));

		Positions existingPositions = _persistence.findByPrimaryKey(
			newPositions.getPrimaryKey());

		Assert.assertEquals(
			existingPositions.getUuid(), newPositions.getUuid());
		Assert.assertEquals(
			existingPositions.getPositions_id(),
			newPositions.getPositions_id());
		Assert.assertEquals(
			existingPositions.getPosition_name(),
			newPositions.getPosition_name());
		Assert.assertEquals(
			existingPositions.getIs_Archive(), newPositions.getIs_Archive());
		Assert.assertEquals(
			existingPositions.getSalary(), newPositions.getSalary());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByPositions_id() throws Exception {
		_persistence.countByPositions_id(RandomTestUtil.nextLong());

		_persistence.countByPositions_id(0L);
	}

	@Test
	public void testCountByIsArchive() throws Exception {
		_persistence.countByIsArchive(RandomTestUtil.nextLong());

		_persistence.countByIsArchive(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Positions newPositions = addPositions();

		Positions existingPositions = _persistence.findByPrimaryKey(
			newPositions.getPrimaryKey());

		Assert.assertEquals(existingPositions, newPositions);
	}

	@Test(expected = NoSuchPositionsException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Positions> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"My_Positions", "uuid", true, "Positions_id", true, "Position_name",
			true, "is_Archive", true, "Salary", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Positions newPositions = addPositions();

		Positions existingPositions = _persistence.fetchByPrimaryKey(
			newPositions.getPrimaryKey());

		Assert.assertEquals(existingPositions, newPositions);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Positions missingPositions = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingPositions);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Positions newPositions1 = addPositions();
		Positions newPositions2 = addPositions();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositions1.getPrimaryKey());
		primaryKeys.add(newPositions2.getPrimaryKey());

		Map<Serializable, Positions> positionses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, positionses.size());
		Assert.assertEquals(
			newPositions1, positionses.get(newPositions1.getPrimaryKey()));
		Assert.assertEquals(
			newPositions2, positionses.get(newPositions2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Positions> positionses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(positionses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Positions newPositions = addPositions();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositions.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Positions> positionses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, positionses.size());
		Assert.assertEquals(
			newPositions, positionses.get(newPositions.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Positions> positionses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(positionses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Positions newPositions = addPositions();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPositions.getPrimaryKey());

		Map<Serializable, Positions> positionses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, positionses.size());
		Assert.assertEquals(
			newPositions, positionses.get(newPositions.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			PositionsLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Positions>() {

				@Override
				public void performAction(Positions positions) {
					Assert.assertNotNull(positions);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Positions newPositions = addPositions();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Positions.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Positions_id", newPositions.getPositions_id()));

		List<Positions> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Positions existingPositions = result.get(0);

		Assert.assertEquals(existingPositions, newPositions);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Positions.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"Positions_id", RandomTestUtil.nextLong()));

		List<Positions> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Positions newPositions = addPositions();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Positions.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Positions_id"));

		Object newPositions_id = newPositions.getPositions_id();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Positions_id", new Object[] {newPositions_id}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingPositions_id = result.get(0);

		Assert.assertEquals(existingPositions_id, newPositions_id);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Positions.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("Positions_id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"Positions_id", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Positions addPositions() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Positions positions = _persistence.create(pk);

		positions.setUuid(RandomTestUtil.randomString());

		positions.setPosition_name(RandomTestUtil.randomString());

		positions.setIs_Archive(RandomTestUtil.nextLong());

		positions.setSalary(RandomTestUtil.nextLong());

		_positionses.add(_persistence.update(positions));

		return positions;
	}

	private List<Positions> _positionses = new ArrayList<Positions>();
	private PositionsPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}