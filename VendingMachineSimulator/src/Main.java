import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code from the following:\n1.P01\n2.P02\n3.P03");
		String code = sc.next();
		getProduct(code);
		sc.close();

	}
	public static void getProduct(String code)
	{
		switch(code)
		{
		case"P01":System.out.println("Coco cola");
		break;
		case"P02":System.out.println("Thumps up");
		break;
		case"P03":System.out.println("Fanta");
		break;
		case"P04":System.out.println("Mirinda");
		break;
		default:System.out.println("Enter a valid code");
		}
	}

}
