import java.util.*;
public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<2)
		{
			System.out.println("Not a prime number");
		}
		else if(n%2==0)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("It is a prime number");
		}
			

	}

}
