package withCDP;

public class Main {
	public static void main(String args[]) {
	//create new instances of Module
	Module soft = new Module("MSc Software Design and Development " + "GY987", "");
	Module algorithms = new Module("Algorithms " + "CT518", "");
	Module multimedia = new Module("Multimedia Development ", "CT827");
	
	//create new instances of Topic
	Topic affinity = new Topic("Affinity Photo");
	Topic audacity = new Topic("Audacity");
	Topic bubbleSort = new Topic("Bubble Sort");
		
	//add topics to module and display the info
	soft.addTopic(algorithms);
	soft.addTopic(multimedia);
	soft.addTopic(affinity);
	algorithms.addTopic(bubbleSort);
	multimedia.addTopic(audacity);
	
	soft.displayInfo();

	}

}
