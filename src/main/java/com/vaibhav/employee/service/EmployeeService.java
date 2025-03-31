package com.vaibhav.employee.service;

import com.vaibhav.employee.model.EmployeeEntity;
import com.vaibhav.employee.repository.EmployeeRepository;
import com.vaibhav.employee.response.EmployeeRequest;
import com.vaibhav.employee.response.EmployeeResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmployee(EmployeeRequest employeeRequest){
        EmployeeEntity employee=new EmployeeEntity(employeeRequest);
        if(employee !=null){
            employeeRepository.save(employee);
            return "Employee Save Successfully";
        } else {
            return "Employee Save Successfully";
        }
    }

    public List<EmployeeResponse> getEmployees(){

        List<EmployeeEntity> employeeEntities= (List<EmployeeEntity>)
                employeeRepository.findAll();

        return employeeEntities.stream()
                .map(EmployeeResponse::new)
                .toList();
    }

    public String deleteEmployeeById(int id){
      return employeeRepository.findById(id)
                .map(dlt-> {
                        employeeRepository.delete(dlt);
                return "Deleted Successfully.";
                })
                .orElse("Employee Not Found");
    }

    public String updateEmployee(EmployeeRequest employeeRequest, int id){
        return employeeRepository.findById(id)
                .map(dlt-> {
                    dlt.setEmpName(employeeRequest.getEmpName());
                    dlt.setJobName(employeeRequest.getJobName());
                    dlt.setDte(employeeRequest.getDate());
                    dlt.setSly(employeeRequest.getSly());
                    employeeRepository.save(dlt);
                    return "Updated Successfully.";
                })
                .orElse("Employee Not Updated. Please Check Id");
    }

    public EmployeeResponse getEmployeesById(int id){
        return employeeRepository.findById(id)
                          .map(EmployeeResponse::new)
                          .orElseThrow(()->new EntityNotFoundException("Employee not found with id : "+id));
    }
}
