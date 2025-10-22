package com.demo.day3;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int first = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int sec = sc.nextInt();
		
		int sum =add(first, sec);
		System.out.println("Addtion of two numbers is " + sum);
		
	}

	private static int add(int first, int sec) {
		// TODO Auto-generated method stub
		int sum =0;
		sum = first + sec;
		return sum;
	}

}
