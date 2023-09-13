import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//taking i/p from the user
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		sc.nextLine();//use it twice while using nextLine()
		String name = sc.nextLine();
		System.out.println("Enter gender");
		String gender = sc.next();
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter Phone No");
		long number = sc.nextLong();
		
		Person p = new Person(id, name, gender, email, number);
		System.out.println("The id is "+p.id);
		System.out.println("The name is "+p.name);
		System.out.println("The gender is "+p.gender);
		System.out.println("The email is "+p.email);
		System.out.println("The number is "+p.number);
		

	}

}
