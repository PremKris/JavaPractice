package app.kodnest.Assignment;

public class Solution4 {
	void countOfUpperLowerCase(String s1)
	{
		int ucount=0;
		for(int i=0;i<=s1.length()-1;i++)  //For doing it manually without any inbuilt function
		{
			char c1 = s1.charAt(i);        //int c1 = s1.charAt(i);
			if(Character.isUpperCase(c1))  //if(c1>=97&&c1<=122)
			{							   //{
				ucount++;				   //ucount++
			}							   //}
		}
		System.out.println("The count of upper case letters are "+ucount);
		int lcount=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c1 = s1.charAt(i);
			if(Character.isLowerCase(c1))
			{
				lcount++;
			}
		}
		System.out.println("The count of lower case letters are "+lcount);
	
		
	}

}
