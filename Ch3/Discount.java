public class Discount extends CondimentDecorator {

	Beverage beverage;
	
	public Discount (Beverage beverage) {
	
		this.beverage = beverage;
	}
	
	public String getDescription() {
	
		return beverage.getDescription() + ", with 10 cents Discount";
	}
	
	public double cost() {
	
		return beverage.cost() - 0.10;
	}
}