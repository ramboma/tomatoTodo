package org.rambosoft.tomatoTodo.service;

import org.rambosoft.tomatoTodo.Domain.Todo;

import java.util.List;

/**
 * Created by Administrator on 2018-04-15.
 */
public interface ITodoService {
    /**
     * 获取今天的todo列表
     * @return
     */
    List<Todo> getTodayTodoList();

}
