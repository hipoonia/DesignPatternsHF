public class Light {
	
	public String name;
	private boolean on;
	private boolean off;

	public Light() {
	
		this.on = false;
		this.off = false;
	}
	
	public Light(String name) {
	
		this.on = false;
		this.off = false;
		this.name = name;
	}
	
	public void on() {
	
		on = true;
		off = false;
		System.out.println(name + " Light is on");
	}
	
	public void off() {
	
		on = false;
		off = true;
		System.out.println(name + " Light is off");
	}
}