public class Analyzer extends Data{
	static double max = Double.MIN_VALUE; 
	private static double average = 0;
	public static double calculateAverage(double sum, int cnt){
		average = sum/cnt;
		return average;
	}
	public static void checkMax(double data) {
		if(data>max) 
		max = data;
	}
}
