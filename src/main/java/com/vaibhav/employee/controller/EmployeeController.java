package com.vaibhav.employee.controller;

import com.vaibhav.employee.response.EmployeeRequest;
import com.vaibhav.employee.response.EmployeeResponse;
import com.vaibhav.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeRequest employeeRequest){
        return employeeService.saveEmployee(employeeRequest);
    }

    @GetMapping("/fetch")
    public List<EmployeeResponse> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public String deleteEmployee(@PathVariable int id, @RequestBody EmployeeRequest employeeRequest){
        return employeeService.updateEmployee(employeeRequest, id);
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeesById(id);
    }
}
