package com.skydust.dao;

import com.skydust.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by laoliangliang on 17/5/24.
 */
public class StudentDAOSpringJdbcImplTest {

    private ApplicationContext ctx = null;

    @Before
    public void setup() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("setup");
    }

    @After
    public void tearDown() {
        ctx = null;
        System.out.println("tearDown");
    }

    @Test
    public void query() throws Exception {
        StudentDAO studentDAOSpringJdbc = (StudentDAO) ctx.getBean("studentDAOSpringJdbc");
        List<Student> students = studentDAOSpringJdbc.query();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}