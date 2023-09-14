import java.util.Scanner;

public class BubbleSortApp {

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
		BubbeSortAscending bsa = new BubbeSortAscending();
		bsa.sortedArray(arr);
		System.out.println("The array elements after swapping in ascending order are");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		BubbleSortDescending bsb = new BubbleSortDescending();
		bsb.sortedArray1(arr);
		System.out.println("The array elements after swapping in descending order are");
		for(int y:arr)
		{
			System.out.println(y+" ");
		}
		sc.close();

	}

}
