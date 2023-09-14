import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1D array");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array elemets "+i);
			arr[i]=sc.nextInt();
		}
		PrintArray p = new PrintArray();
        p.printArray(arr);
        sc.close();

	}

}
