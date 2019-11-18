package com.cap.crud.Employee;

import java.util.Scanner;

import com.cap.crud.entities.Employee;
import com.cap.crud.service.EmployeeService;
import com.cap.crud.service.EmployeeServiceImpl;

public class EmpClient {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();
					
		System.out.println("Employee Details Form");
		System.out.println("==============================");
		System.out.println("1. Create Employee Details");
		System.out.println("2. Find Employee");
		System.out.println("3. Update Employee Details");
		System.out.println("4. Delete Employee Details");
		System.out.println("5.Display Employee List");
		int option = scanner.nextInt();
		Employee emp = new Employee();
		switch (option) {

		case 1:
			System.out.println("Enter your id:");
			int id = scanner.nextInt();
			System.out.println("Enter your name:");
			String name = scanner.next();
			System.out.println("Enter your salary");
			int sal = scanner.nextInt();
			System.out.println("Enter your address");
			String add = scanner.next();
			emp.setEmpId(id);
			emp.setEmpName(name);
			emp.setEsal(sal);
			emp.setAddress(add);

			service.addEmployee(emp);
			System.out.println("Employee Details Created Succesfully !");
			
			break;

		case 2:
			System.out.println("Enter your id:");
			int id1 = scanner.nextInt();
			emp = service.findEmployeeById(id1);
			System.out.print("ID:" + emp.getEmpId());
			System.out.println(" Name:" + emp.getEmpName());

			break;

		case 3:
			emp = service.findEmployeeById(101);
			System.out.print("ID:" + emp.getEmpId());
			System.out.println(" Name:" + emp.getEmpName());

			emp.setEmpName("Vennela Rao");
			service.updateEmployee(emp);
			System.out.println("Employee Details Updated Succesfully !");
			
			break;

		case 4:
			System.out.println("Enter your id:");
			int id2 = scanner.nextInt();
			emp = service.findEmployeeById(id2);
			service.removeEmployee(emp);
			System.out.println("Employee Details Removed Succesfully !");
			
			break;
			
		case 5:
			
			break;

		}
	}

}