package com.demo.day2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean status=isArmstrong(num);
		System.out.println(status);
		
	}

	public static int isCount(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n > 0);
		return count;
	}

	public static int Power(int m, int n) {
		int pow = 1;
		while (n > 0) {
			pow = pow * m;
			n--;
		}
		return pow;
	}

	public static boolean isArmstrong(int n) {
		int sum = 0, temp = n, dc = isCount(n);
		while (n > 0) {
			int ld = n % 10;
			sum = sum + Power(ld, dc);
			n = n / 10;
		}
		//return sum == temp;
		if (sum == temp) {
			return true;
//			System.out.println("Armstrong Number");
		} else {
			return false;
			// System.out.println("Not Armstrong Number");
		}

	}

}
