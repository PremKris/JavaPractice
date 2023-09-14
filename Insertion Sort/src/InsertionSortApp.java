import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements before swapping are");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		InsertionSort iss = new InsertionSort();
		iss.sortedArray(arr);
		System.out.println("The array elements after insertion sort are");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
	}

}
