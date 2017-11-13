
public class Person {
	
	private Integer personKey;
	private String name;
	private String phoneNumber;
	private int age;
	
	public Person(String name, String phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.personKey = hashCode();
	}
	
	public int hashCode() {
		char[] nameArray = name.toCharArray();
		int hashValue = 0;
		for (int i = 0; i < name.length(); i++) {
			hashValue += nameArray[i];
		}
		return hashValue;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Callum", "(06)", 20);
	}

}
