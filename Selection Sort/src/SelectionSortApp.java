import java.util.Scanner;

public class SelectionSortApp {

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
		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		System.out.println("The array elements after sorting are");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		sc.close();

	}

}
