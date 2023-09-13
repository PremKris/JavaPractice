package methodtypes;

public class MethodOverloadingTeaApplication {

	public static void main(String[] args) {
		MethodOverloadingTea mt = new MethodOverloadingTea();
		mt.getTea();
		mt.getTea(5);
		mt.getTea("lemon");
		mt.getTea(3,"ginger");
		
		
	}

}
