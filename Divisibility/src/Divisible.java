import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num until where the number should be displayed");
		int n = sc.nextInt();
		print(n);
	}
	public static void print(int n)
	{
		for(int i=1;i<n;i++)
		{
			divisibleBy2(i);
		}
	}
	public static void divisibleBy2(int n)
	{

		if(n%2==0)
		{
			System.out.println(n);
		}

		
	}
	

}
