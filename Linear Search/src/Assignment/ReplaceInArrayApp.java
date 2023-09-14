package Assignment;

import java.util.Scanner;

public class ReplaceInArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length of array 1");
		int originalArr1[] = new int[sc.nextInt()];
		for(int i=0;i<=originalArr1.length-1;i++)//Storing elements of array1
		{
			System.out.println("Enter the array elements of 1st array");
			originalArr1[i]=sc.nextInt();
		}
		ReplaceInArray ri = new ReplaceInArray();
		ri.replace(originalArr1);
		for(int x:originalArr1)
		{
			System.out.print(x+" ");
		}

	}

}
