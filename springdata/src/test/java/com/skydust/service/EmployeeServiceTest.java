package com.skydust.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by laoliangliang on 17/5/25.
 */
public class EmployeeServiceTest {

    private ApplicationContext ctx = null;

    private EmployeeService employeeService;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeService = ctx.getBean(EmployeeService.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void update() throws Exception {
        employeeService.update(1, 22);
    }

}