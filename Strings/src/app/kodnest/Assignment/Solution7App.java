package app.kodnest.Assignment;

import java.util.Scanner;

public class Solution7App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = new String(sc.nextLine());
		s1 = Solution7.replace(s1);
		System.out.println(s1);

	}

}
