package oopFinalProject;
import java.text.DecimalFormat;
public class OOPCustomer {
	private String address;
	private String name;
	private double evilFunds;
	/**
	 * Takes in customer's information from OOPTester class
	 * @param address - location of customer 
	 * @param name - name of customer
	 * @param evilFunds - amount of evil funds the customer has 
	 */
	public OOPCustomer(String address , String name , int evilFunds) {
		this.address = address;
		this.name = name;
		this.evilFunds = evilFunds;
	}//end OOPCustomer
	/**
	 * Get's the address of customer from OOPCustomer class 
	 * @return address of customer
	 */
	public String getAddress() {
		return address;
	}//end getAddress
	/**
	 * Get's the name of customer form OOPCustomer class
	 * @return name of customer
	 */
	public String getName() {
		return name;
	}//end getName
	/**
	 * Get's the amount of evil funds the customer has from OOPCustomer class
	 * @return evil funds of customer
	 */
	public double getEvilFunds() {
		return evilFunds;
	}//end getEvilFunds
	public void setEvilFunds(int evilFunds) {
		this.evilFunds = evilFunds;
	}//end setEvilFunds
	/**
	 * Statement that formats customer's inputed info from the OOPTester class 
	 * to the OOPCustomer class
	 * @return customer info
	 */
	public String toString() {
		return "Current Order: \n Name: " + name + "\n  Address: " +
				address + "\n  Evil Funds: $" 
				+ (new DecimalFormat("##.00").format(getEvilFunds()));
	}//end toString
	/**
	 * Adds funds to evilFunds
	 * @param funds - amount of money wanted to add to evil funds 
	 */
	public void addFunds(double funds) {
		evilFunds += funds;
	}//end addFunds
}//end OOPCustomer
