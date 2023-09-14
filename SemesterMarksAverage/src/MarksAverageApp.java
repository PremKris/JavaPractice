import java.util.*;
public class MarksAverageApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all eight sem marks");
		int sem1=sc.nextInt();
		int sem2=sc.nextInt();
		int sem3=sc.nextInt();
		int sem4=sc.nextInt();
		int sem5=sc.nextInt();
		int sem6=sc.nextInt();
		int sem7=sc.nextInt();
		int sem8=sc.nextInt();
		calculateAverage ca = new calculateAverage();
		System.out.printf("%.2f",ca.avgCal(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
		sc.close();

	}

}
