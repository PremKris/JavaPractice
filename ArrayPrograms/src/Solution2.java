import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the elements to be loaded into the array");
			arr[i]=sc.nextInt();
		}
		for(int i:arr)
		{
			System.out.println("The elements of array are");
			System.out.println(i+5);
		}
		sc.close();
		

	

	}

}
