package onlineAdverts;

/**
 * @overview:	AdvertVisitor implements ListingVisitor and adds a body and return to the visit methods
 * @author	:	GavDotZip
 *
 */
public class AdvertVisitor implements ListingVisitor{

	@Override
	public double visit(GeneralListing generalListing) {
		double genPrice=generalListing.getPrice();
		return genPrice;
	}

	@Override
	public double visit(BookListing bookListing) {
		double bookPrice=bookListing.getPrice();
		return bookPrice;
	}

	@Override
	public double visit(CarListing carListing) {
		double carPrice=carListing.getPrice();
		return carPrice;
	}

	@Override
	public String visit(Seller seller) {
		String sell=seller.getName();
		return sell;
	}
	

}
