package Assignment;

public class MergingTwoArray {
	public int[] arrayMerge(int originalArr1[],int originalArr2[])
	{
		int Arr3[]= new int [originalArr1.length+originalArr2.length];
		for(int i=0;i<=originalArr1.length-1;i++) //Storing elements of array2
		{
			Arr3[i]=originalArr1[i];
		}
		for(int i=0;i<=originalArr2.length-1;i++)
		{
			Arr3[originalArr1.length+i]=originalArr2[i];
		}
		
		return Arr3;
		
	}
	

}
