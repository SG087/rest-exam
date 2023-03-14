package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();

    Project findById(int id);

    void create(Project project);

    void addEmployeeTheProject(int employeeId, int projectId);

    void update(Project project, int id);

    void delete(int id);

}
