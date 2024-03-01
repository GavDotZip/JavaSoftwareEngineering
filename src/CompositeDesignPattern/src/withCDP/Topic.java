package withCDP;

public class Topic extends LectureInformation{
	
	//data variables
	private String title;

	//constructor
	public Topic(String title) {
		this.title=title;
	}
			
	//method to display the information of the module
	public void displayInfo() {
		//"\t" is for formatting purposes
		System.out.println("\t" + title);
	}

}
