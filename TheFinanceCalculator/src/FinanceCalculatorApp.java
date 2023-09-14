import java.util.*;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double principal = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		FinanceCalculator fc = new FinanceCalculator();
		System.out.println(fc.calculateSimpleInterest(principal, rate, time));

	}

}
