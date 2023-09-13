package TwoDimeansionalArray;
import java.util.*;

public class PrintNames {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the 1D no ");
		String arr[][]= new String[sc.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the 2D array for "+i);
			arr[i]=new String[sc.nextInt()];
		}

		for (int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the names in the array "+i+", "+j);
				arr[i][j]=sc.next();			
			}
		}
		System.out.println("Array contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
