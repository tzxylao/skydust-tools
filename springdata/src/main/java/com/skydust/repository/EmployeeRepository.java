package com.skydust.repository;

import com.skydust.domain.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by laoliangliang on 17/5/25.
 */
//使用注释的方式也可以，不继承Repository
//@RepositoryDefinition(domainClass = Employee.class,idClass = Integer.class)
public interface EmployeeRepository extends Repository<Employee, Integer> {

    Employee findByName(String name);

    @Query(nativeQuery = true, value = "select * from employee o where o.name = ?1 and o.age = ?2")
    List<Employee> querySParams(String name, Integer age);


    @Query(value = "select o from Employee o where o.name = ?1 and o.age = ?2")
    List<Employee> queryParams(String name, Integer age);

    @Modifying
    @Query("update Employee o set o.age = :age where o.id = :id")
    void update(@Param("id") Integer id, @Param("age") Integer age);
}
