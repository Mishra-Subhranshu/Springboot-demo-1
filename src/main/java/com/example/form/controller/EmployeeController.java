package com.example.form.controller;

import com.example.form.model.Employee;
import com.example.form.repository.EmployeeRepository;
import com.example.form.service.EmployeeService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee addEmployee (@RequestBody Employee employee) {
        service.saveOrUpdate(employee);
        return employee;
    }

    @GetMapping("/list")
    public List<Employee> list() {
        return service.getAllEmployee();
    }

    @GetMapping("/list/{id}")
    public Employee getById(@PathVariable long id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable (value = "id")long id) {
        service.deleteEmployee(id);
        return "Deleted Successfully id = "+id;
    }

    @Autowired
    EmployeeRepository employeeRepository;

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {

        try {
            return new ResponseEntity<Employee>(employeeRepository.save(employee), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
