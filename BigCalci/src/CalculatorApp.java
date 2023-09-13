import java.util.*;
public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator c = new Calculator();
		int num1 = scan.nextInt(); 
		int num2 = scan.nextInt();
		System.out.println("Hello user Welcome to Kodnest Calculator");
		while(true)
		{
			System.out.println("1.+ ----> addition\n2.- ----> subtraction\n3.* ----> multiplication\n4./ ----> division\n5.% ----> remainder\n6.^ ---->square\n7.! ----> stop");
			char opt = scan.next().charAt(0);
			switch(opt)
			{
				case'+':
					System.out.println(c.addition(num1,num2));
					break;
				case'-':
					System.out.println(c.subtraction(num1,num2));	
					break;
				case'*':
					System.out.println(c.mul(num1,num2));
					break;
				case'/':
					System.out.println(c.div(num1,num2));
					break;		
				case'%':
					System.out.println(c.findRem(num1,num2));
					break;			
				case'^':
					System.out.println(c.findSqr(num1,num2));
					break;
				case'!':
					System.out.println("Tata bye bye");
					return;
				default:
					System.out.println("Go see a doctor");
					
			
			}
		}
		

	}

}
