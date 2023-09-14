package teacherapplication;

public class teacherApp {

	public static void main(String[] args) {
		teacher t1 = new teacher();
		t1.id=143;
		t1.name="Omkar";
		t1.subject="Anatomy";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.subject);

	}

}
