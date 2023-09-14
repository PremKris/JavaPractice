import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the elements in the array");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the key");
		int key = sc.nextInt();
		LinearSearch1 l = new LinearSearch1();
		l.linearSearch(arr,key);
		sc.close();


	}

}
