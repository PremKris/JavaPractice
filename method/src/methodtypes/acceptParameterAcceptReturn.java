package methodtypes;

public class acceptParameterAcceptReturn {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int res = sum(a,b);
		System.out.println(res);

	}
	public static int sum(int a, int b) //accept parameter
	{
		int c = a + b;
		return c; //accept return
	}

}
