package com.jiaxin.dao;

import java.util.List;

import com.jiaxin.model.Person;

public interface PersonDAO {
	
	public void save(Person p);
	public List<Person> list();

}
