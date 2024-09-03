package com.employee.Employee.model;

import jakarta.persistence.*;

@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_salary")
    private Double empSalary;
    @Column(name = "emp_designation")
    private String empDesignation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary){
        this.empSalary = empSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation){
        this.empDesignation = empDesignation;
    }

}
