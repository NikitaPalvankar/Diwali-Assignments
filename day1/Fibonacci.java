package com.demo.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        fibonacciSeries(n);
        

	}
	
	public static void fibonacciSeries(int n) {
		System.out.println("Fibonacci Series up to " + n + " terms:");

        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
	}

}
