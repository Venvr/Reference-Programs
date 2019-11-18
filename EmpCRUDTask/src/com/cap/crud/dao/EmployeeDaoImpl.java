package com.cap.crud.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cap.crud.entities.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	
	private EntityManager entityManager;
	
	public EmployeeDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		entityManager.persist(emp);
	}	
	

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public Employee getEmpById(int empid) {
		Employee emp = entityManager.find(Employee.class, empid);
		return emp;
	}

	@Override
	public void updateStudent(Employee emp) {
		// TODO Auto-generated method stub
		entityManager.merge(emp);
	}

	@Override
	public void removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		entityManager.remove(emp);
	}

	
       
    }    
	
	


