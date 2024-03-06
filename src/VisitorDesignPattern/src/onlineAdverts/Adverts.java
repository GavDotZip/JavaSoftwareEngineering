package onlineAdverts;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @overview:	Acts as driver class to bring all classes together.
 * 				The user is in a contsant loop of the system until they enter -1 at the main display.
 * @author	:	GavDotZip
 * 
 */
public  class Adverts {
	public static void main(String args[]) {
		/**
		 * instantiate arrays to keep track of each class of listing
		 */
		ArrayList<GeneralListing> gen = new ArrayList<>();
		ArrayList<BookListing> books = new ArrayList<>();
		ArrayList<CarListing> cars = new ArrayList<>();
		
		/**
		 * variables across all classes to be used in the main class
		 */
		String listingTitle;
		String description;
		String author;
		String bookTitle;
		String isbn;
		String make;
		String model;
		String year;
		String engineSize;
		String name;
		String contact;
		
		/**
		 * variables to be used to track info across adverts
		 */
		int advertChoice;
		int listingType;
		int genCount;
		int carCount;
		int bookCount;
		double price;
		Seller seller;
		
		/**
		 * scanner will be used to take in user input
		 */
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to Ads Online! Please Select an option from the list below"
				+ "\n" + "(Type -1 to exit)");
		System.out.println("\t" + "1. Add a new listing");
		System.out.println("\t" + "2. Remove a listing");
		System.out.println("\t" + "3. Display all listings");
		System.out.println("\t" + "4. Get cost of all live listings");
		System.out.println("\t" + "5. Count listings by category");
		advertChoice = Integer.parseInt(key.nextLine());
		
		while(true) {
			/**
			 * take user choice and decide what to do from there
			 * if choice is -1, the program terminates
			 */
			if(advertChoice == -1) {
				key.close();
				System.out.println("Goodbye!");
				break;
	
			}
		
			/**
			 * while choice is 1, user prompted to add a listing
			 */
			else if(advertChoice == 1) {
				try {
					System.out.println("Choose a valid category: ");
					System.out.println("\t" + "1. General Listing");
					System.out.println("\t" + "2. Book Listing");
					System.out.println("\t" + "3. Car Listing");
					while(true) {
						listingType = Integer.parseInt(key.nextLine());
						System.out.println("Please enter the relevant information: ");
						/**
						 * all listings contain the some of the same variables
						 */
						System.out.println("Listing Title: ");
						listingTitle = key.nextLine();
						System.out.println("Listing Description: ");
						description = key.nextLine();
						System.out.println("Listing Price: ");
						price = Double.parseDouble(key.nextLine());
						/**
						 * set the information for the advert's seller
						 */
						System.out.println("Seller Name: ");
						name = key.nextLine();
						System.out.println("Seller Contact: ");
						contact = key.nextLine();
						seller = new Seller();
						seller.setName(name);
						seller.setContact(contact);
						/**
						 * with these universal variables set, we can move into exclusive variables
						 * if chocie is 1, add a general listing
						 */
						if(listingType == 1) {
							GeneralListing general1 = new GeneralListing(listingTitle, description, price);
							general1.setListingTitle(listingTitle);
							general1.setDescription(description);
							general1.setPrice(price);
							general1.setSeller(seller);
							gen.add(general1);
							break;
						}// end add general
						
						/**
						 * if choice is 2, add a book listing
						 */
						else if(listingType == 2) {
							System.out.println("Author: ");
							author = key.nextLine();
							System.out.println("Book Title: ");
							bookTitle = key.nextLine();
							System.out.println("ISBN: ");
							isbn = key.nextLine();
							BookListing book1 = new BookListing(listingTitle, description, author, bookTitle, isbn, price);
							book1.setListingTitle(listingTitle);
							book1.setDescription(description);
							book1.setPrice(price);
							book1.setAuthor(author);
							book1.setBookTitle(bookTitle);
							book1.setIsbn(isbn);
							book1.setPrice(price);
							book1.setSeller(seller);
							books.add(book1);
							break;
						}//end add book
						
						/**
						 * if choice is 3, add a car listing
						 */
						else if(listingType == 3){
							System.out.println("Make: ");
							make = key.nextLine();
							System.out.println("Model: ");
							model = key.nextLine();
							System.out.println("Year: ");
							year = key.nextLine();
							System.out.println("Engine Size: ");
							engineSize = key.nextLine();
							CarListing car1 = new CarListing(listingTitle, description, make, model, year, engineSize, price);
							car1.setListingTitle(listingTitle);
							car1.setDescription(description);
							car1.setPrice(price);
							car1.setMake(make);
							car1.setModel(model);
							car1.setYear(year);
							car1.setEngineSize(engineSize);
							car1.setSeller(seller);
							cars.add(car1);
							break;
						}//end add car
						
						/**
						 * if choice is -1, break if loop and return to menu
						 */
						else if(listingType == -1) {
							break;
						}
						
					}
					break;
				}
				
					catch(InputMismatchException ex) {
					
					/**
					 * if choice is invalid, prompt user
					 */
					
					System.out.println("Invalid input!" + "\n" + "(Enter choice -1, 1, 2, 3)");
					}
				
				key.nextLine();
				break;
	
				}
			
			/**
			 * while choice is 2, prompt user to remove an advert
			 */
			else if(advertChoice == 2) {
				try {
					System.out.println("Enter a listing title to remove from system: ");
					listingTitle = key.nextLine();
					/**
					 * request a listing title from the user and compare the input to listing titles
					 * within each arrayList. Then remove said listing
					 */
					for(int i=0; i<gen.size(); i++) {
						GeneralListing gen1 = gen.get(i);
						if(gen1.getListingTitle().equals(listingTitle)) {
							gen.remove(i);
							break;
						}
					}
					
					for(int i=0; i<books.size(); i++) {
						BookListing book1 = books.get(i);
						if(book1.getListingTitle().equals(listingTitle)) {
							books.remove(i);
							break;
						}
					}
					
					for(int i=0; i<cars.size(); i++) {
						CarListing car1 = cars.get(i);
						if(car1.getListingTitle().equals(listingTitle)) {
							cars.remove(i);
							break;
						}
					}
				
					
				}catch(InputMismatchException ex) {
					
					/**
					 * if choice is invalid, prompt user
					 */
					
					System.out.println("Invalid input!" + "\n" + "(Enter choice -1, 1, 2, 3)");
					}
				key.nextLine();
				break;
	
				}
			
			/**
			 * while choice is 3, display all listings to the user
			 */
			else if(advertChoice == 3) {
				for(int a=0; a<gen.size(); a++) {
					GeneralListing gen1 = gen.get(a);
					System.out.println(gen1);
				}
				
				for(int b=0; b<books.size(); b++) {
					BookListing book1 = books.get(b);
					System.out.println(book1);
				}
				
				for( int c=0; c<cars.size(); c++) {
					CarListing cars1 = cars.get(c);
					System.out.println(cars1);
				}
				break;
			}
			
	
			
			/**
			 * while choice is 4, calculate the cost of all live listings
			 */
			else if(advertChoice == 4) {
				calculatePrices(gen, books, cars);
				break;
			}
			/**
			 * while choice is 5, calculate the total listings live on the system
			 */
			else if(advertChoice == 5) {
				System.out.println("Total amount of listings: ");
				genCount=gen.size();
				bookCount=books.size();
				carCount=cars.size();
				System.out.println("Total amount of general listings: " + genCount);
				System.out.println("Total amount of book listings: " + bookCount);
				System.out.println("Total amount of car listings: " + carCount);
				int totalCount=genCount+bookCount+carCount;
				System.out.println("Total listings: " + totalCount);
				
				break;
			}
	
		}	
		key.close();
	}//end main class

	/**
	 * this method will use the accept visitor method in order to calculate the total price across all listings
	 */
	private static double calculatePrices(ArrayList<GeneralListing> gen, ArrayList<BookListing> books, ArrayList<CarListing> cars) {
		double sumGen = 0.0;
		double sumBook = 0.0;
		double sumCar = 0.0;
		/**
		 * create new instances of AdvertVisitor to 
		 */
		ListingVisitor lv1 = new AdvertVisitor();
		ListingVisitor lv2 = new AdvertVisitor();
		ListingVisitor lv3 = new AdvertVisitor();
		
		/**
		 * use for loops to loop through each list getitng the price and calculating totals for the list
		 */
		for(GeneralListing gl : gen) {
			sumGen = sumGen + gl.accept(lv1);
		}
		
		for(BookListing bl : books) {
			sumBook = sumBook + bl.accept(lv2);
		}
		
		for(GeneralListing cl : cars) {
			sumCar = sumCar + cl.accept(lv3);
		}
		
		/**
		 * add all totals for a definitive total
		 */
		System.out.println("Total Price of live listings: ");
		double totalPrice = sumGen + sumBook + sumCar;
		return totalPrice;
		
	}//end method

}//end class
