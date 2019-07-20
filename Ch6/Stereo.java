public class Stereo {

	public String name;
	private boolean on;
	private boolean off;
	private String CD;
	private String DVD;
	private String radioChannel;
	private int volume;
	
	public Stereo() {
	
		this.on = false;
		this.off = true;
	}
	
	public Stereo(String name) {
	
		this.on = false;
		this.off = true;
		this.name = name;
	}
	
	public void on() {
	
		this.on = true;
		this.off = false;
		System.out.println(name + " Stereo is ON");
	}
	
	
	
	public void off() {
	
		this.on = false;
		this.off = true;
		System.out.println(name + " Stereo is OFF");
	}
	
	public void setCD() {
	
		CD = "Ravi Shankar CD set";
		System.out.println("CD is SET");
	}
	
	public void setVolume(int vol) {
	
		volume = vol;
		System.out.println("Volume is set to "+ vol);
	}
	
	
}