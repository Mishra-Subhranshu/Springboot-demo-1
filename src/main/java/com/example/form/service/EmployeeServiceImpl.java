package com.example.form.service;

import com.example.form.model.Employee;
import com.example.form.repository.EmployeeRepository;
import com.example.form.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

//    @Override
//    public ResponseEntity<Employee> updateEmployee(Employee employee) {
//
//        return repository.save(employee);
//    }
}
