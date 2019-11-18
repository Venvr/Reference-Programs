package com.cap.crud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeDet")
public class Employee {

	@Id
	
	private int empId;
	
	private String empName;
	
	private int esal;
	
	private String address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
