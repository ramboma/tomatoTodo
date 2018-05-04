package org.rambosoft.tomatoTodo.dao.repository;

import org.rambosoft.tomatoTodo.dao.Entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018-04-15.
 */
public interface personRepository extends CrudRepository<PersonEntity,Integer>{

}
