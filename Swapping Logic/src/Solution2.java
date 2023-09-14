import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1D array");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array elemets "+i);
			arr[i]=sc.nextInt();
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println("Enter 2 indexes to be swapped");
		int a = arr[sc.nextInt()];
		int b = arr[sc.nextInt()]; 
		System.out.println("The elements before swapping are ");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		System.out.println("The elements before swapping are ");
		for(int y:arr)
		{
			System.out.println(y+" ");
		}

	}

}
