package org.rambosoft.tomatoTodo.service.impl;

import javassist.tools.reflect.Sample;
import org.rambosoft.tomatoTodo.Domain.Todo;
import org.rambosoft.tomatoTodo.service.ITodoService;
import org.rambosoft.tomatoTodo.utility.SampleLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        SampleLogger.logger.info("haha,info info!");
        SampleLogger.logger.debug("haha,debug info!");
        SampleLogger.logger.warn("haha,warn info!");
        SampleLogger.logger.error("haha,error info!");
        List<Todo> list=new ArrayList<Todo>();
        Todo sampleTodo=new Todo();
        sampleTodo.setTitle("first todo");
        sampleTodo.setRemark("remark");
        sampleTodo.setCreateTime("2017-10-1 11:23:04");
        list.add(sampleTodo);
        return list;
    }

}
