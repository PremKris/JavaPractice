import java.util.*;
public class CelsiusToFaranheitAPP {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float temperature = scan.nextFloat();
		Temperature temp = new Temperature();
		temp.conversion(temperature);
	}

}
