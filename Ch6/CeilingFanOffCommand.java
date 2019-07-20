public class CeilingFanOffCommand implements Command {

	CeilingFan cf;
	
	public CeilingFanOffCommand (CeilingFan cf) {
	
		this.cf = cf;
	}
	
	public void execute() {
	
		cf.off();
	}
}