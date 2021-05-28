package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
		
	// Main method
	public static void main(String[] args) {
		
		// Create new player instance
		Player p1 = new Player();
		
		// Run the init method to instantiate our house
		Room[] myFlat = RoomManager.init();

		p1.setCurrentRoom(myFlat[0]);

		if(p1.getIndex() == 0) {
		System.out.println("You woke up this morning at 9:55am\n"); 
		System.out.println("You immediately realized that you need to get ready in 5 minutes.\n");
		System.out.println(p1.getCurrentRoom().longDescription);
		}
		
		while(true) {
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			String[] t = str.split("\\s+");
			
			
			//go ____ options
			if(t[0].equals("Go") || t[0].equals("go")) {
				if(t[1].equals("forward") || t[1].equals("Forward")) {
					goForward(p1,myFlat);
				}else if(t[1].equals("back") || t[1].equals("Back")) {
					goBack(p1,myFlat);
				}else {
					System.out.println("I dont think I can go that way");
				}
			}else if(t[0].equals("Forward") || t[0].equals("forward")) {
				goForward(p1,myFlat);
			}else if(t[0].equals("Back") || t[0].equals("back")) {
				goBack(p1,myFlat);
			s.close();
			}
		}

	}

		
	public static void goForward(Player p1, Room[] myFlat) {

		p1.setIndex(p1.getIndex() +p1.getCurrentRoom().goForward );
		p1.setCurrentRoom(myFlat[p1.getIndex()]);
		System.out.println(p1.getCurrentRoom().longDescription);	
	}
	
	public static void goBack(Player p1, Room[] myFlat) {

		p1.setIndex(p1.getIndex() +p1.getCurrentRoom().goBack );
		p1.setCurrentRoom(myFlat[p1.getIndex()]);
		System.out.println(p1.getCurrentRoom().longDescription);
		
	}
	
}
