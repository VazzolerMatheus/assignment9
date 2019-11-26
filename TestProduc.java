/*
 * Test for the class product
 */

public class TestProduc {

	public static void main(String[] args) {
		
		//Creating the objects
		Product pen = new Product(1, "Red premium BIC pen", 0.90, 50);
		Product mug = new Product(2, "Blue big coffe mug", 7.50, 10);
		Product glasses = new Product(3, "Black Rayban sunglasses", 190, 5);
		
		
		//Testing count variable
		pen.removeProduct(20); // Sold 20 units;
		System.out.println("Current stock: " + pen.getCount()); //Current stock: 30
		pen.addProduct(200); //bought 200 pens for stock
		System.out.println("Current stock: " + pen.getCount()); //Current stock: 230

		
		
		//Testing toString method
		System.out.println(pen.toString());
		System.out.println(mug.toString());
		System.out.println(glasses.toString());
	}

}
