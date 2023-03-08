package com.cydeo.service;

import com.cydeo.Model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {  // kaydedilen emloyeeleri listeleyen kisimi olusturduk

    public static List<Employee> employeeList=new ArrayList<>();

    public void saveEmployee(Employee employee){
        employeeList.add(employee);
    }
    public List<Employee> readAllEmployees(){
        return employeeList;
    }
}
