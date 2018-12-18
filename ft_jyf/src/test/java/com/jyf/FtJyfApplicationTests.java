package com.jyf;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.dao.impl.NutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jyf.pojo.Order;
import com.jyf.pojo.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FtJyfApplicationTests {
	
	@Autowired
	private NutDao nutDao;

	@Test
	public void contextLoads() {
		
		
	}
	
	@Test
	public void testOne() {
		
		Person person = new Person();
		person.setName("小张");

		
		List<Order> orders = new ArrayList<Order>();
		Order order1 = new Order();
		order1.setYear("2001");
		Order order2 = new Order();
		order2.setYear("2002");
		
		orders.add(order1);
		orders.add(order2);
		
		person.setOrders(orders);
		
		nutDao.insertWith(person, "orders");
	}


}

