package app.kodnest.Assignment;

public class Solution6 {
	public static String redundant(String s1)
	{
		String s2 = "";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i))))
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		return s2;
	}

}
