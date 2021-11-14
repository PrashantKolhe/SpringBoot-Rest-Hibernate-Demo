package com.springboot.cruddemo.service;

import com.springboot.cruddemo.dao.EmployeeDAO;
import com.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public void save(Employee employee);

    public Employee findById(int id);

    public void deleteByid(int id);

    public List<Employee> findAll();

}
