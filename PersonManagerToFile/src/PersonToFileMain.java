import java.io.IOException;
import java.util.ArrayList;

public class PersonToFileMain {

	public static void main(String[] args) throws IOException {
		PersonManager personManager = new PersonManager();
		FileManager fileManager = new FileManager();

		personManager.addPeople("John", "Builder", 31);
		personManager.addPeople("Steve", "Driver", 59);
		personManager.addPeople("Cath", "Retired", 73);
		personManager.addPeople("Jane", "Teacher", 44);
		personManager.addPeople("Bob", "Farmer", 27);

		System.out.println(personManager.cyclePeople());
		fileManager.fileWriter(personManager.cyclePeople(), "personList.txt");
		System.out.println(fileManager.fileReader("personList.txt"));
		System.out.println("");
		System.out.println(fileManager.setBackToPersonClass("personList.txt"));
	}

}
