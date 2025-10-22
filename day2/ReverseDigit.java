package com.demo.day2;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number: ");
				int num = sc.nextInt();
				int num1= reverse(num);
				System.out.println(num1);
	}
	    public static int reverse(int n) {
	        int rev = 0;

	        while (n != 0) {
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n = n / 10;
	        }

	        return rev;
	    }


}
