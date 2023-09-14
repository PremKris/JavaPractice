import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num until where the number should be displayed");
		int n = sc.nextInt();
		print(n);
		sc.close();
	}
	public static void print(int n)
	{
		for(int i=1;i<n;i++)
		{
			divisibleBy3(i);
		}
	}
	public static void divisibleBy3(int n)
	{

		if(n%3==0)
		{
			System.out.println(n);
		}

		
	}

}
