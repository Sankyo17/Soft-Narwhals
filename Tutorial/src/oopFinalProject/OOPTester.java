package oopFinalProject;

public class OOPTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 3 additional invoice runs
				// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
				
				//invoice run 1
				OOPCustomer c = new OOPCustomer("island", "Dr evil", 1230);
				OOPInvoice in = new OOPInvoice(c);
				in.add(new OOPProduct("flame Thower",123.80), 3);
				in.add(new OOPProduct("sharks", 105.2),2);
				in.add(new OOPProduct("lasers",50.5),20);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 2
				c = new OOPCustomer("island", "Dr evil", 1230);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("flame Thower",123.80), 3);
				in.add(new OOPProduct("sharks", 105.2),2);
				in.add(new OOPProduct("lasers",50.5),20);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 3
				c = new OOPCustomer("island", "Dr evil", 1230);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("flame Thower",123.80), 3);
				in.add(new OOPProduct("sharks", 105.2),2);
				in.add(new OOPProduct("lasers",50.5),20);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 4
				c = new OOPCustomer("island", "Dr evil", 1230);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("flame Thower",123.80), 3);
				in.add(new OOPProduct("sharks", 105.2),2);
				in.add(new OOPProduct("lasers",50.5),20);
				
				runInvoice(c,in); //runs invoice
				
			}//end main
			
			//do not modify code below
			public static void runInvoice(OOPCustomer c, OOPInvoice i) {
				i.printInvoice();

				if(c.getEvilFunds()- i.amountDue() < 0) {
					System.out.println("Evil villian credit union to the rescue!!");	
					c.addFunds(i.amountDue() - c.getEvilFunds());
					System.out.println("New funds total: " + c.getEvilFunds());
				}
				
				i.printInvoice();
			}//end runInvoice


	}//end OOPTester


