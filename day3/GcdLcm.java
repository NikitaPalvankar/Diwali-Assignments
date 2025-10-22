package com.demo.day3;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
	
		   
	        int gcd = findGCD(num1, num2);
	        int lcm = (num1 * num2) / gcd;
	        System.out.println("GCD: " + gcd);
	        System.out.println("LCM: " + lcm);
	    }

	    static int findGCD(int num1, int num2) {
	        while (num2 != 0) {
	        	
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }
	        return num1;
	    
	}

}
