package com.skydust.dao;

import com.skydust.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by laoliangliang on 17/5/24.
 */
public class StudentDAOSpringJdbcImpl implements StudentDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> query() {
        final List<Student> students = new ArrayList<Student>();
        String sql = "select id,name,age from student";
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Student student = new Student();
                student.setAge(age);
                student.setId(id);
                student.setName(name);
                students.add(student);
            }
        });
        return students;
    }
}
