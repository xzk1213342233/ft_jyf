package com.jyf.dao.impl;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.impl.NutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jyf.dao.PersonDao;
import com.jyf.pojo.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private NutDao nutDao;
	
	@Override
	public void insertPerson(Person person) {
		nutDao.insert(person);
	}

	@Override
	public void deletePerson(Person person) {
		nutDao.delete(person);
	}

	@Override
	public void updatePerson(Person person) {
		nutDao.update(person);
	}

	@Override
	public Person fetchPerson(int id) {
		return nutDao.fetch(Person.class, id);
	}

	@Override
	public List<Person> queryPerson(Cnd cnd) {
		return nutDao.query(Person.class, cnd);
	}

}
