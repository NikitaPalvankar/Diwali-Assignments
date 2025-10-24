package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmpService {

	boolean addNewEmployee();

	boolean deleteById(int eid);

	List<Employee> displayAll();

	List<Employee> sortById();

	List<Employee> findByName(String nm);

}
