package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class TestEmpManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 EmpService eservice=new EmpServiceImpl();
	        int choice;
	        do {
	            System.out.println("\n--- Employee Menu ---\n1. Add Employee \n2. Remove Employee");
	            System.out.println("3. Show All Employees \n4. Show Sorted Employees \n5. Find Employee by Name");
	            System.out.println("6. Save to File \n7. Quit \nEnter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch(choice) {
	            //1. Add Employee
	            case 1->{
	            	boolean status=eservice.addNewEmployee();
					if(status) {
						System.out.println("Employee added successfully");
					}else {
						System.out.println("Employee not found");
					}
	            }
	            //2. Remove Employee
	            case 2->{
	            	System.out.println("Enter id for delete");
					int empID=sc.nextInt();
					boolean status=eservice.deleteById(empID);
					if(status) {
						System.out.println("Employee deleted successfully");
					}else {
						System.out.println("Employee not found");
					}
	            }
	            //3. Show All Employees
	            case 3->{
	            	List<Employee> elist=eservice.displayAll();
					//display data
					elist.forEach(System.out::println);
	            }
	            //4. Show Sorted Employees
	            case 4->{
	            	List<Employee> lst=eservice.sortById();
					lst.forEach(System.out::println);
	            }
	            //5. Find Employee by Name
	            case 5->{
	            	System.out.println("Enter name for searching");
					String nm=sc.next();
					List<Employee> elst=eservice.findByName(nm);
					if(elst!=null) {
						elst.forEach(System.out::println);
					}else{
						System.out.println("not found");
					}
	            }
	            //6. Save to File
	            case 6->{}
	            //7. Quit
	            case 7->{
	            	sc.close();
	            	System.out.println("Thankyou for Visiting!!!");
	            }
	            default ->{
	            	System.out.println("Invalid Choice");
	            }
	            
	            
	            }
	            
	        }
	        while(choice != 7);
	}

}
