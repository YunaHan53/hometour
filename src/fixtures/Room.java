package fixtures;

public class Room extends Fixture {

	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
		
	public Room[] getExits() {
		
	}
		
	public Room getExit(String direction) {
		
	}
}
