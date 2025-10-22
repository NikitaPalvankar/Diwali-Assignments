package com.demo.day3;

import java.util.Scanner;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int sum =add(num);
		System.out.println("Addtion is " + sum);

	}

	private static int add(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i = num; i>0; ) {
			int rem = i % 10;
			sum = sum + rem;
			i = i / 10;
		}
		return sum;
	}

}






















