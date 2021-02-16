public class Book {
	public final Genre GENRE; 
	public int pages;
	public double rating;
	public final String AUTOR,PUBLISHED;
	public String Nominations;
	private int id = 0;
	{
		++id;
	}
	Book(String name, Genre genre, String date){
		AUTOR = name;
		GENRE = genre;
		PUBLISHED = date;
	}
	public void setNomination(String nomination) {
		Nominations += nomination+ ", ";
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setRating(int rating) {
		this.rating = (double)rating;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getId() {
		return id;
	}
}
