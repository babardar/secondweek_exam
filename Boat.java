package javaleads.lesson2;

public class Boat extends Vehicle{
/* 6. Create a child class “Boat” and extend the abstract class “Vehiclel”. Add new private member
 * variable “engineCount”. Override the method “printVehicleDetails” in the child class and make a
 *  call to parent method using keyword ”super”. Implement the method “runVehicle”*/
	private int engineCount = 12;
	
	@Override
	public void runVehicle() {
		System.out.println("0-10: 5.0sec");
	}
	
	@Override
	public void printVehicalDetails() {
		super.printVehicalDetails();
	}

}
