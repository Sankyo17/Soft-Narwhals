package oopFinalProject;

import java.text.DecimalFormat;

public class OOPProduct {
	private String productName;
	private double price;
	/**
	 * Take's in information from OOPTester class
	 * @param productName
	 * @param price
	 */
	public OOPProduct(String productName , double price) {
		this.productName = productName;
		this.price = price;
	}//end OOPProduct
	/**
	 * Get's name of product inputed by
	 * the OOPTester class 
	 * @return name of product
	 */
	public String getProductName() {
		return productName;
	}//end getProductName
	/**
	 * Get's price of product inputed by
	 * the OOPTester class 
	 * @return price of product
	 */
	public double getPrice() {
		return price;
	}//end getPrice
	/**
	 * Statement that formats product information 
	 * inputed from the OOPTester class 
	 * @return product and price of product
	 */
	public String toString() {
		return "Product name: " + productName + "\n Price: $" + (new DecimalFormat("##.00").format(getPrice()));
	}//end toString

}//end OOPProduct
