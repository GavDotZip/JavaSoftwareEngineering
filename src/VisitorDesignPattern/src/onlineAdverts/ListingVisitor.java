package onlineAdverts;

/**
 * @overview:	ListingVisitor creates the .visit methods which will be implemented in each
 * 				class. Return types are double and string
 * @author	:	GavDotZip
 *
 */
public interface ListingVisitor {
	
	public double visit(GeneralListing generalListing);
	public double visit(BookListing bookListing);
	public double visit(CarListing carListing);
	public String visit(Seller seller);

}
