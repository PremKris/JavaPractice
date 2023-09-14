import java.util.*;
public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping "+a+" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping "+a+" "+b);

	}

}
