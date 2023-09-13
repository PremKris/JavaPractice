package TwoDimeansionalArray;
import java.util.*;

public class FourGamesThreePlayer {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		float arr[][] = new float[4][3];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height for games "+i+" and player "+j);
				arr[i][j]=sc.nextFloat();	
			}
		}
		System.out.println("Array elements are...");
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
