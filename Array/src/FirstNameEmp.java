import java.util.*;
public class FirstNameEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		System.out.println("Enter the name of employees first name");
		for(int i = 0;i<=arr.length-1;i++)
		{
			arr[i]=sc.next();
		}
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
