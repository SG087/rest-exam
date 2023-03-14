package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    void create(Employee employee);

    void update(Employee employee, int id);

    void delete(int id);
}
