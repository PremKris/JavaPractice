package com.kodnest.Factorial;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int m = sc.nextInt();
		System.out.println("Enter the second number");
		int n = sc.nextInt();
		GCD g = new GCD();
		int res = g.gcdFinder(m,n);
		System.out.println("The grestest common divisor is "+res);
		System.out.println(res);
		
	}

}
