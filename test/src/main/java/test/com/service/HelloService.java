package test.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.dao.PersonMapper;
import test.com.entity.Person;

@Service
public class HelloService {
   
	@Autowired
	protected PersonMapper personMapper;
	
	public Person getEntity(String id) {
		return personMapper.selectByPrimaryKey(id);
	}
}
