public class Problem3 {

	public static void main(String[] args) {
		Temperature today = new Temperature(2,scale.CELCIUS);
		System.out.println("Today weather is " + today.getTemperatureInCelcius() + " Celcius");
		System.out.println("Today weather is " + today.getTemperatureInFahrenheit() + " Fahrenheit");
	}

}
