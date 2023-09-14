package app.kodnest.ReversePresereveWhiteSpace;

public class StringReverse {
	public static String rev(String s1)
	{
		char arr[] = s1.toCharArray();
		char rev[] = new char[arr.length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				rev[i]=arr[i];
			}
		}
		
		int j=rev.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				else
					rev[j]=arr[i];
					j--;
			}
		}
		String s2 = new String(rev);
		return s2;
	}

}
