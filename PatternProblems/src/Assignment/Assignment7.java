package Assignment;

public class Assignment7 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");

			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i+1;j++)// the second half of the stars will have proper spacing for i+1 
			{
				System.out.print(" ");

			}
			for(int k=7;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
		
	

	}

}
