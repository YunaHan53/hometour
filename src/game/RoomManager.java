package game;
import fixtures.Room;

public class RoomManager {

	public static Room[] init() {
		Room[] myFlat = new Room[3];
		
		Room startingRoom = new Room(
				"-back",
				"You are back in your bedroom\n You remember that you promised Jo that you'd give him a tour of your flat.",
				"",
				1,
				2,
				"The only door that's in front of you leads to the hallway, go forward?");
		myFlat[0] = startingRoom;

		Room hallway = new Room(
				"You walked out of your bedroom into the hallway\n",
				"The hallway is bright and long and leads straight into the living room\n",
				"On your left, there is a door that leads to the bathroom, but the door is locked right now\n",
				1,
				2,
				"You can go 'forward' into the livingroom or go 'back' to your bedroom. What would you like to do?");
		myFlat[1] = hallway;
		
//		Room livingRoom = new Room(
//				"My living room is large with floor-to-ceiling windows\n" +
//				"It is sunny out today and the windows let in a lot of light that brightens up the entire flat.");
//		myFlat[2] = livingRoom;
		
		return myFlat;
	}
	
}
