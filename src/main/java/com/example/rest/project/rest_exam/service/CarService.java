package com.example.rest.project.rest_exam.service;

import com.example.rest.project.rest_exam.models.Car;

import java.util.List;


public interface CarService {
    List<Car> findAll();

    Car findById(int id);

    void create(Car car);

    void addCarToEmployee(Car car, int employeeId);

    void addCarToEmployeeById(int employeeId, int carId);

    void update(Car car, int id);

    void delete(int id);
}
