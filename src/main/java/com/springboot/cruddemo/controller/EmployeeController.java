package com.springboot.cruddemo.controller;

import com.springboot.cruddemo.entity.Employee;
import com.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        //save employee
        employeeService.save(employee);
        return employee;
    }

}
