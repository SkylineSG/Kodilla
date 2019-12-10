package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesAndCompaniesFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesAndCompaniesFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompany (String field) throws SearchingException{
        List<Company> companies = companyDao.getCompanyName(field);

        if(companies.isEmpty()){
            throw new SearchingException(SearchingException.ERR_NO_COMPANY);
        }
        return companies;
    }

    public List<Employee> findEmployee (String field) throws SearchingException {
        List<Employee> employees = employeeDao.getEmployeeName(field);

        if(employees.isEmpty()){
            throw new SearchingException(SearchingException.ERR_NO_EMPLOYEE);
        }
        return employees;
    }
}
