package org.rambosoft.tomatoTodo.service.impl;

import org.rambosoft.tomatoTodo.Domain.Person;
import org.rambosoft.tomatoTodo.dao.repository.personRepository;
import org.rambosoft.tomatoTodo.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.rambosoft.tomatoTodo.dao.Entity.personEntity;

/**
 * Created by Administrator on 2018-04-15.
 */
@Service
public class PersonServiceImpl implements IPersonService{

    @Autowired
    private personRepository repository;

    private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
    public Person getPerson(int id)
    {
        log.info("personServiceImpl's log");
        Person myperson=new Person();
        personEntity defaultPersonEntity=new personEntity();
        defaultPersonEntity.setId(2);
        defaultPersonEntity.setName("haha");
        personEntity person1=repository.findById(id).orElse(defaultPersonEntity);

        myperson.setId(person1.getId());
        myperson.setName(person1.getName());
        return myperson;
    }
    public boolean addPerson(Person person)
    {
        personEntity entity=new personEntity();
        BeanUtils.copyProperties(person,entity);
        personEntity person1=repository.save(entity);
        if(person1==null) return false;
        return true;
    }
}
