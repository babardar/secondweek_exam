package javaleads.lesson2;

public class Product2 implements Product {

	@Override
	public void addStock(String productName, int quantity) {
			System.out.println("Product Name: " + productName + " Quantity " + quantity);
	}
	


}
