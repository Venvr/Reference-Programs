package com.cap.crud.service;

import java.util.List;

import com.cap.crud.entities.Employee;


public interface EmployeeService {

	public abstract void addEmployee(Employee emp);

	public abstract Employee findEmployeeById(int empid);

	public abstract void updateEmployee(Employee emp);

	public abstract void removeEmployee(Employee emp);

	

}
