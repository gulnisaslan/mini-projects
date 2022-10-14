package com.thymeleaf.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.thymeleaf.example.models.Employee;
import com.thymeleaf.example.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/")
    public String getAllEmployees( Model model) {
        model.addAttribute("listEmployees", this.employeeService.getAllEmployess());
        return  "index";
    }
    
    @GetMapping(value = "/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee =new Employee();
        model.addAttribute("employee", employee);
        return "newEmployee";
     }

    @GetMapping(value = "/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Integer id,Model model){
        Employee employee = this.employeeService.getByEmployeeId(id);

        model.addAttribute("employee", employee);
        return "updateEmployeeForm";

    }
   
    @PostMapping(value="/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";

    }
    @GetMapping(value = "/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        this.employeeService.deleteEmployee(id);
        return "redirect:/";
    }
    
    
}

