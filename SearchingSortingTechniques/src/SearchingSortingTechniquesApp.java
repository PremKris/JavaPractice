import java.util.Scanner;

public class SearchingSortingTechniquesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] =  new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter the key to be found");
		int key = sc.nextInt();
		System.out.println("Enter the type of sorting");
		System.out.println("1--->BubbleSort Ascending"+" "+"2--->BubbleSort Descending"+" "+"3--->Selection Sort");
		int choice1 = sc.nextInt();
		switch(choice1)
		{
		case 1:SearchingSortingTechniques bst1 = new SearchingSortingTechniques();
				bst1.bubbleSortAscending(arr);
				System.out.println("The array elements after sorting are");
				for(int a:arr)
				{
					System.out.print(a+" ");
				}
		break;
		case 2:SearchingSortingTechniques bst2 = new SearchingSortingTechniques(); 
				bst2.bubbleSortDescending(arr);
				System.out.println("The array elements after sorting are");
				for(int y:arr)
				{
					System.out.print(y+" ");
				}
		break;
		case 3:SearchingSortingTechniques bst3 = new SearchingSortingTechniques();
				bst3.selectionSort(arr);
				System.out.println("The array elements after sorting are");
				for(int z:arr)
				{
					System.out.print(z+" ");
				}

		}

		System.out.println();
		System.out.println("Enter your choice of searching");
		System.out.println("1--->Linear Search"+" "+"2--->Binary Search");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			int res1 = SearchingSortingTechniques.linearSearch(arr,key);
			if(res1>=0 )
			{
				System.out.println("Key found ");
			}
			else
			{
				System.out.println("Key not found");
			}
			break;
		case 2:
			int res2 = SearchingSortingTechniques.binarySearch(arr,key);
			if(res2==1)
			{
				System.out.println("Key found");
			}
			else
			{
				System.out.println("Key not found");
			}
			break;
		default:
			System.out.println("Enter carefully");
		}


		sc.close();
		
	}

}
