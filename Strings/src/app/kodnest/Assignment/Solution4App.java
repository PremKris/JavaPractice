package app.kodnest.Assignment;

import java.util.Scanner;

public class Solution4App {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String s1 = new String(sc.nextLine());
			Solution4 so4= new Solution4();
			so4.countOfUpperLowerCase(s1);

	}

}
