package oopFinalProject;
import java.util.ArrayList;

public class OOPInvoice {
	private OOPCustomer theCustomer;
	private ArrayList<OOPLineItem> items = new ArrayList<>();
	private OOPProduct theProduct;
	private OOPLineItem theLineItem;
	boolean CanAfford;
	int i;
	
	public OOPInvoice(OOPCustomer theCustomer) {
		this.theCustomer = theCustomer;
	}//end OOPInvoice
	
	public void add(OOPProduct Product, int Qty) {
		items.add(new OOPLineItem (Product , Qty));
	}//end add
	
	public void printInvoice() {
		for(int i = 0; i < items.size(); i++) {
			System.out.println("Line Item " + (i + 1) + ": " + items.get(i).getTheProduct().getProductName() 
			+ "\n Price: $" + items.get(i).getTheProduct().getPrice() + "\n Quantity: " 
			+ items.get(i).getQty()+ "\n Total: " + amountDue());
		}
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
		return items.get(i).getTheProduct().getPrice() * items.get(i).getQty();
	}//end amountDue

}//end OOPInvoice
