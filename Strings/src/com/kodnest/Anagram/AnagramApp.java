package com.kodnest.Anagram;

import java.util.Scanner;

public class AnagramApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1 = sc.nextLine();
		System.out.println("Enter the 2nd String");
		String s2 = sc.nextLine();
		if(s1.length()== s2.length())
		{
			boolean res = Anagram.checkAnagram(s1,s2);
			if(res==true)
			{
				System.out.println("The entered string is an anagram");
			}
			else
			{
				System.out.println("The entered string is not an anagram");
			}
		}
		else
		{
			System.out.println("The entered String is not an anagram");
		}
		sc.close();

	}

}
