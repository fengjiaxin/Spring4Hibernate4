package com.jiaxin.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiaxin.dao.PersonDAO;
import com.jiaxin.model.Person;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		PersonDAO personDao = context.getBean(PersonDAO.class);
		Person person = new Person();
		person.setName("fengjiaxin");
		person.setCountry("China");
		personDao.save(person);
		System.out.println("Person:"+person.toString());
		List<Person> list = personDao.list();
		for(Person p:list)
			System.out.println("Personlist:"+p.toString());
		context.close();
		
	}

}
