package org.rambosoft.tomatoTodo.service.impl;

import org.rambosoft.tomatoTodo.Domain.Todo;
import org.rambosoft.tomatoTodo.service.ITodoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-04-15.
 */
@Service
public class TodoServiceImpl implements ITodoService {
    public List<Todo> getTodayTodoList()
    {
        List<Todo> list=new ArrayList<Todo>();
        Todo sampleTodo=new Todo();
        sampleTodo.setTitle("first todo");
        sampleTodo.setRemark("remark");
        sampleTodo.setCreateTime("2017-10-1 11:23:04");
        list.add(sampleTodo);
        return list;
    }
}
