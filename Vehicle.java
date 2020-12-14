package javaleads.lesson2;

abstract class Vehicle {
/* 4. Create an abstract class called “Vehicle” under the package “javaleads.lesson2”. The abstract class
 * should have private member variables “type” and “capacity” of appropriate data types. This abstract
 *  class should have an abstract method”runVehical” and a proper method call “printVehicleDetails”*/
	
	private String type = "Sedan";
	private int capacity = 5;
	
	public abstract void runVehicle();
	
	public void printVehicalDetails() {
		System.out.println("Detail from vehicle class");
	}
	
}
