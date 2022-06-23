package finalProject;

public class RoomMaker {
	/**
	 * 
	 * @param r is an int value that is used to determine which room will be selected
	 * @return output: output is the string equivalent of the room from the array "rooms" and will print out as such 
	 */
	public static  String roomMaker( int r) {
		//select a room randomly
		
			//select a room randomly
			
			String output = "";
			//String string = "";
			String rooms [][] = {{"Musty Cavern", "Ancient Library", "Forgotten Tomb"}};	
				
				//generate room names 	
				if(r == 0) {
					output = rooms[0][0];//musty cavern
					//string = "You will now enter into the : " + output + '\n';	
				} 
				else if(r == 1) {
					output = rooms[0][1];//ancient library
					//string = "You will now enter into the : " + output+ '\n';
				}
				else if(r == 2) {
					output = rooms[0][2];//forgotten tomb
					//System.out.println("You will now enter into the : " + output+ '\n');
					// string = "You will now enter into the : " + output+ '\n';
				} return output;
			}	
	}

