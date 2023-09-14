import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneyCalculator j = new JourneyCalculator();
		j.calculateDistance(speed,time);
		System.out.printf("%.2f",j.calculateDistance(speed,time));

	}

}
