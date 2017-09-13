package test.com.dao;

import org.springframework.stereotype.Repository;

import test.com.entity.Person;

public interface PersonMapper {
    Person selectByPrimaryKey(String id);
}
