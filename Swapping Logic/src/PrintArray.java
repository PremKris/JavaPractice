
public class PrintArray {
	public void printArray(int arr[])
	{
		System.out.println("Array contents in forward direction");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
