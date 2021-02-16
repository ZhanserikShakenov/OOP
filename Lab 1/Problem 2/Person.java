public class Person {
	public Gender gender;
	public String name;
	Person(Gender gender){
		this.gender = gender;
	}
	Person(String name){
		this.name = name;
	}
	public String ToString() {
		return "Gender of person is" + gender;
	}
}
