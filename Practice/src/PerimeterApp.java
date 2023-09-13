import java.util.Scanner;

public class PerimeterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sides of the Rectangle");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		Perimeter pr = new Perimeter();
		pr.calculate(length, breadth); 
		

	}

}
