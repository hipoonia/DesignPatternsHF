public class WeatherStation1 {

	public static void main (String[] args) {
	
		WeatherData1 weatherData = new WeatherData1();
		
		CurrentConditionDisplay1 currentDisplay = new CurrentConditionDisplay1(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}