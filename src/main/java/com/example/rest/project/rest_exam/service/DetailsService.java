package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Details;

import java.util.List;

public interface DetailsService {
    List<Details> findAll();

    Details findById(int id);

    void create(Details details);

    void addDetailsToEmployee(Details details, int employeeId);

    void addDetailsToEmployeeById(int employeeId, int detailsId);

    void update(Details details, int id);

    void delete(int id);
}
