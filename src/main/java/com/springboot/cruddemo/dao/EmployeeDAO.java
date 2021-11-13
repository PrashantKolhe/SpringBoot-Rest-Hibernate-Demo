package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public void save(Employee employee);

    public Employee findById(int id);

    public void deleteByid(int id);

    public List<Employee> findAll();
}
