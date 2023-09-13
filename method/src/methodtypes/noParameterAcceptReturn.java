package methodtypes;

public class noParameterAcceptReturn {

	public static void main(String[] args) {
		
		int res = sum(); //initialize to a variable as the method is returning something
		System.out.println(res);
		
	}
	public static int sum() //void cannot return any value hence integer
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

}
