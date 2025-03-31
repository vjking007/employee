package com.vaibhav.employee.response;

import com.vaibhav.employee.model.EmployeeEntity;

import java.time.LocalDate;

public class EmployeeResponseDTO {

    private int id;
    private String empName;
    private String jobName;
    private double sly;
    private LocalDate date;

    public EmployeeResponseDTO(int id, String empName, String jobName, double sly, LocalDate date) {
        this.id=id;
        this.empName = empName;
        this.jobName = jobName;
        this.sly = sly;
        this.date = date;
    }
    public EmployeeResponseDTO(EmployeeEntity employeeEntity) {
        this.id=employeeEntity.getId();
        this.empName = employeeEntity.getEmpName();
        this.jobName = employeeEntity.getJobName();
        this.sly = employeeEntity.getSly();
        this.date = employeeEntity.getDte();
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
