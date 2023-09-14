package level3;

public class Solution11 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=22;j++)
			{
				System.out.print("*");
			}
			if(i==2)
			{
				System.out.print("*");
			}

			
			System.out.println();
		}
		for(int i=1;i<=10;i++)
		{
			for(int k=10;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
