import java.util.Scanner;

public class ArithmeticApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //ctrl+2->l shortcut
		int a = scan.nextInt();
		int b = scan.nextInt();
		ArithmeticOperator c = new ArithmeticOperator(); //Creating an object
		int add = c.sum(a, b);
		System.out.println("Addition of two numbers "+add);
		int sub = c.sub(a, b);
		System.out.println("Subtraction of two numbers "+sub);
		int mul = c.mul(a, b);
		System.out.println("Multiplication of two numbers "+mul);
		int div = c.div(a, b);
		System.out.println("Division of two numbers "+div);
		int mod = c.mod(a, b);
		System.out.println("Modulus of two numbers "+mod);
		scan.close();
		

	}

}
