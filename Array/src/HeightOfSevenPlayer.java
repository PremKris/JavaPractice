import java.util.*;
public class HeightOfSevenPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float arr[] = new float[7];
		System.out.println("Enter the height of 7 gamers");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextFloat();
		}
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();	

	}

}
