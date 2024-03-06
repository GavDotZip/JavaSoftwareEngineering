package onlineAdverts;

/**
 * @overview:	The seller class creates two string for the seller's information
 * @author	:	GavDotZip
 *
 */
public class Seller implements Listing{
	
	private String name;
	private String contact;


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return contact;
	}

	/**
	 * @param email the email to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * override both accept methods within the Seller class
	 */
	@Override
	public String accept1(ListingVisitor listingVisitor) {
		return listingVisitor.visit(this);
	}

	@Override
	public double accept(ListingVisitor listingVisitor) {
		return (Double) null;
	}

}
