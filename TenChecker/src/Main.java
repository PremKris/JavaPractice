import java.util.*;
public class Main {

	public static void checkMultipleOfTen(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("The number "+n+" is a multiple of "+i);
			}
			else
			{
				System.out.println("The number "+n+" is not a multiple of "+i);
			}

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be divided");
		int num = sc.nextInt();
		System.out.println("Enter the number from which it should be divide from");
		int i = sc.nextInt();
		checkMultipleOfTen(num);

	}

}
