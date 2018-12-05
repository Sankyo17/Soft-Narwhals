package oopFinalProject;
import java.util.ArrayList;

public class OOPInvoice {
	private OOPCustomer theCustomer;
	private ArrayList<OOPLineItem> items = new ArrayList<>();
	private OOPProduct theProduct;
	private OOPLineItem theLineItem;
	boolean CanAfford;
	
	
	public OOPInvoice(OOPCustomer theCustomer) {
		this.theCustomer = theCustomer;
	}//end OOPInvoice
	
	public void add(OOPProduct Product, int Qty) {
		items.add(new OOPLineItem (Product , Qty));
	}//end add
	
	public void printInvoice() {
		
			System.out.println(theCustomer.toString());
			System.out.println();
			for(int i = 0; i < items.size(); i++) {
				System.out.println(items.get(i).toString() + "\n Total: $" 
			+ (items.get(i).getTheProduct().getPrice() * items.get(i).getQty()));
				System.out.println();
			}
			System.out.println("Total Amount Due: $" + amountDue());
			System.out.println();
		
		if(CanAfford == true) {
			System.out.println("Purchase Approved");
		}
	}//end printInvoice
	public boolean canAfford(OOPCustomer theCustomer) {
		if(amountDue() > theCustomer.getEvilFunds()) {
			CanAfford = false;
			return false;
		} else {
			CanAfford = true;
			return true;
		}
	}//end canAfford
	public double amountDue() {
		double totalDue = 0;
		for(int i = 0; i < items.size(); i++) {
			totalDue += items.get(i).getTheProduct().getPrice() * items.get(i).getQty();
		}
		return totalDue;
	}//end amountDue

}//end OOPInvoice
