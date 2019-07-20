public class GarageDoorUpCommand implements Command {
	
	GarageDoor gd;
	
	public GarageDoorUpCommand (GarageDoor gd) {
	
		this.gd = gd;
	}
	
	public void execute() {
	
		gd.up();
	}
}