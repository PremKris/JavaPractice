package BinarySearch;

public class BinarySearch {
	int searchElement(int arr[],int key)
	{
		int low = 0;
		int high = arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			while(low<=high)
			{
				int mid = (low+high)/2;
				if(key==arr[mid])
				{
					return 1;
				}
				else if(key>arr[mid])
				{
					low = mid+1;		
				}
				else
				{
					high = mid-1;
				}
			}

		}
		return -1;
	}

}
