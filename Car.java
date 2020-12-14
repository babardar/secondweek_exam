package javaleads.lesson2;

public class Car extends Vehicle {
/* 5. Create a child class “Car” and extend the abstract class “Vehicle”. Add new private member
 * variable “engineCount”.Override the method “printVehicleDetails” in the child class and 
 * make a call to parent method using keyword ”super”.Implement the method “runVehicle”*/
	
	private int engineCount = 6;
	
	@Override
	public void runVehicle() {
		System.out.println("0-60: 3.5sec");
	}
	@Override
	public void printVehicalDetails() {
		super.printVehicalDetails();
	}

}