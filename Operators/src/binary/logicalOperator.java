package binary;

public class logicalOperator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println(a && a); //and operator
		System.out.println(a && b);
		System.out.println(b && a);
		System.out.println(b && b);
		System.out.println(a || a); //or operator
		System.out.println(a || b);
		System.out.println(b || a);
		System.out.println(b || b);
	}

}
