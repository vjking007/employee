package com.vaibhav.employee.controller;

import com.vaibhav.employee.response.EmployeeRequestDTO;
import com.vaibhav.employee.response.EmployeeResponseDTO;
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
    public String saveEmployee(@RequestBody EmployeeRequestDTO employeeRequest){
        return employeeService.saveEmployee(employeeRequest);
    }

    @GetMapping("/fetch")
    public List<EmployeeResponseDTO> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public String deleteEmployee(@PathVariable int id, @RequestBody EmployeeRequestDTO employeeRequest){
        return employeeService.updateEmployee(employeeRequest, id);
    }

    @GetMapping("/{id}")
    public EmployeeResponseDTO getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeesById(id);
    }
}
