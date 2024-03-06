package onlineAdverts;

/**
 * @overview:	GeneralListing implements Listing interface and instantiates the accept method.
 * 				The class sets up the basic info required for the system
 * @author	:	GavDotZip
 *
 */
public class GeneralListing implements Listing{
	
	private String listingTitle;
	private String description;
	private Seller seller;
	private double price;
	
	public GeneralListing(String listingTitle, String description, double price) {
		this.listingTitle = listingTitle;
		this.description = description;
		this.price = price;
	}

	/**
	 * @return the listingTitle
	 */
	public String getListingTitle() {
		return listingTitle;
	}


	/**
	 * @param listingTitle the listingTitle to set
	 */
	public void setListingTitle(String listingTitle) {
		this.listingTitle = listingTitle;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the seller
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * override both accept methods within the Seller class
	 */
	@Override
	public double accept(ListingVisitor listingVisitor) {
		return listingVisitor.visit(this);
	}


	@Override
	public String accept1(ListingVisitor listingVisitor) {
		// TODO Auto-generated method stub
		return null;
	}

}
