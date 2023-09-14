import java.util.Scanner;

public class GcdApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no's to find gcd");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int res = GCD.findGcd(m,n);
		System.out.println(res);
		sc.close();

	}

}
