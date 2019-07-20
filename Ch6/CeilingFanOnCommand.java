public class CeilingFanOnCommand implements Command {

	CeilingFan cf;
	
	public CeilingFanOnCommand (CeilingFan cf) {
	
		this.cf = cf;
	}
	
	public void execute() {
	
		cf.on();
	}
}