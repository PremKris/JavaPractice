import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("Enter the elements of array");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
