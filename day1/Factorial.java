package com.demo.day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = fact(n);
        System.out.println("Factorial of "+ n +" : "+factorial);
    }

    // Function to calculate factorial
    public static long fact(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i
        }

        return result;
    }

	
}
