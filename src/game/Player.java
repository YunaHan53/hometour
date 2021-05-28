package game;

import fixtures.Room;

public class Player {
	
	private int index = 0;
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}

	public Room currentRoom;

//	public Player(Room startingRoom) {
//		this.currentRoom = startingRoom;
//	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
