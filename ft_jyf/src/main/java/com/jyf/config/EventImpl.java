package com.jyf.config;

import org.nutz.dao.impl.NutDao;
import org.springframework.context.ApplicationEvent;

import com.jyf.pojo.Order;
import com.jyf.pojo.Person;

public class EventImpl  extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public EventImpl(Object source) {
		super(source);
	}
	
	/**
	    *   根据实体类创建数据库表
	 * @param nutDao
	 */
	public void createTable(NutDao nutDao) {
		try {
			nutDao.create(Person.class, false);
			nutDao.create(Order.class, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
