package app.kodnest.Assignment;

public class Solution8 {
	public static void substring(String s1)
	{
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			String dup="";
			for(int j=i;j<=s1.length()-1;j++)
			{	
				dup = dup+s1.charAt(j);
				System.out.println(dup);
			}
		}
	}

}
