package onlineAdverts;

/**
 * @overview:	BookListing extends and implements GeneralListing and Listing.
 * @author	:	GavDotZip
 *
 */
public class BookListing extends GeneralListing implements Listing{
	
	private String listingTitle;
	private String description;
	private String author;
	private String bookTitle;
	private String isbn;
	private double price;
	

	public BookListing(String listingTitle, String description,
			String author, String bookTitle, String isbn, double price) {
		super(listingTitle, description, price);
		this.listingTitle = listingTitle;
		this.description = description;
		this.author = author;
		this.bookTitle=bookTitle;
		this.isbn = isbn;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}



	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}



	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}



	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}



	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
