import java.util.*;
public class PurchaseAmount {


	public static void discountApplicability(double p)
	{
		if (p>=100)
		{
			System.out.println("Discount applicable");
		}
		else
		{
			System.out.println("Discount not available");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount in dollars");
		double purchaseAmount = sc.nextDouble();
		discountApplicability(purchaseAmount);

	}

}
