import java.util.*;
public class TemperatureConvertorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double faranheit = scan.nextDouble();
		TemperatureConvertor t = new TemperatureConvertor();
		
		System.out.printf("%.2f",t.convertTemp(faranheit));
	}

}
