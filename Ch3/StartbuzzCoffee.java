public class StartbuzzCoffee {

	public static void main (String args[]) {
	
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage b2 = new DarkRoast();
		b2 = new Mocha(b2);
		
		b2 = new Whip(b2);
		b2 = new Mocha(b2);
		
		System.out.println(b2.getDescription() + " $" + b2.cost());
		
		Beverage b3 = new HouseBlend();
		b3 = new Soy(b3);
		b3 = new Mocha(b3);
		b3 = new Whip(b3);
		
		System.out.println(b3.getDescription() + " $" + b3.cost());
		
		Beverage b4 = new Decaf();
		b4 = new SteamedMilk(b4);
		System.out.println(b4.getDescription() + " $" + b4.cost());
	}
}