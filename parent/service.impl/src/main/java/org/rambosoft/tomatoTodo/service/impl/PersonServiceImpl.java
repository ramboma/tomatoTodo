package org.rambosoft.tomatoTodo.service.impl;

import org.rambosoft.tomatoTodo.Domain.Person;
import org.rambosoft.tomatoTodo.dao.Mapper.PersonEntityMapper;
import org.rambosoft.tomatoTodo.dao.repository.personRepository;
import org.rambosoft.tomatoTodo.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.rambosoft.tomatoTodo.dao.Entity.PersonEntity;

/**
 * Created by Administrator on 2018-04-15.
 */
@Service
public class PersonServiceImpl implements IPersonService{

    @Autowired
    private PersonEntityMapper repository;

    private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
    public Person getPerson(int id)
    {
        log.info("personServiceImpl's log");
        Person myperson=new Person();
        PersonEntity defaultPersonEntity=new PersonEntity();
        defaultPersonEntity.setId(2);
        defaultPersonEntity.setName("haha");
        PersonEntity person1=repository.selectByPrimaryKey(id);

        myperson.setId(person1.getId());
        myperson.setName(person1.getName());
        return myperson;
    }
    public boolean addPerson(Person person)
    {
        PersonEntity entity=new PersonEntity();
        BeanUtils.copyProperties(person,entity);
        int i=repository.insert(entity);
        if(i<=0) return false;
        return true;
    }
}
