package com.demo.day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int n = sc.nextInt();
	        evenOdd(n);
	}
	
	public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even number.");
        } else {
            System.out.println(num + " is Odd number.");
        }
	}

}
