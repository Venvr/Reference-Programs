package com.cap.crud.service;


import com.cap.crud.dao.EmployeeDao;
import com.cap.crud.dao.EmployeeDaoImpl;
import com.cap.crud.entities.Employee;




public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee findEmployeeById(int empid) {
		Employee emp  = dao.getEmpById(empid);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(emp);
		dao.commitTransaction();
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
	}

	



}
