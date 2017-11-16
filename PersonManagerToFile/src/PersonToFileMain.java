import java.io.IOException;

public class PersonToFileMain {

	public static void main(String[] args) throws IOException {
		PersonManager personManager = new PersonManager();
		FileManager fileManager = new FileManager();

		PersonClass person1 = new PersonClass("John", "Builder", 28);
		PersonClass person2 = new PersonClass("Steve", "Bartender", 33);
		PersonClass person3 = new PersonClass("Dave", "Retired", 75);
		PersonClass person4 = new PersonClass("Sarah", "Teacher", 47);
		PersonClass person5 = new PersonClass("Beth", "Runner", 19);

		personManager.personList.add(person1);
		personManager.personList.add(person2);
		personManager.personList.add(person3);
		personManager.personList.add(person4);
		personManager.personList.add(person5);

		System.out.println(personManager.cyclePeople());

		fileManager.fileWriter(personManager.cyclePeople(), "personList.txt");
		System.out.println(fileManager.fileReader("personList.txt"));
		System.out.println("");

		System.out.println(fileManager.setBackToPersonClass("personList.txt"));
	}

}
