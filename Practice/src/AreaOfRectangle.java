import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = area(a,b); 
		System.out.println(res);
	}
	public static int area(int a, int b)
	{
		int areaa = a * b;
		return areaa;
	}

}
