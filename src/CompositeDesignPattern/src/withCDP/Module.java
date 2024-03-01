package withCDP;

import java.util.ArrayList;
import java.util.List;

public class Module extends LectureInformation{
	
	//we make the arrayList of type LectureInfromation
	private List<LectureInformation> topics = new ArrayList<>();
	//data variable for module's information
	private String name;
	private String code;

	//constructor
	public Module(String name, String code) {
		this.name=name;
		this.code=code;
	}
	
	/*with arrayList of type LectureInfromation, anytime we use addTopic
	*it can instantiate type Module or Topic
	*/
	public void addTopic(LectureInformation t) {
		topics.add(t);
	}
	
	public void removeTopic(LectureInformation t) {
		topics.remove(t);
	}
	
	//method to display information regarding each topic
	public void displayInfo() {
		System.out.println(name + " " + code);
		for(LectureInformation t:topics) {
			t.displayInfo();
		}
	}	

}
