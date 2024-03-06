package onlineAdverts;

/**
 * @overview:	CarListing extends and implements GeneralListing and Listing.
 * @author	:	GavDotZip
 *
 */
public class CarListing extends GeneralListing implements Listing{

	private String listingTitle;
	private String description;
	private String make;
	private String model;
	private String year;
	private String engineSize;
	private Seller seller;
	private double price;
	
	
	
	public CarListing(String listingTitle, String description, String make, String model, String year, String engineSize, double price) {
		super(listingTitle, description, price);
		this.listingTitle = listingTitle;
		this.description = description;
		this.make = make;
		this.model = model;
		this.year = year;
		this.engineSize = engineSize;
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
	 * @return the make
	 */
	public String getMake() {
		return make;
	}



	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}



	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}



	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}



	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}



	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}



	/**
	 * @return the engineSize
	 */
	public String getEngineSize() {
		return engineSize;
	}



	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
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

	@Override
	public double accept(ListingVisitor listingVisitor) {
		return listingVisitor.visit(this);
	}

}
