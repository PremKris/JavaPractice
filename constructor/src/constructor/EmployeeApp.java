package constructor;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(001,"Prem",250000);
		System.out.println(e1.ssn);
		System.out.println(e1.name);
		System.out.println(e1.salary);

	}

}
