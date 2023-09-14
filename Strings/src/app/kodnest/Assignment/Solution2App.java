package app.kodnest.Assignment;

import java.util.Scanner;

public class Solution2App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1 = new String(sc.next());
		String s2 = new String(sc.next());		
		String res = Solution2.concatinate(s1,s2);
		if(res!=null)
		{
			System.out.println("Concatinated string are "+ res);
		}
		else
		{
			System.out.println("Entered string is not concatinated");
		}
	}

}
