
public class Person {
	int id;
	String name;
	String gender;
	String email;
	long number;
	public Person(int id, String name, String gender, String email, long number) {//Constructor
		super();
		this.id = id;// "this" is used for the address of the current object to avoid shadowing problem 
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.number = number;
	}
	void eat()//this is the behavior of the object hence we use a method
	{
		System.out.println(name+" is eating");
	}
	void sleep()//this is the behavior of the object hence we use a method
	{
		System.out.println(gender+" "+name+" is sleeping");
	}
	
}
