package com.kodnest.FrequencyOfChar;

import java.util.Scanner;

public class FrequencyOfCharApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		FrequencyOfChar.frequency(s1);
		

	}

}
