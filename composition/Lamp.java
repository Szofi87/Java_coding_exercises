package composition;

public class Lamp {

	private String style;
	private boolean battery;
	private int globRating;
	
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	
	public void turnOn() {
		System.out.println("Turned on");
	}
	
	public String getStyle() {
		return style;
	}

	public int getGlobRating() {
		return globRating;
	}
	public boolean isBattery(){
		return battery;
	}
}
