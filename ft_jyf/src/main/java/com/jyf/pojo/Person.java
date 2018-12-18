package com.jyf.pojo;

import java.util.List;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Table;

/**
 * 租户实体类
 * 
 * @author xzk
 *
 */
@Table("t_person") 
public class Person {
	
	//主键
	@Id
	private int id;
	
	//名字
	@Column
	private String name;
	
	//性别
	@Column
	private int sex;

	//身份证号
	@Column
	private int idNumber;
	
	//手机号
	@Column
	private String phoneNumber;
	
	//住址
	@Column
	private String address;

	@Many(field = "personId")
	private List<Order> orders;
	

	public Person() {
		super();
	}

	public Person(String name, int sex, int idNumber, String phoneNumber, String address) {
		super();
		this.name = name;
		this.sex = sex;
		this.idNumber = idNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", idNumber=" + idNumber + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", orders=" + orders + "]";
	}
}
