
public class SearchingSortingTechniques {
	public static int linearSearch(int arr[],int key) //LOGIC FOR Linear Search
	{
		for(int i=0;i<=arr.length-1;i++)
		if (key==arr[i])
		{
			return 0;
		}
		return -1;
	}
	public static int binarySearch(int arr[],int key) //LOGIC FOR Binary Search
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int low = 0;
			int high = arr.length-1;
			while(low<=high)
			{
				int mid = (low+high)/2;
				if(key == arr[mid])
				{
					return 1;
				}
				if(key<arr[mid])
				{
					high = mid-1;
				}
				else
				{
					low = mid+1;
				}
			}
		}
		return -1;
	}
	void bubbleSortAscending(int arr[])  //LOGIC FOR Bubble Sort in Ascending
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	void bubbleSortDescending(int arr[]) //LOGIC FOR Bubble Sort in Descending 
	{
		for(int i=arr.length-1;i>=1;i--)
		{
			for(int j=arr.length-1;j>=1;j--)
			{
				if(arr[j]>arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	void selectionSort(int arr[])//LOGIC FOR SELECTION SORT
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			int min = arr[i];
			int pos = i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}

}
