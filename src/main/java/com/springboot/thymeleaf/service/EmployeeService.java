package com.springboot.thymeleaf.service;

import com.springboot.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int id);

    public void saveEmployee(Employee employee);

    public void deleteEmployeeById(int id);
}
