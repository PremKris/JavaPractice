package Assignment;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length of original array");
		int originalArr[] = new int[sc.nextInt()];
		int duplicateArr[] = new int [originalArr.length];
		for(int i=0;i<=originalArr.length-1;i++)
		{
			System.out.println("Enter the array elements");
			originalArr[i]=sc.nextInt();
		}
		for(int x:originalArr)
		{
			System.out.println("Element of original array are "+x+" ");
		}
		for(int i=0;i<=originalArr.length-1;i++)
		{
			duplicateArr[i]=originalArr[i];
		}
		for(int j=0;j<=duplicateArr.length-1;j++)
		{
			System.out.println("The elemnts of dupicate arrray are "+duplicateArr[j]);

		}

	}

}
