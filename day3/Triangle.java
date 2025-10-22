package com.demo.day3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rows number: ");
		int row = sc.nextInt();
		triangle(row);

	}

	private static void triangle(int row) {
		// TODO Auto-generated method 
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}

}
