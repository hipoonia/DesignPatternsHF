public abstract class Beverage {
// Beverage is an abstract class with two methods getDesc and cost()
	
	String description = "Unknown Beverage";
	
	public String getDescription() {
	
		return description;
	}
	// getDesc is already implemented.
	
	public abstract double cost();
}