package com.springboot.cruddemo.service;

import com.springboot.cruddemo.dao.EmployeeDAO;
import com.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

   private EmployeeDAO employeeDAO;

   @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAOIn){
        this.employeeDAO = employeeDAOIn;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void deleteByid(int id) {
        employeeDAO.deleteByid(id);
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
