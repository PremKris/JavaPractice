import java.util.*;
public class ArrayStorageAccToUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of people to be verified");
		boolean arr[]=new boolean [scan.nextInt()];//better than creating a variable for user
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Whether player "+i+" is married or not?");
			arr[i] = scan.nextBoolean();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Person "+i+" married"+" "+arr[i]);
		}
		scan.close();

	}

}
