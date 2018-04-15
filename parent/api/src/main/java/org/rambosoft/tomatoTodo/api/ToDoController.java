package org.rambosoft.tomatoTodo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-15.
 */
@RestController
@RequestMapping("/todo")
public class ToDoController {
    @GetMapping(value="list")
    public String getTodoList()
    {
       return "todo list";
    }
}
