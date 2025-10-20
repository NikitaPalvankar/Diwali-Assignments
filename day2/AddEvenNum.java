package com.demo.day2;

import java.util.Scanner;

public class AddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sumEven(num);
		
		
	}
	
	public static void sumEven(int num) {
		if(num==0)
			System.out.println("Please enter a positive number.");
		int sum=0;
		System.out.print("Even numbers are: ");
		for(int i = 1; i<=num; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				sum +=i;
			}
			
		}
		System.out.println("\nSum of first "+num +" even number: "+ sum);
		
	}

}
