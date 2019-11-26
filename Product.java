/*Class product
 *Accepts, code (product code), description of the item, the price and how many are available
 *
 *Created by: Matheus Vazzoler
 *date: 11/25/2019
 */


import java.text.NumberFormat;

public class Product {
	
	private int code; 
	private String description;
	private double price;
	
	/*Treated this variable as the count of the products on the stock
	No direct setters, only add/remove certain quantities when selling or restocking
	except when creating the object for the first time */
	private int count; 
	
	
		// Constructor
	
	public Product(int InitialCode, String InitialDescription, double InitialPrice, int InitialCount) {
		code = InitialCode;
		description = InitialDescription;
		price = InitialPrice;
		count = InitialCount;
	}
	
	
	
		//Getters and Setters
	
	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	
	
	// Gets the number of products on stock
	public int getCount() {
		return count;
	}

	
	// Adds X quantity products to the stock
	public void addProduct(int quantity) {
		this.count += quantity;
	}
	
	//Removes X quantity products to the stock
	public void removeProduct(int quantity) {
		this.count -= quantity;
	}
	

	//Prints out the price in the right dollar format
	public String getPriceFormatted(){
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
	
	//Rewriting the toString method
	public String toString() {
		return String.format(code + " " + description + " " + price + " " + count);
	}
	
}
