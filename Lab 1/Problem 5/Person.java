public class Person {
	public Gender gender;
	Person(Gender gender){
		this.gender = gender;
	}
	public String ToString() {
		return "Gender of person is" + gender;
	}
}
