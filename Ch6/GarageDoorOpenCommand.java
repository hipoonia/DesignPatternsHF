public class GarageDoorOpenCommand implements Command {
	
	GarageDoor gd;
	
	public GarageDoorOpenCommand (GarageDoor gd) {
	
		this.gd = gd;
	}
	
	public void execute() {
	
		gd.up();
	}
}