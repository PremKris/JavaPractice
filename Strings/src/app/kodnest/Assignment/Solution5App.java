package app.kodnest.Assignment;

import java.util.Scanner;

public class Solution5App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in uppercase");
		StringBuilder s1 = new StringBuilder(sc.next());
		Solution5 s5 = new Solution5();
		String res = s5.convertUpperToLower(s1);
		System.out.println(res);

	}
}
