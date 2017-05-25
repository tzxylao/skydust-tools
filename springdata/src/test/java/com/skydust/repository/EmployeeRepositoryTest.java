package com.skydust.repository;

import com.skydust.domain.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by laoliangliang on 17/5/25.
 */
public class EmployeeRepositoryTest {

    private ApplicationContext ctx = null;

    private EmployeeRepository employeeRepository = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeRepository = ctx.getBean(EmployeeRepository.class);
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void findByName() throws Exception {
        Employee zhangsan = employeeRepository.findByName("zhangsan");
        System.out.println(zhangsan);
    }

    @Test
    public void testQueryParams() throws Exception {
        List<Employee> zhangsan = employeeRepository.queryParams("zhangsan", 20);
        for (Employee employee : zhangsan) {
            System.out.println(employee);
        }
    }

}