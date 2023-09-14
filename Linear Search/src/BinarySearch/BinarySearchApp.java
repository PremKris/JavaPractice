package BinarySearch;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched for in the given array");
		int key = sc.nextInt();
		BinarySearch bs = new BinarySearch();
		int res = bs.searchElement(arr,key);
		if(res>=0)
		{
			System.out.println("The key is found");
		}
		else
		{
			System.out.println("The key is not found");
		}
		sc.close();

	}

}
