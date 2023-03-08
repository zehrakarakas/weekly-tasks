package com.cydeo.controller;

import com.cydeo.Model.Employee;
import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService; //dependency injection

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/register")
    public String createEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());

        return "employee/employee-create";
    }

    @PostMapping("/insert")
    public String insertEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult bindingResult,Model model) { //our employee valid or not so we add @Valid

        if(bindingResult.hasErrors()){
            model.addAttribute("stateList", DataGenerator.getAllStates());//if write invalid data state list dissapper so we added inside the if statement
            return "employee/employee-create";  // if give error page doesnt change.//redirect kullanamiyoruz yeni object kurar//other data disepear

        }


        employeeService.saveEmployee(employee);

        return "redirect:/employee/list";//with redirect we are using endpoints
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employeeList",employeeService.readAllEmployees());
     return "employee/employee-list";//without redirect we are using html file path
    }


}


