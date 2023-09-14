package app.kodnest.ReverseOfString;

import java.util.Scanner;

public class ReverseOfStringApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		
		String s1 = new String(sc.nextLine());
		System.out.println(s1);
		
		String s3 = ReverseOfString.rev(s1);
		
		System.out.println("After the reverse it is...");
		System.out.println(s3);
		

	}

}
