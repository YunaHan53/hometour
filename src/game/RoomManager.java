package game;
import fixtures.Room;

public class RoomManager {

	public static Room[] init() {
		Room[] myFlat = new Room[4];
		
		Room startingRoom = new Room(
				"You wake up again...\n",
				"You are back in your bedroom\n",
				"You remember that you promised Jo that you'd give him a virtual tour of your flat.\n"
				+ "You prepared and got on a Zoom video call with Jo and you began the tour.\n"
				+ "There are two windows behind you from where you are standing\n"
				+ "and the only door that's in front of you exits to the hallway, go 'forward'?\n",
				1,
				2,
				"");
		myFlat[0] = startingRoom;

		Room hallway = new Room(
				"forward - ",
				"Hallway",
				"You walked out of your bedroom into the hallway.\n"
				+ "The hallway is bright and long with navyblue carpet and white walls.\n"
				+ "On your left, there is a door that leads to the bathroom, but the door is locked right now.\n"
				+ "At the end of the hallway, you can see the large living room. Go 'forward'?\n",
				1,
				2,
				"");
		myFlat[1] = hallway;
		
		Room livingRoom = new Room(
				"forward - ",
				"Living Room",
				"You decided to walk the length of the hallway into the living room.\n"
				+ "The living room is large with floor-to-ceiling windows.\n"
				+ "It is very sunny out today and the windows let in a lot of light that brightens up the entire flat."
				+ "To the right of the living room, there is the kitchen/dining room. Go 'forward'?\n",
				1,
				2,
				"");
		myFlat[2] = livingRoom;
		
		Room kitchen = new Room(
				"forward - ",
				"Kitchen/dining room",
				"You decided to take a right into the kitchen/dining room.\n"
				+ "The kitchen is large with open space design and L-shaped layout.\n"
				+ "On the left wall there are three large built-in pantry cabinets.\n"
				+ "On the far right wall, there is a sliding glass door leading to the backyard.\n"
				+ "This concludes the tour of my home. Thank you!",
				1,
				2,
				"");
		myFlat[3] = kitchen;
		
		return myFlat;
	}
	
}
