package onlineAdverts;

/**
 * @overview:	The Listing interface takes the .visit methods and takes them into the .accept
 * 				methods which will be instantiated within other classes.
 * @author	:	GavDotZip
 *
 */

public interface Listing {
	
	public double accept(ListingVisitor listingVisitor);
	public String accept1(ListingVisitor listingVisitor);

}
