package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Employee;

import java.util.List;

public interface EmployeeProjectService {
    List<Employee> findAllEmployeesAndProjects();

    Employee findAllEmployeesAndProjectsById(int employeeId);

    void assignProjectToEmployee(int employeeId, int projectId);

    void removeAnEmployeeFromProject(int employeeId, int projectId);
}
