public class GarageDoorDownCommand implements Command {
	
	GarageDoor gd;
	
	public GarageDoorDownCommand (GarageDoor gd) {
	
		this.gd = gd;
	}
	
	public void execute() {
	
		gd.down();
	}
}