package TwoDimeansionalArray;
import java.util.*;

public class ArraysHavingDifferentLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][];//one array bracket is blank bcoz those values are initialized down
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		arr[3]=new int[2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the elements of array "+i+","+j);
				arr[i][j]= sc.nextInt();//To enter the value of the array elements by the user
			}
			
		}
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
