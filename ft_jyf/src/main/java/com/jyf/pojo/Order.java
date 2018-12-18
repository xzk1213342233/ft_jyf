package com.jyf.pojo;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

@Table("t_order")
public class Order {
	
	@Column
	private int  personId;

    @One(field = "personId", key = "id")
    private Person person;
	
	//年份
	@Column
	private String  year;
	
	//月份
	@Column
	private String  month;
	
	//房租
	@Column
	private float rent;

	//电费
	@Column
	private float powerRate;
	
	//总费用
	@Column
	private float totalCost;
	
	//描述
	@Column
	private String memo;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public float getRent() {
		return rent;
	}

	public void setRent(float rent) {
		this.rent = rent;
	}

	public float getPowerRate() {
		return powerRate;
	}

	public void setPowerRate(float powerRate) {
		this.powerRate = powerRate;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "Order [personId=" + personId + ", person=" + person + ", year=" + year + ", month=" + month + ", rent="
				+ rent + ", powerRate=" + powerRate + ", totalCost=" + totalCost + ", memo=" + memo + "]";
	}
}
