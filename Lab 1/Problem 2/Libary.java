import java.util.*;
public class Libary {
	ArrayList<Book> books = new ArrayList<>();
	private ArrayList<Person> employees = new ArrayList<>();
	static ArrayList<Person> accounts = new ArrayList<>();
	final String internetPassword;
	Libary(){
		internetPassword = "A123456789";
	}
	Libary(ArrayList<Book> books){
		this();
		this.books = books;
	}
	String showPassword() {
		return internetPassword;
	}
	public void setNewEmployee(Person human) {
		employees.add(human);
	}
	static void setNewAccount(Person human) {
		accounts.add(human);
	}
}
