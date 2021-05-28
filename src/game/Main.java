package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
		
	// Main method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		Player p1 = new Player();
		Room[] myFlat = RoomManager.init();
		p1.setCurrentRoom(myFlat[0]);

		if(p1.getIndex() == 0) {
		System.out.println("You woke up this morning at 9:55am\nYou immediately realized that you need to get ready in 5 minutes.\n");
		System.out.println(p1.getCurrentRoom().longDescription);
		}
		while(true) {
			
			
			
		}
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] tok = str.split("\\s+");

		//go ____ options
		if(tok[0].equals("Go") || tok[0].equals("go")) {
			if(tok[1].equals("forward") || tok[1].equals("Forward")) {
				goForward(p1,myFlat);
			}else if(tok[1].equals("back") || tok[1].equals("Back")) {
				goBack(p1,myFlat);
			}else {
				System.out.println("I dont think I can go that way");
			}
		}

	}

		
	public static void goForward(Player p1, Room[] myFlat) {
		if(p1.getIndex() == 1) {
			System.out.println("There's no door there");
		}
		p1.setIndex(p1.getIndex() +p1.getCurrentRoom().goForward );
		p1.setCurrentRoom(myFlat[p1.getIndex()]);
		System.out.println(p1.getCurrentRoom().longDescription);	
	}
	
	public static void goBack(Player p1, Room[] myFlat) {
		if(p1.getIndex() == 1) {
			System.out.println("There's no door there");
		}
		p1.setIndex(p1.getIndex() +p1.getCurrentRoom().goBack );
		p1.setCurrentRoom(myFlat[p1.getIndex()]);
		System.out.println(p1.getCurrentRoom().longDescription);
		
	}
	
}
