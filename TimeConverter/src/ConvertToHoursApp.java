import java.util.*;
public class ConvertToHoursApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double minutes = scan.nextDouble();
		ConvertToHour cm = new ConvertToHour();
		System.out.println(cm.ToHour(minutes));


	}

}
