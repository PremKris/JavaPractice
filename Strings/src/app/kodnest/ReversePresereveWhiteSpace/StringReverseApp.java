package app.kodnest.ReversePresereveWhiteSpace;

import java.util.Scanner;

public class StringReverseApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println("The String before reversing is");
		System.out.println(s1);
		String res = StringReverse.rev(s1);
		System.out.println("The String after reversing is");
		System.out.println(res);
	}

}
