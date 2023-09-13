package com.kodnest.Factorial;

public class GCD {
	int gcdFinder(int m, int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return gcdFinder(n,m%n);
		}
		
	}


}
