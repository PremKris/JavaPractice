import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String name = sc.next();
		Student sd = new Student();
		sd.display(age,name);		

	}

}
