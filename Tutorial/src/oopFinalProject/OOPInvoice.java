package oopFinalProject;

public class OOPInvoice {
	private OOPCustomer theCustomer;
	private OOPCustomer evilFunds;
	private OOPCustomer name;
	private OOPLineItem items;
	private OOPLineItem Qty;
	private OOPProduct productName;
	private OOPProduct price;
	private boolean CanAfford;
	private double AmountDue;
	
	public OOPInvoice(OOPCustomer theCustomer) {
		this.theCustomer = theCustomer;
	}//end OOPInvoice
	
	public void add(String Product , int Qty) {
		items += Product;
		items += Qty;
	}//end add
	
	public void printInvoice() {
		int creditUnion = 1000000;
		System.out.println("LineItem: \n Product Name: " +
				productName + "\n Price: $" +
				price + "\n Quantity: " + Qty + "\n Total: " + (price * Qty));
		if(CanAfford == true) {
			System.out.println("Purchase Approved");
		}
	}//end printInvoice
	public boolean canAfford(OOPCustomer theCustomer) {
		if(AmountDue > evilFunds.getEvilFunds()) {
			CanAfford = false;
			return false;
		} else {
			CanAfford = true;
			return true;
		}
	}//end canAfford
	public double amountDue() {
		AmountDue = price * Qty;
		return AmountDue;
	}//end amountDue

}//end OOPInvoice
