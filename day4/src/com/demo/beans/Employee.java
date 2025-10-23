package com.demo.beans;

public class Employee {

	 private String empName;
	 private int empID;
	 private String empRole;
	 
	 //No arguments constructor
	 public Employee() {
		super();
	 }
	 
	 
	 
	 public Employee(int empID) {
		super();
		this.empID = empID;
	}



	 //Constructor that accepts empId and empName (empRole is hardcoded) 
	 public Employee(String empName, int empID) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole= "Employee";
	 }

	 // Constructor that accepts empID, empName and empRole 
	 public Employee( int empID,String empName, String empRole) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empRole = empRole;
	 }

	 @Override
	 public boolean equals(Object obj) {

		 System.out.println("in equals method "+this.empID+"----"+((Employee)obj).empID);
			return this.empID==((Employee)obj).empID;
	 }

	 //getter setter methods
	 public String getEmpName() {
		return empName;
	}

	 public void setEmpName(String empName) {
		 this.empName = empName;
	 }

	 public int getEmpID() {
		 return empID;
	 }

	 public void setEmpID(int empID) {
		 this.empID = empID;
	 }

	 public String getEmpRole() {
		 return empRole;
	 }

	 public void setEmpRole(String empRole) {
		 this.empRole = empRole;
	 }

	 //toString method
	 @Override
	 public String toString() {
		return "Employee [empName:" + empName + ", empID:" + empID + ", empRol:" + empRole + "]";
	 }
	 
	 
	 
	 
	 
	 
	 
}
