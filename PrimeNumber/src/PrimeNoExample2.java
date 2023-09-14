import java.util.*;

public class PrimeNoExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i!=0)
			{
				isPrime=false;
				System.out.println("Number "+n+" is not prime ");
				return;
			}
		}
		System.out.println("Entered Number "+n+" is Prime");

	}

}
