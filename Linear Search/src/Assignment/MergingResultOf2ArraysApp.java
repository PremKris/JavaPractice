package Assignment;

import java.util.Scanner;

public class MergingResultOf2ArraysApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length of array 1");
		int originalArr1[] = new int[sc.nextInt()];
		for(int i=0;i<=originalArr1.length-1;i++)//Storing elements of array1
		{
			System.out.println("Enter the array elements of 1st array");
			originalArr1[i]=sc.nextInt();
		}
		
		int originalArr2[] = new int[originalArr1.length];
		for(int i=0;i<=originalArr2.length-1;i++)//Storing elements of array2
		{
			System.out.println("Enter the array elements of 2nd array ");
			originalArr2[i]=sc.nextInt();
		}
		
		
		MergingResultOf2Arrays ao = new MergingResultOf2Arrays();
		int result[] = ao.caculateAddition(originalArr1,originalArr2);
		for(int x:result)
		{
			System.out.print(x+" ");
		}

	}

}
