import java.util.*;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println("The sum is "+sum);
	}

}
