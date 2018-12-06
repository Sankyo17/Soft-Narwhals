package oopFinalProject;

import java.text.DecimalFormat;

public class OOPTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 3 additional invoice runs
				// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
				
				//invoice run 1
				OOPCustomer c = new OOPCustomer("Island", "Dr evil", 1230);
				OOPInvoice in = new OOPInvoice(c);
				in.add(new OOPProduct("Flame Thower",123.80), 3);
				in.add(new OOPProduct("Sharks", 105.20),2);
				in.add(new OOPProduct("Lasers",50.50),20);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 2
				c = new OOPCustomer("castle", "Bowser", 4940);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("Fire Ball",130.39), 18);
				in.add(new OOPProduct("Shell Repair Kit", 183.65),37);
				in.add(new OOPProduct("Peach Body Pillow",122.57),6);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 3
				c = new OOPCustomer("ice cave", "Megatron", 6482);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("Blaster",33.65), 48);
				in.add(new OOPProduct("Metal Sword", 172.98),41);
				in.add(new OOPProduct("Jet Rockets",110.99),18);
				
				runInvoice(c,in); //runs invoice
				
				//invoice run 4
				c = new OOPCustomer("Gotham City", "Joker", 5112);
				in = new OOPInvoice(c);
				in.add(new OOPProduct("Explosive Balloons",174.34), 46);
				in.add(new OOPProduct("Razor Sharp Playing Cards", 177.97),42);
				in.add(new OOPProduct("Gun",165.70),39);
				
				runInvoice(c,in); //runs invoice
				
			}//end main
			
			//do not modify code below
			public static void runInvoice(OOPCustomer c, OOPInvoice i) {
				i.printInvoice();

				if(c.getEvilFunds()- i.amountDue() < 0) {
					System.out.println("Evil villian credit union to the rescue!!");	
					c.addFunds(i.amountDue() - c.getEvilFunds());
					System.out.println("New funds total: $" + (new DecimalFormat("##.00").format(c.getEvilFunds())));
					System.out.println();
				}
				
				i.printInvoice();
			}//end runInvoice


	}//end OOPTester


