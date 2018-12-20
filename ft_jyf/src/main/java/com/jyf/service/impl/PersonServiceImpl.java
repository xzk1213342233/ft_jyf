package com.jyf.service.impl;

import java.util.List;

import org.nutz.dao.Cnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jyf.dao.impl.PersonDaoImpl;
import com.jyf.pojo.Person;
import com.jyf.service.PersonService;

/**
 * person 服务实现
 * @author xzk
 *
 */
@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDaoImpl personDapImpl;

	/**
	   *  新增
	 */
	@Override
	public void insertPerson(Person person) {
		personDapImpl.insertPerson(person);
	}

	/**
	   *  删除
	 */
	@Override
	public void deletePerson(Person person) {
		personDapImpl.deletePerson(person);
	}

	/**
	   *  更新
	 */
	@Override
	public void updatePerson(Person person) {
		personDapImpl.updatePerson(person);
	}

	/**
	   *  根据id 查询person
	 */
	@Override
	public Person fetchPerson(int id) {
		return personDapImpl.fetchPerson(id);
	}

	/**
	   *  根据name 查询person
	 */
	@Override
	public List<Person> queryPersonByName(String name) {
		return personDapImpl.queryPerson(Cnd.where(name, "like", "%"+name+"%"));
	}
}
