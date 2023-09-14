package app.kodnest.Assignment;

public class Solution3 {
	void unicode(String s1)
	{
		for(int i=0;i<=s1.length()-1;i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println();
		for(int i=0;i<=s1.length()-1;i++)
		{
			int res = (int)s1.charAt(i);
			System.out.print(res+" ");
		}
	}
}
