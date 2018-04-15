package org.rambosoft.tomatoTodo.api;

import org.rambosoft.tomatoTodo.Domain.Todo;
import org.rambosoft.tomatoTodo.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018-04-15.
 */
@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ITodoService iTodoService;
    @GetMapping(value="list")
    public List<Todo> getTodoList()
    {
       return iTodoService.getTodayTodoList();
    }
}
