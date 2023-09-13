package constructor;

public class Employee {
	int ssn;//instance variable
	String name;
	int salary;
	public Employee(int ssn ,String name,int salary)
	{
		ssn = ssn;//it has a warning symbol cuz  it doesnt determine the local variable and instance variable
		name = name;//it shadows or hides the instance variable commonly called as shadowing problem
		salary = salary;
		
	}

}
