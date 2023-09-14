package Assignment;

public class MergingResultOf2Arrays {
	public int[] caculateAddition(int originalArr1[],int originalArr2[])
	{
		int res[]=new int[originalArr1.length];
		for(int i=0;i<=originalArr1.length-1;i++)
		{
			for(int j=i;j<=originalArr2.length-1;j++)
			{
				res[i]=originalArr1[i]+originalArr2[j];
			}
			
		}
		return res;
	}

}
