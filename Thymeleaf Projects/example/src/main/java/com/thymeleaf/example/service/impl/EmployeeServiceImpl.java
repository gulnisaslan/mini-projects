package com.thymeleaf.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymeleaf.example.models.Employee;
import com.thymeleaf.example.repository.EmployeeRepository;
import com.thymeleaf.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployess() {
        
        return this.employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
        
    }

    @Override
    public Employee getByEmployeeId(Integer id) {
        // TODO Auto-generated method stub
        Optional<Employee> emp = this.employeeRepository.findById(id);
        Employee employee = null;
        if(emp.isPresent()){
            employee=emp.get();
        }else{
            throw new RuntimeException("Employee not found id: "+id);
        }
        return employee;
    }

    @Override
    public boolean deleteEmployee(Integer id) {
        // TODO Auto-generated method stub
        this.employeeRepository.deleteById(id);
        return true;
    }
    
}
