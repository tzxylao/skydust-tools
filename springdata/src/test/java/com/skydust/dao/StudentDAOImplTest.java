package com.skydust.dao;

import com.skydust.domain.Student;
import org.junit.Test;

import java.util.List;

/**
 * Created by laoliangliang on 17/5/24.
 */
public class StudentDAOImplTest {
    @Test
    public void query() throws Exception {
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> query = studentDAO.query();
        for (Student student : query) {
            System.out.println(student);
        }
    }

}