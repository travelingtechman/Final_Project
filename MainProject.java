package finalProject;
import java.util.Scanner;
/**
 * 
 * @author ethan hunt
 * @Date 6/23/2022
 * 
 * 
 * 
 */
public class MainProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String output = "";
		String whatever = "";
		String check1 = "Musty Cavern";
		String check2 = "Ancient Library";
		String check3 = "Forgotten Tomb";
		boolean run = true;
		int r = 0;
		int i = 0;
		Player player = new Player(10,2);
		//begin the program
		System.out.println("Welcome to the \"text based adventure game\", all inputs should be entered as text or numbers, capitalization does not effect your responses. \nType Start to begin" );
		String userStatus = input.nextLine();
		
		 do{	
			
			Rooms room = new Rooms(i);
			if((room.getRoom() != check1 ) && (room.getRoom() != check2) && (room.getRoom() != check3)) {
				player.setHealth(0);
			}
			
			
			//  String string = room.roomChecker(room.getRoom());
			room.roomChecker(room.getRoom());
			int playerChoice = input.nextInt();
			if(i == 0) {
			room.mustyCavern(playerChoice);
			} else if (i == 1) {
				room.ancientLibrary(playerChoice);
			} else if (i == 2) {
				room.forgottenTomb(playerChoice);
			}
			if(playerChoice == 0) {
					player.setHealth(player.getHealth()-4);
					System.out.println("Your health is now down to " + player.getHealth() + "\n");
			}else if(playerChoice == 1) {
					player.setHealth(player.getHealth()-1);
					System.out.println("Your health is now down to " + player.getHealth() + "\n");
			}else if(playerChoice == 2) {
					player.setHealth(player.getHealth()-2);
					System.out.println("Your health is now down to " + player.getHealth() + "\n");
		 	}else if(playerChoice ==3) {
					player.setHealth(0);
					System.out.println("Your health is now down to " + player.getHealth() + "\n");
		 	}else if(playerChoice == 4) {
					player.setHealth(player.getHealth()-5);
					System.out.println("Your health is now down to " + player.getHealth() + "\n");
			}else if(playerChoice == 5) {
				System.out.println("you win");
				i=3;
			}
			
			i++;
		
		//select random(or not random) room for player to explore
		//have the user pick from the items in the room
		//have a monster be introduced based on the room they're in, the player fight the monster, based on the item they selected will be what determines how much damage they receive from the trade off of attacks.
		//if the user's health reaches anything less then 1 display a game over message and end program or prompt for the start again, or if enemy health reaches 0 or less then 0 continue to the next map
			} while ((i < 3) && (player.isPlayerDead(player.getHealth()) == false));
		System.out.println("\n\n\nGAME OVER, restart program to play again");
	
	}
}
