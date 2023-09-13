package methodtypes;
import java.util.Scanner; //For using a scanner
public class AdvantageMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //Creating an object
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result1 = sum(num1,num2);
		System.out.println(result1);
		int result2 = sub(num1,num2);
		System.out.println(result2);
		int result3 = mul(num1,num2);
		System.out.println(result3);
		int result4 = div(num1,num2);
		System.out.println(result4);
		int result5 = mod(num1,num2);
		System.out.println(result5);

	}
	public static int sum(int x,int y)
	{
		return x+y;
	}
	public static int sub(int m,int n)
	{
		return m-n;
	}
	public static int mul(int u,int v)
	{
		return u*v;
	}
	public static int div(int i,int j)
	{
		return i/j;
	}
	public static int mod(int p,int q) // using method so that we can add extra or modify
	{
		return p%q;
	}
}
