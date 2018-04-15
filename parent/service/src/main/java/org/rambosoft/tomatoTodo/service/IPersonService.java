package org.rambosoft.tomatoTodo.service;

import org.rambosoft.tomatoTodo.Domain.Person;

/**
 * Created by Administrator on 2018-04-15.
 */
public interface IPersonService {
   Person getPerson(int id);
   boolean addPerson(Person person);
}
