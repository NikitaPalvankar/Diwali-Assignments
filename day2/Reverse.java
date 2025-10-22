package com.demo.day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		reverseNum(num);
	}

	private static void reverseNum(int num) {
		// TODO Auto-generated method stub
		int rem=0, rev = 0;//4872
		for (int i = num; i > 0; i=i /10) {
			rem = i % 10;
			rev= rev*10+rem;
			

		}
		System.out.println("Reverse of number is "+rev);
	}

}
