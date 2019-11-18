package com.cap.crud.dao;

import com.cap.crud.entities.Employee;


public interface EmployeeDao {

	public abstract void addEmployee(Employee emp);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

	public abstract Employee getEmpById(int empid);

	public abstract void updateStudent(Employee emp);

	public abstract void removeEmployee(Employee emp);




}
