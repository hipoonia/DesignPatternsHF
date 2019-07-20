public class CeilingFan {

	public String name;
	
	public CeilingFan() {}
	
	public CeilingFan (String name) {
	
		this.name = name;
	}
	
	public void on() {
	
		System.out.println(name + " Ceiling Fan is on");
	}
	
	public void off() {
	
		System.out.println(name + " Celing Fan is off");
	}
}