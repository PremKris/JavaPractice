package com.kodnest.FrequencyOfChar;

public class FrequencyOfChar {
		public static void frequency(String s1)
		{
			char arr[] = s1.toCharArray();
			
			for(int i=0;i<=arr.length-1;i++)
			{
				int count=1;
				if(arr[i]!=' ')
				{
					for(int j=i+1;j<+arr.length-1;j++)
					{
						if(arr[i]==arr[j])
						{
							count++;
							arr[j]=' ';
						}
					}
					System.out.println("The character "+arr[i]+" is equal to "+count);
				}
				
			}
					
		}
}
