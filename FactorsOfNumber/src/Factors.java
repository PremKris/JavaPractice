import java.util.*;
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which number should be a factored");
		int N = sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
