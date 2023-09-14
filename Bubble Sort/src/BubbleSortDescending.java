
public class BubbleSortDescending {
	void sortedArray1(int arr[])
	{
		int temp;
		for(int i=arr.length-1;i>=1;i--)
		{
			for(int j=arr.length-1;j>=1;j--)
			{
				if(arr[j]>arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}

	}
	
}
