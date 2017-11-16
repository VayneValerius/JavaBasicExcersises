
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public void fileWriter(String input, String fileName) throws IOException {
		File file = new File(fileName);
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(input.trim());
		writer.flush();
		writer.close();
	}

	public String fileReader(String input) throws IOException {
		String output = "";
		FileReader fileReader = new FileReader(input);
		char[] a = new char[1000];
		fileReader.read(a);

		for (char c : a) {
			output = output + c;
		}

		return output;
	}

	public String setBackToPersonClass(String input) throws IOException// , PersonManager ArrayList)
	{
		// ArrayList setBack = new ArrayList();
		ArrayList<PersonClass> newList = new ArrayList<PersonClass>();
		String[] personData = fileReader(input).split("\n");
		String output = "";
		for (int i = 0; i < personData.length; i++) {
			String[] personDataSplit = personData[i].split(" ");
			PersonClass person = new PersonClass(personDataSplit[0], personDataSplit[2],
					Integer.parseInt(personDataSplit[1]));
			newList.add(person);
		}

		for (PersonClass person : newList) {
			output += person.toString() + "\n";
		}
		return output;
	}
}
