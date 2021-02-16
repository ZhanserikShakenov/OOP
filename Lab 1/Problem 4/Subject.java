public class Subject {
	String name, description;
	int number_of_credits;
	
	public Subject(String name, String description, int number_of_credits) {
		this.name = name;
		this.description = description;
		this.number_of_credits = number_of_credits;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setNumberOfCredits(int number_of_credits) {
		this.number_of_credits = number_of_credits;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getNumberofCredits() {
		return number_of_credits;
	}
	
	public String toString() {
		return ("Name: " + name + "\nDescription:  " + description + "\nNumber of credits:  " + number_of_credits); 
	}
	
}