public class GarageDoor {

	private boolean open;
	public String name;
	
	public GarageDoor(String name) {
	
		this.name = name;
	}
	
	public GarageDoor() {}
	
	public void up() {
	
		open = true;
		System.out.println(name + " Grarage door is open.");
	}
	
	public void down() {
	
		open = false;
		System.out.println(name + " Garage door is closed.");
	}
}