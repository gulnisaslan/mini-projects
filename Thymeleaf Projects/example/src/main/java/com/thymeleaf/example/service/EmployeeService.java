package com.thymeleaf.example.service;

import java.util.List;

import com.thymeleaf.example.models.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployess();
    void saveEmployee(Employee employee);
    Employee getByEmployeeId(Integer id);
    boolean deleteEmployee(Integer id);
}
