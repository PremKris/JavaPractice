package methodtypes;
import java.util.*; // for using scanner

public class aProductiveUsageOfMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Creating an object
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int res1 = sum(num1,num2);
		System.out.println(res1);
		int res2 = sub(num2,num1);
		System.out.println(res2);
		int res3 = mul(num1,num2);
		System.out.println(res3);
		int res4 = div(num2,num1);
		System.out.println(res4);
 
	}
	public static int sum(int a, int b) 
	{
		return a+b; 
	}
	public static int sub(int m, int n) //Observe that the variable names are changed
	{
		return m-n; 
	}
	public static int mul(int p, int q) //Observe that the variable names are changed
	{
		return p*q; 
	}
	public static int div(int x, int y) //Observe that the variable names are changed
	{
		return x/y; 
	}
	public static int mod(int x, int y) //Observe that the variable names are changed
	{
		return x%y; 
	}

}
