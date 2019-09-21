package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQuery() {
        //Given
        Employee employee1 = new Employee("John", "Trawolta");
        Employee employee2 = new Employee("Julia", "Kowalska");
        Employee employee3 = new Employee("Mateusz", "Dąbrowski");
        Employee employee4 = new Employee("Kinga", "Moniuszko");
        Employee employee5 = new Employee("Artur", "Słowacki");
        Employee employee6 = new Employee("Maurycy", "Fiołek");

        Company company1 = new Company("LuxProgramming");
        Company company2 = new Company("CompanyOfFuture");
        Company company3 = new Company("GreenWorld");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee3);
        company2.getEmployees().add(employee4);
        company3.getEmployees().add(employee5);
        company3.getEmployees().add(employee6);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee3.getCompanies().add(company2);
        employee4.getCompanies().add(company2);
        employee5.getCompanies().add(company3);
        employee6.getCompanies().add(company3);

        //When
        employeeDao.save(employee1);
        int employee1_ID = employee1.getId();
        employeeDao.save(employee2);
        int employee2_ID = employee2.getId();
        employeeDao.save(employee3);
        int employee3_ID = employee3.getId();
        employeeDao.save(employee4);
        int employee4_ID = employee4.getId();
        employeeDao.save(employee5);
        int employee5_ID = employee5.getId();
        employeeDao.save(employee6);
        int employee6_ID = employee6.getId();


        //When
        List<Employee> employeeLastName = employeeDao.retrieveEmployeesWithLastNameEqualTo("John");


        //Then
        Assert.assertEquals(1, employeeLastName.size());

        //CleanUp
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);
            employeeDao.delete(employee4);
            employeeDao.delete(employee5);
            employeeDao.delete(employee6);

            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
            //do nothing
        }
    }


    @Test
    public void testNativeNamedQuery() {
        //Given
        Employee employee1 = new Employee("John", "Twaf");
        Employee employee2 = new Employee("Julia", "Kowalska");
        Employee employee3 = new Employee("Mateusz", "Dąbrowski");
        Employee employee4 = new Employee("Kinga", "Moniuszko");
        Employee employee5 = new Employee("Artur", "Słowacki");
        Employee employee6 = new Employee("Maurycy", "Fiołek");

        Company company1 = new Company("LuxProgramming");
        Company company2 = new Company("CompanyOfFuture");
        Company company3 = new Company("GreenWorld");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee3);
        company2.getEmployees().add(employee4);
        company3.getEmployees().add(employee5);
        company3.getEmployees().add(employee6);

        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company1);
        employee3.getCompanies().add(company2);
        employee4.getCompanies().add(company2);
        employee5.getCompanies().add(company3);
        employee6.getCompanies().add(company3);

        //When
        employeeDao.save(employee1);
        int employee1_ID = employee1.getId();
        employeeDao.save(employee2);
        int employee2_ID = employee2.getId();
        employeeDao.save(employee3);
        int employee3_ID = employee3.getId();
        employeeDao.save(employee4);
        int employee4_ID = employee4.getId();
        employeeDao.save(employee5);
        int employee5_ID = employee5.getId();
        employeeDao.save(employee6);
        int employee6_ID = employee6.getId();

        //When
        List<Company> companyGreFirstTreeLetters = companyDao.retrieveCompaniesWithFirstThreeLettersOfNameEqualTo("GRE");

        //Then
        Assert.assertEquals(1, companyGreFirstTreeLetters.size());

        //CleanUp
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);
            employeeDao.delete(employee4);
            employeeDao.delete(employee5);
            employeeDao.delete(employee6);
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
        } catch (Exception e) {
            //do nothing
        }
    }

}