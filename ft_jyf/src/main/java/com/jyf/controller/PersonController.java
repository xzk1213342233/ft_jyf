package com.jyf.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jyf.pojo.Person;
import com.jyf.service.impl.PersonServiceImpl;
import com.jyf.utils.PersonCheckUtil;

/**
 * person 控制器
 * @author xzk
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServiceImpl personServiceImpl;
	
	/**
	   *      新增
	 * @param name
	 * @param sex
	 * @param idNumber
	 * @param phoneNumber
	 * @param address
	 * @return
	 */
	@RequestMapping("/insertPerson")
	@ResponseBody
	public String insertPerson(@RequestParam(value = "name",required = false) String name,
			@RequestParam(value = "sex",required = false) Integer sex,
			@RequestParam(value = "idNumber",required = false) Integer idNumber,
			@RequestParam(value = "phoneNumber",required = false) String phoneNumber,
			@RequestParam(value = "address",required = false) String address) {
		//参数转换
		PersonCheckUtil.insertPersonParamsConvert(sex, idNumber);
		
		//新增
		Person person = new Person(name,sex,idNumber,phoneNumber,address);
		personServiceImpl.insertPerson(person);
		
		return "新增完成";
	}
	
	/**
	   *     更新
	 * @param id
	 * @param name
	 * @param sex
	 * @param idNumber
	 * @param phoneNumber
	 * @param address
	 * @return
	 */
	@RequestMapping("/updatePerson")
	@ResponseBody
	public String updatePerson(@RequestParam(value = "id") Integer id,
			@RequestParam(value = "name",required = false) String name,
			@RequestParam(value = "sex",required = false) Integer sex,
			@RequestParam(value = "idNumber",required = false) Integer idNumber,
			@RequestParam(value = "phoneNumber",required = false) String phoneNumber,
			@RequestParam(value = "address",required = false) String address) {
		
		//查询person
		Person person = personServiceImpl.fetchPerson(id);
		//参数转换
		PersonCheckUtil.insertPersonParamsConvert(sex, idNumber);
		person.setName(name);
		person.setSex(sex);
		person.setIdNumber(idNumber);
		person.setPhoneNumber(phoneNumber);
		person.setAddress(address);
		
		//更新
		personServiceImpl.updatePerson(person);
		
		return "更新完成";
	}
	
	/**
	   *    删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletePerson")
	@ResponseBody
	public String deletePerson(@RequestParam(value = "id") Integer id) {
		
		//查询person
		Person person = personServiceImpl.fetchPerson(id);
		
		//删除
		personServiceImpl.deletePerson(person);
		
		return "删除完成";
	}
	
	/**
	    *   根据name 查询person
	 * @param name
	 * @return
	 */
	@RequestMapping("/queryPersonByName")
	@ResponseBody
	public String queryPersonByName(@RequestParam(value = "name") String name) {
		
		//查询person
		List<Person> persons = personServiceImpl.queryPersonByName(name);
		
		return "根据name 查询person完成";
	}

}
