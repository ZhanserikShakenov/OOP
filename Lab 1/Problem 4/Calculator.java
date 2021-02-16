public class Calculator {
	double max = Integer.MIN_VALUE;
	double min = Integer.MAX_VALUE;
	
	public Calculator() {}
	
	public void defineMax(double data) {
		if(data > max)
			max = data;
		Problem4.gradebook.setMax(max);
	}
	
	public void defineMin(double data) {
		if(data <min)
			min = data;
		
		Problem4.gradebook.setMin(min);
	}
	
	public double defineAvg(double sum, double count) {
		if(sum==0)
			return 0.0;
		else 
			return sum/count;
	}
}
