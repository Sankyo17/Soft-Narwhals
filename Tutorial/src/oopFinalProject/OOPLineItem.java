package oopFinalProject;

public class OOPLineItem {
	private int qty;
	private OOPProduct theProduct;
	public LineItem(OOPProduct theProduct, int qty) {
		this.theProduct = theProduct;
		this.qty = qty;
	}//end LineItem(OOPProduct theProduct, int qty)
	public OOPProduct getTheProduct() {
		return theProduct;
	}//end getTheProduct
	public int getQty() {
		return qty;
	}//end getQty
	public String toString() {
		return " ";
	}//end toString

}//end OOPLineItem
