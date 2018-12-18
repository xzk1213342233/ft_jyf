package com.jyf.service.impl;

import java.util.List;

import org.nutz.dao.Cnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jyf.dao.impl.PersonDaoImpl;
import com.jyf.pojo.Person;
import com.jyf.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDaoImpl personDapImpl;

	@Override
	public void insertPerson(Person person) {
		personDapImpl.insertPerson(person);
	}

	@Override
	public void deletePerson(Person person) {
		personDapImpl.deletePerson(person);
	}

	@Override
	public void updatePerson(Person person) {
		personDapImpl.updatePerson(person);
	}

	@Override
	public Person fetchPerson(int id) {
		return personDapImpl.fetchPerson(id);
	}

	@Override
	public List<Person> queryPersonByName(String name) {
		return personDapImpl.queryPerson(Cnd.where(name, "like", "%"+name+"%"));
	}
}
