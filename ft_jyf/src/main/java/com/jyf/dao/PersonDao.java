package com.jyf.dao;

import java.util.List;

import org.nutz.dao.Cnd;

import com.jyf.pojo.Person;

public interface PersonDao {

	//新增
	public void insertPerson(Person person);
	
	//删除
	public void deletePerson(Person person);
	
	//更新
	public void updatePerson(Person person);
	
	//查询一条
	public Person fetchPerson(int id);
	
	//查询多条
	public List<Person> queryPerson(Cnd cnd);
}
