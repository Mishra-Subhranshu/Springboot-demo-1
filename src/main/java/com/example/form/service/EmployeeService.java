package com.example.form.service;

import com.example.form.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getById(Long id);

    public void saveOrUpdate(Employee employee);

    public void deleteEmployee(Long id);

//    public void updateEmployee(Employee employee);


}
