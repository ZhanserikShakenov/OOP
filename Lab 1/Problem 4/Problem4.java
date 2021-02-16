public class Problem4 {
	public static Subject course = new Subject("CS101 Object-oriented Programming and Design", "Java coding", 3);
	
	public static GradeBookOOP gradebook = new GradeBookOOP(course);
	public static void main(String[] args) {
		for(char i = 'A'; i<='J'; i++) {
			String s = i+"";
			Student student = new Student(s,0);
			gradebook.addStudent(student);
		}
		
		System.out.println();
		gradebook.DisplayMessage();
		gradebook.setGrades();
		System.out.println();
		gradebook.displayGradeReport();
		System.out.println();
		gradebook.outputBarChart();
	}
}