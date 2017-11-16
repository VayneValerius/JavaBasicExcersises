//import java.util.ArrayList;

public class Person {
	private String name, job;
	private int age;

	public static void main(String[] args) {
		
		PersonManager personManager = new PersonManager();
		Person person1 = new Person("Steve", 22, "Rocket Engineer");
		Person person2 = new Person("Clive", 45, "Dragon");
		Person person3 = new Person("Elizabeth", 91, "Monarch");

		personManager.personList.add(person1);
		personManager.personList.add(person2);
		personManager.personList.add(person3);

		for (Person person : personManager.personList) {
			System.out.println(person.toString());
		}

		System.out.println(personManager.searchName("Clive"));
	}

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "I am " + name + " and I am " + age + " years old.  I am a " + job + ".";
	}
}