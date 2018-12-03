package oopFinalProject;

public class OOPCustomer {
	private String address;
	private String name;
	private int evilFunds;
	
	/**
	 * 
	 * @param address
	 * @param name
	 * @param evilFunds
	 */
	public OOPCustomer(String address , String name , int evilFunds) {
		this.address = address;
		this.name = name;
		this.evilFunds = evilFunds;
	}//end OOPCustomer(String,String,int)
	/**
	 * 
	 * @return address of customer
	 */
	public String getAddress() {
		return address;
	}//end getAddress
	/**
	 * 
	 * @return name of customer
	 */
	public String getName() {
		return name;
	}//end getName
	/**
	 * 
	 * @return evil funds of customer
	 */
	public int getEvilFunds() {
		return evilFunds;
	}//end getEvilFunds
	public void setEvilFunds(int evilFunds) {
		this.evilFunds = evilFunds;
	}//end setEvilFunds
	/**
	 * @return customer info
	 */
	public String toString() {
		return "Name: " + name + "\nAddress: " +
	address + "\nEvil Funds: " + evilFunds;
	}//end toString
	/**
	 * Adds funds to evilFunds
	 * @param funds 
	 */
	public void addFunds(double funds) {
		evilFunds += funds;
	}//end addFunds

}//end OOPCustomer
