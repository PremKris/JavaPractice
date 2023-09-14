import java.util.*;
public class Solution6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num until where the number should be displayed");
		int n = sc.nextInt();
		for(int i=3;i<n;i++)
		{
			int res = checkPrime(i);
			if(res!=0)
			{
				System.out.println(res);
			}
		}
	}
	public static int checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)//Checks for the prime number
			{
				return 0;//If it is not a prime number return 0
			}	
		}
		return n;//It will return the prime number
	}
	
}
