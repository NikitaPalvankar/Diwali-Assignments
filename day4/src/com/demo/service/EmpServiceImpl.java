package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{

private EmpDao edao;
    
    
	public EmpServiceImpl() {
		edao=new EmpDaoImpl();
	}

	
	@Override
	public boolean addNewEmployee() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int empID=sc.nextInt();
		System.out.println("Enter name");
		String empName=sc.next();
		System.out.println("Enter Role");
		String empRole = sc.nextLine();
         
		Employee e=new Employee(empID, empName,  empRole);
		return edao.save(e);
	}


	@Override
	public boolean deleteById(int empID) {
		// TODO Auto-generated method stub
		
		return edao.remove(empID);
	}


	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}


	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		return edao.sortById();
	}


	@Override
	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		return edao.findByName(empName);
	}

}
