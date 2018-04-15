package org.rambosoft.tomatoTodo.api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

/**
 * Created by Administrator on 2018-04-15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ToDoControllerTest {
    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate template;
    @Before
    public void setUp() throws Exception
    {
        this.base=new URL("http://localhost:"+port+"/todo/");
    }
    @Test
    public void getTodoList_should_return_todolist()
    {
        String url=base.toString()+"list";
        ResponseEntity<String> response=template.getForEntity(url, String.class);
        assertThat(response.getBody(),equalTo("todolist"));
    }

}