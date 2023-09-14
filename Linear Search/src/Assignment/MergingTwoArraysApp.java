package Assignment;

import java.util.Scanner;

public class MergingTwoArraysApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length of array 1");
		int originalArr1[] = new int[sc.nextInt()];
		for(int i=0;i<=originalArr1.length-1;i++)//Storing elements of array1
		{
			System.out.println("Enter the array elements of 1st array");
			originalArr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array length of array 2");
		int originalArr2[] = new int[sc.nextInt()];
		for(int i=0;i<=originalArr2.length-1;i++)//Storing elements of array2
		{
			System.out.println("Enter the array elements of 2nd array ");
			originalArr2[i]=sc.nextInt();
		}
		
		MergingTwoArray ma = new MergingTwoArray();//Calling the class
		int res[] = ma.arrayMerge(originalArr1,originalArr2);//Calling the method
		
		for(int a:res)//Printing the result
		{
			System.out.print(a+" ");
		}
		sc.close();
		

	}

}
