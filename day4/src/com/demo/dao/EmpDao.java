package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpDao {

	boolean save(Employee e);

	boolean remove(int empID);

	List<Employee> findAll();

	List<Employee> sortById();

	List<Employee> findByName(String empName);

}
