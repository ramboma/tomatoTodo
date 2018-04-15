package org.rambosoft.tomatoTodo.api;

import org.rambosoft.tomatoTodo.Domain.Person;
import org.rambosoft.tomatoTodo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018-04-15.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    IPersonService iPersonService;
    @GetMapping("get")
    public Person getPersonById(int id)
    {
       return iPersonService.getPerson(id);
    }
    @PostMapping("add")
    public boolean addPerson(@RequestBody Person person)
    {
        return iPersonService.addPerson(person);
    }
}
