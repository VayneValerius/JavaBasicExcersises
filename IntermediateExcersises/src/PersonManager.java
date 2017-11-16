import java.util.ArrayList;

public class PersonManager {
	
	protected ArrayList<Person> personList = new ArrayList<Person>();
	
	public Person searchName(String searchedName) {
		for (Person person : personList) {
			if (searchedName == person.getName()) {
				return person;
			}
		}
		return null;
	}

}
