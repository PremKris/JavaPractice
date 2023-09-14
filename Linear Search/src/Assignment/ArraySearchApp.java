package Assignment;

import java.util.Scanner;

public class ArraySearchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of arrays required");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the Array Elements");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target number to be searched");
		int target = sc.nextInt();
		Search search = new Search();
		boolean res=search.isPresent(target,arr);
		if(res)
		{
			System.out.println("Target is present in the array");
		}
		else
		{
			System.out.println("Target is not present in the array");
		}

	}

}
