public class Data {
	private static int cnt = 0;
	private static double sum = 0;
	private	double data;
	public void setData(double data) {
		this.data = data;
		cnt++;
		sum += data;
		Analyzer.checkMax(data);
	}
	public static double getAverage() {
		return Analyzer.calculateAverage(sum,cnt);
	}
	public static double getMaximum() {
		return Analyzer.max;
	}
}
