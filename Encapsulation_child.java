package exam2;


public class Encapsulation_child {

	public static void main(String[] args) {
		Encapsulation_parent x = new Encapsulation_parent();
		x.setStudentName("ali");
		x.setStudentAge(26);
		x.setDepartment("IT");
		
		System.out.println("Name: " + x.getStudentName());
		System.out.println("Age: " + x.getStudentAge());
		System.out.println("Department: " + x.getDepartment());
	}

}
