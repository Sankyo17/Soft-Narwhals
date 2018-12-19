package oopFinalProject;
import java.util.ArrayList;
public class OOPInvoice {
	private OOPCustomer theCustomer;
	private ArrayList<OOPLineItem> items = new ArrayList<>();
	private OOPProduct theProduct;
	private OOPLineItem theLineItem;
	/**\
	 * Take's in customer information from the OOPCustomer class 
	 * @param theCustomer - customer's name, address and evilfunds 
	 */
	public OOPInvoice(OOPCustomer theCustomer) {
		this.theCustomer = theCustomer;
	}//end OOPInvoice
	/**
	 * Adds product information from OOPProduct class 
	 * and quantity of the product purchased from OOPLineItem class  
	 * @param Product - product name, and product price
	 * @param Qty - quantity of product purchased
	 */
	public void add(OOPProduct Product, int Qty) {
		items.add(new OOPLineItem (Product , Qty));
	}//end add
	/**
	 * Formats the customers invoice with the 
	 * customer's information from OOPCustomer class,
	 * the array list "items" that contain the 
	 * product name and price from the OOPProduct class and the  
	 * quantity of product purchased from the OOPLineItem class,
	 * formats the total amount due from the amountDue() function, 
	 * and formats if customer can afford the purchase from the canAfford() function.
	 */
	public void printInvoice() {
			System.out.println(theCustomer.toString());
			System.out.println();
			for(int i = 0; i < items.size(); i++) {
				System.out.printf(items.get(i).toString() + "\n  Total: $%.2f\n", 
				(items.get(i).getTheProduct().getPrice() * items.get(i).getQty()));
				System.out.println();
			}
			System.out.printf("Total Amount Due: $%.2f\n" , amountDue());
			System.out.println();
			if(canAfford(theCustomer) == true) {
				System.out.println("Purchase Approved!");
			}
	}//end printInvoice
	/**
	 * Calculates if theCustomer can afford the whole purchase
	 * @param theCustomer - theCustomer(evilFunds) from the OOPCustomer class 
	 * @return true or false based on whether 
	 * theCustomer can afford the purchase 
	 */
	public boolean canAfford(OOPCustomer theCustomer) {
		if(amountDue() <= theCustomer.getEvilFunds()) {
			return true;
		} else {
		return false;
		}
	}//end canAfford
	/**
	 * A counter that keeps adding a customers purchases 
	 * considering the product price and quantity from the 
	 * OOPProduct class and OOPLineItem class 
	 * @return totalDue - the customer's overall cost to 
	 * purchase all the items
	 */
	public double amountDue() {
		double totalDue = 0;
		for(int i = 0; i < items.size(); i++) {
			totalDue += items.get(i).getTheProduct().getPrice() 
						* items.get(i).getQty();
		}
		return totalDue;
	}//end amountDue

}//end OOPInvoice
