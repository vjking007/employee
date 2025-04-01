package com.vaibhav.employee.model;

import com.vaibhav.employee.response.EmployeeRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "salary")
    private double sly;

    @Column(name = "hire_date")
    private LocalDate dte;

    public EmployeeEntity(EmployeeRequestDTO employeeRequest) {
        this.empName=employeeRequest.getEmpName();
        this.jobName=employeeRequest.getJobName();
        this.sly=employeeRequest.getSly();
        this.dte =employeeRequest.getDate();
    }
}

