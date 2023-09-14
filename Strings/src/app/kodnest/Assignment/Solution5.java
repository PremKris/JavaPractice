package app.kodnest.Assignment;

public class Solution5 {
	String convertUpperToLower(StringBuilder s1)
	{
		StringBuilder s2 = new StringBuilder(); 
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c =s1.charAt(i);
			if(Character.isUpperCase(c))
			{
				s2.append(Character.toLowerCase(c));
			}
			else
			{
				s2.append(c);
			}
			
		}
		return s2.toString();
	}

}
