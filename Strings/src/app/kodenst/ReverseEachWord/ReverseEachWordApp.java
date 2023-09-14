package app.kodenst.ReverseEachWord;

import java.util.Scanner;

public class ReverseEachWordApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		System.out.println("The entered string is");
		System.out.println(s1);
		String res = ReverseEachWord.rev(s1);
		System.out.println("The entered string after reversing is");
		System.out.println(res);
		
		

	}

}
