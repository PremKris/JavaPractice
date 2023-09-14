package app.kodnest.Palindrome;

import java.util.Scanner;

import app.kodnest.ReverseOfString.ReverseOfString;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String to be reversed");
		String s1 = new String(sc.nextLine());
		System.out.println(s1);
		boolean res = Palindrome.isPalindrome(s1);
		if(res == true)
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");

		}
		

	}

}
