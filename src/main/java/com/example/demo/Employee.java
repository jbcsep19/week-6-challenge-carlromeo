package com.example.demo;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;

    private String employeeName;
    private String employeeJobTitle;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public void setEmployeeJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
