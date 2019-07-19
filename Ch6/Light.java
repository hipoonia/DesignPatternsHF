public class Light {
	
	private boolean on;

	public Light() {
	
		this.on = false;
	}
	
	public void on() {
	
		on = true;
		System.out.println("Light is on");
	}
	
	public void off() {
	
		on = false;
		System.out.println("Light is off");
	}
}