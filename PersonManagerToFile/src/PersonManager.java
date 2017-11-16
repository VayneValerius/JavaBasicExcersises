import java.util.ArrayList;

public class PersonManager {

	protected ArrayList<PersonClass> personList = new ArrayList<PersonClass>();

	public String cyclePeople() {
		String output = "";
		for (PersonClass person : personList) {
			output = output + person.toString() + "\n";
		}
		return output;
	}

}
