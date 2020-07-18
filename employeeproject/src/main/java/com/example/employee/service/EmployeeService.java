package com.example.employee.service;

import org.springframework.data.repository.CrudRepository;

import com.example.employee.model.Requests;

public interface EmployeeService extends CrudRepository<Requests,Integer>{

}
