package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTest {
    @Autowired
    private SearchingFacade searchingFacade;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testSearchingFacadeCompany(){
        //Given
        Employee employee1 = new Employee("Firstname1", "LastName1");
        Employee employee2 = new Employee("Firstname2", "LastName2");
        Employee employee3 = new Employee("Firstname3", "Firstname3");

        Company firstCompany = new Company("First");
        Company secondCompany = new Company("Second");

        firstCompany.getEmployees().add(employee1);
        firstCompany.getEmployees().add(employee3);
        secondCompany.getEmployees().add(employee2);

        employee1.getCompanies().add(firstCompany);
        employee2.getCompanies().add(secondCompany);
        employee3.getCompanies().add(firstCompany);

        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);

        List<Company> companies = searchingFacade.findCompany("irs");

        //Then
        assertEquals(1, companies.size());

        //Clean up
        companyDao.deleteAll();

    }

    @Test
    public void testSearchingFacadeEmployee(){
        //Given
        Employee employee1 = new Employee("Firstname1", "LastName1");
        Employee employee2 = new Employee("Firstname2", "LastName2");
        Employee employee3 = new Employee("Firstname3", "Firstname3");

        Company firstCompany = new Company("First");
        Company secondCompany = new Company("Second");

        firstCompany.getEmployees().add(employee1);
        firstCompany.getEmployees().add(employee3);
        secondCompany.getEmployees().add(employee2);

        employee1.getCompanies().add(firstCompany);
        employee2.getCompanies().add(secondCompany);
        employee3.getCompanies().add(firstCompany);

        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);

        List<Employee> employees = searchingFacade.findEmployee("name1");

        //Then
        assertEquals(1, employees.size());

        //Clean up
        companyDao.deleteAll();
    }
}