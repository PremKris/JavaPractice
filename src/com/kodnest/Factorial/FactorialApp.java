package com.kodnest.Factorial;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Factorial facto = new Factorial();
		int res=facto.fact(num);
		System.out.println(res);
	
	}

}
