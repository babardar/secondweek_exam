package Overloading_ques23;

public class Overloading {

	public void demo(int a ) {
	System.out.println("Display the number: " + a);
}
	public void demo(String b ) {
		System.out.println("Display the String: " + b);
	}
	public void demo(int a, String b)	{
		System.out.println("Display the salary: " + a);
		System.out.println("Display the name: " + b);
	}
}
