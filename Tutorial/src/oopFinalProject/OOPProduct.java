package oopFinalProject;

public class OOPProduct {
	private String productName;
	private double price;
	/**
	 * 
	 * @param productName
	 * @param price
	 */
	public OOPProduct(String productName , double price) {
		this.productName = productName;
		this.price = price;
	}//end OOPProduct
	/**
	 * 
	 * @return name of product
	 */
	public String getProductName() {
		return productName;
	}//end getProductName
	/**
	 * 
	 * @return price of product
	 */
	public double getPrice() {
		return price;
	}//end getPrice
	/**
	 * @return product and price of product
	 */
	public String toString() {
		return "Product name: " + productName + "\nPrice: $" + price;
	}//end toString

}//end OOPProduct
