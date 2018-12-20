package com.jyf.dao;

import java.util.List;

import org.nutz.dao.Cnd;

import com.jyf.pojo.Person;

public interface PersonDao {

	/**
	   *     新增
	 * @param person
	 */
	public void insertPerson(Person person);
	
	/**
	   *     删除
	 * @param person
	 */
	public void deletePerson(Person person);
	
	/**
	   *     更新
	 * @param person
	 */
	public void updatePerson(Person person);
	
	/**
	   *     单条查询
	 * @param person
	 */
	public Person fetchPerson(int id);
	
	/**
	   *     多条查询（条件）
	 * @param person
	 */
	public List<Person> queryPerson(Cnd cnd);
}
