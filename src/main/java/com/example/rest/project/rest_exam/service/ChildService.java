package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Child;

import java.util.List;

public interface ChildService {
    List<Child> findAll();

    Child findById(int id);

    void create(Child child);

    void addChildToEmployee(Child child, int employeeId);

    void addChildToEmployeeById(int employeeId, int childId);

    void update(Child child, int id);

    void delete(int id);
}
