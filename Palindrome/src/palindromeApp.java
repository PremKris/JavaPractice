import java.util.Scanner;

public class palindromeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		palindrome p = new palindrome();
		int res = p.calculate(num);
		System.out.println(res);

		if(res == num)
		{
			System.out.println("The given no "+num+" is a palindrome");

		}
		else
		{
			System.out.println("The given no "+num+" is not a palindrome");

		}
		sc.close();

	}

}
