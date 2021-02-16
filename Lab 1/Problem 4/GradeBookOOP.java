import java.util.*;

public class GradeBookOOP{
	double max,min,avg;
	double sum =0;
	Scanner scanner = new Scanner(System.in);
	Subject subject;
	ArrayList<Student> students = new ArrayList<Student>();
	String[] options = {"00-09", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
	int cnt[] = new int[11];
	Calculator calculator =new Calculator();
	
	public GradeBookOOP(Subject subject) {
		this.subject = subject;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public double getAverage() {
		return calculator.defineAvg(sum, students.size());
	}
	public void setMax(double max) {
		this.max = max;
	}
	
	public void setMin(double min) {
		this.min = min;
	}
	
	public void setGrades() {
		for(Student student : students) {
			System.out.print("Student " + student.getName() + ": ");
			double score = scanner.nextInt();
			student.setScore(score);
			sum+=score;
			calculator.defineMax(score);
			calculator.defineMin(score);
		}
	}
	
	public void DisplayMessage() {
		System.out.println("Hello it is grade book for " + subject.getName() + "!");
	}
	
	public void outputBarChart(){
		System.out.println("Grades distribution: ");
		for(Student student : students){
			cnt[(int)(student.getScore()/10)]++;
		}

		for(int i = 0; i<options.length; i++){
			String s = "";
			for(int j=0; j<cnt[i]; j++){ 
				s+="*";
			}
			System.out.println(options[i] + ": " +s);
		}		
	}

	public void displayGradeReport() {
		String name1 = null, name2 = null;
		int id1=0, id2=0;
		int index  =1;
		for(Student student : students) {
			if(student.getScore() == max) {
				name1 = student.getName();
				id1 = index;
			}
			if(student.getScore()==min) {
				name2 = student.getName();
				id2 = index;
			}
			index++;
		}
		
		System.out.println("Class average is " + getAverage() + ". Lowest grade is " + min  + "(Sudent " + name2 + ", id: " + id2 + ")" + "Largest grade is " + max + "(Student " + name1 + ", id: " + id1 + ").");  
	}
}