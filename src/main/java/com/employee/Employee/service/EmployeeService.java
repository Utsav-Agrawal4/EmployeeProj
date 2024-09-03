package com.employee.Employee.service;

import com.employee.Employee.model.Employee;
import com.employee.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {

        Employee emp = employeeRepository.save(employee);
        return emp;
    }

    public Employee updateEmployee(Integer id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id" + id));
        employee.setEmpName(employeeDetails.getEmpName());
        employee.setEmpSalary(employeeDetails.getEmpSalary());
        employee.setEmpDesignation(employeeDetails.getEmpDesignation());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id" + id));
        employeeRepository.delete(employee);
    }

}
