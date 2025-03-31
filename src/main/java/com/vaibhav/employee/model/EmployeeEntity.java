package com.vaibhav.employee.model;

import com.vaibhav.employee.response.EmployeeRequest;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="employee")
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

    public EmployeeEntity() {
    }

    public EmployeeEntity(int id, String empName, String jobName, double sly, LocalDate date) {
        this.id = id;
        this.empName = empName;
        this.jobName = jobName;
        this.sly = sly;
        this.dte = date;
    }

    public EmployeeEntity(EmployeeRequest employeeRequest) {
        this.empName=employeeRequest.getEmpName();
        this.jobName=employeeRequest.getJobName();
        this.sly=employeeRequest.getSly();
        this.dte =employeeRequest.getDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public double getSly() {
        return sly;
    }

    public void setSly(double sly) {
        this.sly = sly;
    }

    public LocalDate getDte() {
        return dte;
    }

    public void setDte(LocalDate dte) {
        this.dte = dte;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", jobName='" + jobName + '\'' +
                ", sl-`y=" + sly +
                ", date=" + dte +
                '}';
    }
}

