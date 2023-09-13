package methodtypes;

public class acceptParameterNoReturn {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		sum(a,b);

	}
	public static void sum(int a , int b) //accepting parameter
	{
		int c = a + b;
		System.out.println(c);
		
	}

}
