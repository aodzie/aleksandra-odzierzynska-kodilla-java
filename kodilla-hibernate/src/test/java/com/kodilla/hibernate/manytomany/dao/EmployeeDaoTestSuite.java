package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testNamesQuariesEmployee(){
        //GIven
        Employee employee1 = new Employee("firstname1", "lastname1");
        Employee employee2 = new Employee("firstname2", "lastname2");

       employeeDao.save(employee1);
        int employee1ID = employee1.getId();

        employeeDao.save(employee2);
        int employee2ID = employee2.getId();

        //When
        List<Employee> employees = employeeDao.retrieveWithLastName("lastname1");

        //Then
        assertEquals(1, employees.size());

        //Cleanup
        try {
            employeeDao.deleteById(employee1ID);
            employeeDao.deleteById(employee2ID);
        }catch (Exception e) {
            //do nothing
        }
    }

}
