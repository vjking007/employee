package com.vaibhav.employee.response;

import java.time.LocalDate;

public class EmployeeRequest {

    private String empName;
    private String jobName;
    private double sly;
    private LocalDate date;

    public EmployeeRequest(String empName, String jobName, double sly) {
        this.empName = empName;
        this.jobName = jobName;
        this.sly = sly;
        this.date = LocalDate.now();
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
