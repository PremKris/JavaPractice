package app.kodnest.Assignment;
import java.util.*;

public class Solution1App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		String s1 = new String(sc.next());
		String s2 = new String(sc.next());
		Solution1.compare(s1,s2);
		sc.close();

	}

}
