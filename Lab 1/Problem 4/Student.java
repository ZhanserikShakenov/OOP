public class Student {
	public String name;
	private double scoreOOP;
	Student(){
		
	}
	Student(String name, double score){
		this.name = name;
		scoreOOP = score;
	}
	public void setStudent(String name, double score) {
		this.name = name;
		scoreOOP = score;
	}
	public void setScore(double score) {
		scoreOOP = score;
	}
	public double getScore() {
		return scoreOOP;
	}
	public String getName() {
		return name;
	}
}
