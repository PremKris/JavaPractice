import java.util.*;
public class HeightConvertorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inches = scan.nextDouble();
		HeightConverter hc = new HeightConverter();
		System.out.println(hc.convertInchesToFeet(inches));
		 

	}

}
