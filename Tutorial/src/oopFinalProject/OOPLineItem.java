package oopFinalProject;
public class OOPLineItem {
	private int qty;
	private OOPProduct theProduct;
	/**
	 * Take's in information from OOPProduct class 
	 * and instance variable qty
	 * @param theProduct
	 * @param qty
	 */
	public OOPLineItem(OOPProduct theProduct, int qty) {
		this.theProduct = theProduct;
		this.qty = qty;
	}//end LineItem
	/**
	 * Get's product information from OOPProduct class 
	 * @return product information
	 */
	public OOPProduct getTheProduct() {
		return theProduct;
	}//end getTheProduct
	/**
	 * Get's qty imputed by the OOPTester class 
	 * @return quantity of product purchased
	 */
	public int getQty() {
		return qty;
	}//end getQty
	/**
	 * Statement that formats information 
	 * from OOPProduct class and qty of product wanted 
	 */
	public String toString() {
		return theProduct + "\n Quantity: " + qty;
	}//end toString

}//end OOPLineItem
