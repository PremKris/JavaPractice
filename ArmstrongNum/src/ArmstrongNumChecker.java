import java.util.Scanner;

public class ArmstrongNumChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int originalNumber = num;
		int count = 0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		Armstrong a = new Armstrong();
		int res = a.armstrong(originalNumber,count);
		System.out.println(res);
		if(originalNumber==res)
		{
			System.out.println("The entered number is a armstrong");
		}
		else
		{
			System.out.println("The entered number is not a armstrong");
		}
		sc.close();

	}

}
