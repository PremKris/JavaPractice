import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student grade");
		int grade = sc.nextInt();
		checkGrade(grade);

	}
	public static void checkGrade(int g)
	{
		if(g>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
