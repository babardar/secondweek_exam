package Overrideing_ques23;


public class ChildClass extends parentClass{

		@Override
		public void display() {
			System.out.println("im method from childclass");
		}
		public String a= "im variable from child class";

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			parentClass obj = new parentClass();
			parentClass obj1= new ChildClass();
			obj.display();
			System.out.println(obj.a);
			obj1.display();
			System.out.println(obj1.a);

	}

}
