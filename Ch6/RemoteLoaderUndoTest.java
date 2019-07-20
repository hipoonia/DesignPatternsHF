public class RemoteLoaderUndoTest {

	public static void main (String[] args) {
	
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light lrl = new Light("Living Room");
		
		LightOnCommand lrlOn = new LightOnCommand(lrl);
		LightOffCommand lrlOff = new LightOffCommand(lrl);
		
		remoteControl.setCommand(0, lrlOn, lrlOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		System.out.println(remoteControl);
		
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		
		System.out.println(remoteControl);
		
		remoteControl.undoButtonWasPushed();
	}
}