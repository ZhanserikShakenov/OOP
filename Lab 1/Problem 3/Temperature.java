public class Temperature {
	private double temp;
	private scale sCale;
	Temperature(){
		temp = 0;
		sCale = scale.CELCIUS;
	}
	Temperature(scale sCale){
		temp = 0;
		this.sCale = sCale;
	}
	Temperature(double temp){
		this.temp = temp;
		sCale = scale.CELCIUS;
	}
	Temperature(double temp, scale sCale){
		this.temp = temp;
		this.sCale = sCale;
	}
	public double getTemperatureInCelcius() {
		if(sCale!=scale.CELCIUS) {
			temp = 5*(temp-32)/9;
			sCale = sCale.CELCIUS;
		}
		return temp;
	}
	public double getTemperatureInFahrenheit() {
		if(sCale!=scale.FAHRENHEIT) {
			temp = 9*temp/5+32;
			sCale = sCale.FAHRENHEIT;
		}
		return temp;
	}
	public void setTemperature(double temp) {
		this.temp = temp;
	}
	public void setScale(scale sCale) {
		this.sCale = sCale;
	}
	public void setMeasurement(double temp, scale sCale) {
		this.temp = temp;
		this.sCale = sCale;
	}
	public scale getScale() {
		return sCale;
	}
}