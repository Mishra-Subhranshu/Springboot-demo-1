package com.example.form.converter;

import com.example.form.model.Employee;
import com.example.form.model.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeConverter {

    public EmployeeDto entityToDto(Employee employee) {
        EmployeeDto employeeDto= new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setAddress(employee.getAddress());
        return employeeDto;
    }

    public List<EmployeeDto> entityToDto(List<Employee> employees) {
        return employees.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
    }


    public Employee dtoToEntity(EmployeeDto employeeDto) {
        Employee employee= new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setAddress(employeeDto.getAddress());
        return employee;
    }

    public List<Employee> dtoToEntity(List<EmployeeDto> dtos) {
        return dtos.stream().map(x-> dtoToEntity(x)).collect(Collectors.toList());
    }

}
