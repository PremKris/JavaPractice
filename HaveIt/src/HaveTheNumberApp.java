import java.util.*;
public class HaveTheNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		HaveIt hi = new HaveIt();
		System.out.println(hi.haveTheNumber(num));
		

	}

}
