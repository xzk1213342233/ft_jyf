package com.jyf.service;

import java.util.List;

import org.nutz.dao.Cnd;

import com.jyf.pojo.Person;

public interface PersonService {
	
	//新增
	public void insertPerson(Person person);
	
	//删除
	public void deletePerson(Person person);
	
	//更新
	public void updatePerson(Person person);
	
	//查询一条
	public Person fetchPerson(int id);
	
	//根据name 查询person
	public List<Person> queryPersonByName(String name);

}
