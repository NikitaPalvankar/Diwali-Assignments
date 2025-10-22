package com.demo.day3;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		Multiplication(num);
	}

	private static void Multiplication(int num) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication table of "+num+ " : " );
		for(int i = 1; i<=10; i++) {
			System.out.println(i+" * "+num+" = "+ i*num);
		}

	}
}
