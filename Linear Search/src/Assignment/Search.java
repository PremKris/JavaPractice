package Assignment;

public class Search {
	public boolean isPresent(int target,int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(target == arr[i])
			{
				return true;
			}
				
		}
		return false;
	}	

}
