package oopFinalProject;

public class OOPLineItem {
	private int qty;
	private OOPProduct theProduct;
	public OOPLineItem(OOPProduct theProduct, int qty) {
		this.theProduct = theProduct;
		this.qty = qty;
	}//end LineItem
	public OOPProduct getTheProduct() {
		return theProduct;
	}//end getTheProduct
	public int getQty() {
		return qty;
	}//end getQty
	public String toString() {
		return "Product: " + theProduct + "Quantity: " + qty;
	}//end toString

}//end OOPLineItem
