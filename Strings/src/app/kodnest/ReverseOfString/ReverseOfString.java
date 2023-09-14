package app.kodnest.ReverseOfString;

public class ReverseOfString {
	public static String rev(String s1)
	{
		char[]arr1 = s1.toCharArray();
		char[]arr2 = new char[arr1.length];
		int j=0;
		
		for(int i=arr1.length-1;i>=0;i--)
		{	
			arr2[j]=arr1[i];
			j++;
		}
		String s2 = new String(arr2);
		return s2;
	}


}
