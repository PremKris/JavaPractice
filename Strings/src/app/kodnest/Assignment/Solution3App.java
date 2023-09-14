package app.kodnest.Assignment;

import java.util.Scanner;

public class Solution3App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = new String(sc.nextLine());
		Solution3 so = new Solution3();
		so.unicode(s1);

	}

}
