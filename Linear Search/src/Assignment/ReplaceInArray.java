package Assignment;

public class ReplaceInArray {
	int[] replace(int originalArr1[])
	{
		for(int i=0;i<=originalArr1.length-1;i++)
		{
			if(originalArr1[i]<0)
			{
				originalArr1[i]=0;
			}
		}
		return originalArr1;
	}

}
