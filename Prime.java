package com.demo.day1;

import java.util.Scanner;

public class Prime {
	
	public static boolean primeNum(int num) {
		if (num <= 1) {
            return false; 
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();	
		boolean prime = primeNum(num);
		System.out.println(prime);
	}

}
