package com.springboot.cruddemo.controller;

import com.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class EmployeeController {

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        //save employee

        return employee;
    }

}
