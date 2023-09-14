package Assignment;

import java.util.Scanner;

public class AdditionOfArraysApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array elements");
			arr[i]=sc.nextInt();
		}
		AdditionOfArray cs = new AdditionOfArray();
		int res = cs.calculateSum(arr);
		System.out.println("The sum is "+res);
	}

}
