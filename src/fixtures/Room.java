package fixtures;

public class Room extends Fixture {
	
	public int goForward;
	public int goBack;
	public String item;
	
	public Room(String name, String shortDescription, String longDescription, int forward, int back, String str) {
		super(name, shortDescription, longDescription);
		this.goForward = forward;
		this.goBack = back;
		this.item = str;
	}
		

}
