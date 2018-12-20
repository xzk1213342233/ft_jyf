package com.jyf.service;

import java.util.List;
import com.jyf.pojo.Person;

public interface PersonService {
	
	/**
	   *    新增
	 * @param person
	 */
	public void insertPerson(Person person);
	
	/**
	   *    删除
	 * @param person
	 */
	public void deletePerson(Person person);
	
	/**
	   *    更新
	 * @param person
	 */
	public void updatePerson(Person person);
	
	/**
	   *    单条查询
	 * @param person
	 */
	public Person fetchPerson(int id);
	
	/**
	   *    多条查询（name 条件）
	 * @param person
	 */
	public List<Person> queryPersonByName(String name);

}
