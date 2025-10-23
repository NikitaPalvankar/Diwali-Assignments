package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmpDaoImpl implements EmpDao {

	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Employee(100, "Manjiri", "Employee"));
		elist.add(new Employee(101, "Gauri", "Employee"));
		elist.add(new Employee(103, "Kanchan", "Employee"));
	}

	// to add new employee
	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		elist.add(e);
		return true;
	}

	// to remove employee
	@Override
	public boolean remove(int empID) {
		// TODO Auto-generated method stub
		return elist.remove(new Employee(empID));
	}

	// Show All Employees
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return elist;
	}

	// Show Sorted Employees
	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		List<Employee> lst = new ArrayList<>();
		for (Employee e : elist) {
			lst.add(e);
		}
		lst.sort(null);
		return lst;
	}

	//findByName
	@Override
	public List<Employee> findByName(String empName) {
		// TODO Auto-generated method stub
		List<Employee> temp = elist.stream()
				.filter(emp -> emp.getEmpName().equals(empName))
				.collect(Collectors.toList());

		if (temp.size() > 0) {
			return temp;
		}
		return null;
	}

}
