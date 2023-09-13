package unary;

public class program9 {

	public static void main(String[] args) {
		int a = 10;
		int b;
		b = --a + a-- + ++a + a++ + --a + a++ + a--; //9+9+9+9+9+10
		System.out.println(b);

	}

}
