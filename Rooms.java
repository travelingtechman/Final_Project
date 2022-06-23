package finalProject;


/**
 * This class creates rooms and allows you to interact with them
 * @author ethan
 *
 */
public class Rooms {
	int r = 0;
	String output = "";
	Rooms(){
		
	}
	/**
	 * This constructs a room using the value of r
	 * @param r is an int value which decides what room will be selected
	 */
	Rooms(int r){
		output = RoomMaker.roomMaker(r);
	}
	public void setRoom(String output) {
		this.output = output;
	}
	/**
	 * This returns the current room
	 * @return the current room that is active for the player
	 */
	public String getRoom() {
		return this.output;
	}
	/**
	 * 
	 * @param userInput int: the value from the user to determine what item they want to select
	 * @return int number: this is a value that will determine the out
	 */
	public int mustyCavern(int userInput) {
		int number = -1;
		if(userInput == 0) {
				System.out.println("You pull the flashlight out of your bag and hit the switch to turn it on, and suddenly everything goes quite and you no longer hear any "
					+ "sounds other then the water dripping from the ceiling.\nYou point your flashlight around the room and something reflective catches your eye "
					+ "against the wall, as your eyes begin to focus you make out the shape of a trophy.\nYou pick up the trophy and read the engraved words and it says"
					+ "\"#1 Most Light-Senitive Misanthrope From 1812-2022\" suddenly you catch a glimps of movement behind you in the reflection on the trophy.\n"
					+ "You turn around and point the flashlight directly into the face of a very tall hairy misanthrope with giant thumbs instead of legs and arms, it then lets out a "
					+ "high pitched screech and begins to scratch you using its enlarged thumb nails that are more sharp then they would seem.\nIn quick, percise motions "
					+ "it makes deep lacerations all over your body causing you to lose conciosnes due to blood loss and you fall to the groud and die as it begins to consume your flesh but\n "
					+ "by some twist of fate u remember what the trophie said and grab the flashlight with all of the effort you are able to muster and point it directly into the eyes of the beast \n"
					+ "rendering it blind as it rears back from the contact with the light, it hits its back directly into a wall revealing a seceret tunnel giving you a chance to escape. \n"
					+ "\nYou lost 4 health points due to blood loss... ");
					
				number = 0;
		}else if(userInput == 1) {
			
				System.out.println("you spark the lighter and you instantly discover what the source of the strange odor, the cavern is full of\n"
						+ "natural propane and  as you sparked the lighter it caused an explosion that sent you flying against a wall. As you hit\n "
						+ "the wall it crumbles under the force of the impact reveling a secret tunnel that leads out of the cave into a new area. "
						+ "\nYou lost 1 health point due to a concussion...");
				number = 1;
		}else if(userInput == 2) { 
				System.out.println("you began to shuffle your feet slowly and move your hands all around in front of you to feel for anything in your path.\n"
						+ "As you shuffle forward you bump into something on the ground kicking the small pile and scattering the contents.\n"
						+ "You bend down and aimlessly search for some of the contents that you kicked and you find many small objects that feel like small bones.\n"
						+ "But as you feel around more you grasp onto a cold metal object, as you probe at it blindly you decide it has the shape of an old fashioned key.\n"
						+ "You take the key and crawl your way to the door, and you begin to use the key into the slot and as you twist the key the ground underneath you\n"
						+ "begins to shift and in an instant a trap door opens up and you fall through onto a giant pile of bones and get impaled through the leg by a upturned bone.\n"
						+ "You see a tunnel near the bottom and light shining through it to reveal a new area.\n"
						+ "\nYou have lost 2 health points");
				number = 2;
		} return number;
	} 
	/**
	 * 
	 * @param int: the value from the user to determine what item they want to select
	 * @return int number: this is a value that will determine the out
	 */
	public int ancientLibrary(int userInput) {
		int number = -1;
		if(userInput == 0) {
			
				System.out.println("You maker your way towards the statue but you can't shake the eerie feeling that it is watching you.\n"
						+ "As you get within 2 yards of it the feeling of being watch quickly changes to pure dread, but you force yourself to continue towards it.\n"
						+ "You are now within an arms length of the statue, you slowly move your hands towards the statues fighting all of your natural instincts that are telling you to run\n"
						+ "You grab the book and try to pull it from the statues hand but it is stuck, so you change your footing and prepare to give it a hard tug when\n"
						+ "suddenly the arm of the statue pulls towards you like a lever and you hear what sounds like stone gears hitting against eachother inside of the state\n"
						+ "after a brief moment of silence from the statue the eyes of the statue instantly turn to look at you locking eye contact with you seemingly staring into your soul. \n"
						+ "You release your grip of the book out of surprise and fall backwards onto the ground shuffling away from the statue as fast as you can as the statue begins to vibrate and dust\n"
						+ "starts falling off of it. After a brief moment of vibration the statue begins to start to move as if it was alive and the book falls out of its hand as \n"
						+ "it slowly stands and begins to walk towards you and frozen in terror you just sit and watch it take steps closer and closer until its at your feet. the statue leans forward\n"
						+ "and puts itself directly above you and its mouth opens, but to your surprise it emits what sounds like a hearty belch, then closes its mouth, slaps its stomach and begins walking away\n"
						+ "from you towards the door where it then forces it open to reveal an assortment of strange liquids. As you watch in a state of confusion it picks one up of the jars and takes a drinks\n"
						+ "of it and it throws the remaining liquid at a nearby wall. The statue then goes back to its mount and assumes the position it was in and goes completely silent. The liquid that was throw\n"
						+ "begins to bubble at crackle on the wall as it drips down it and slowly cracks begin forming and you can see glimpses of light. You go over to the wall and use one of the nearby\n"
						+ "torches to hit the wall breaking a hole wide enough to move through to the new area.\n");
				number = 0;
		}else if(userInput == 1) {
				System.out.println("You begin by taking off one of the torches nearest to you and removing the handle. You then take that handle and try to insert it into the keyhole but it is slightly too wide to fit.\n"
						+ "You toss it aside and move to the next torch and remove the handle. You go to use it and it fits into the lock, you begin to turn it and you hear the click of what you think is the \n"
						+ "lock mechanism from inside the door, but to your surprise the ground under you begins to sink down to reveal stairs leading down into a dim corridor. \n"
						+ "You grab one of the remaining torches and begin to travel down the steps, as you step down from the final step your foot hits the ground and you feel \n"
						+ "it sink in and you look back at the entrance of the stairs to see that there is a slab of stone quickly sliding out to cover the way out leaving you with no choice but to move forward \n"
						+ "down the hallway. As you walk you begin to hear a strange noise that is too faint to quite make out. As you move farther you can make out that the sound is the noise of something being chewed.\n"
						+ "Hesitantly you move forward as the noise just gets louder and louder until you see round humanoid creature sitting on the floor facing away from you moving in motions that \n"
						+ "seem like it's eating something off the ground. You inch closer and your foot hits into a small pebble causing it to skip across the ground making a faint noise. \n"
						+ "The creature instantly stops what its doing and flips around to face you directly. It's danny devito but he's wearing his penguin costume from 1992 batman returns\n"
						+ "You see that the source of the noises was a small pile of fish on the ground. The danny grins at you and begins quoting his role of frank in the tv series \"it's always sunny in Philadelphia\"\n"
						+ "\"I'm the Trash Man! I come out, I throw trash all over the- all over the ring! And then I start eatin' garbage! And then I pick up the trash can, and I bash the guy on the head.\"\n"
						+ "As he sprints towards you full speed, he penguin dives head first into your stomach then suddenly everything goes black.\n"
						+ "\nYou have died...");
				number = 3;
		}else if(userInput == 2) { 
				System.out.println("You walk over to the crate and begin to try to open it. With no luck using your hands you then try breaking it open by kicking it.\n"
						+ "After kicking it a few times a piece of the create breaks off revealing a neatly stacked pile of collector funko-pops in mint condition. \n"
						+ "In a frenzy of excitement you break apart enough of the box to remove the lid. You reach in to remove a metallic mikey mouse for inspection,\n"
						+ "but as you pull it out it tugs out a string that was attached to something deeper in the crate. Confused you move the funko pops \n"
						+ "around to see what the string and to your horror you find a lit bundle of tnt. There was a booby trap that was placed to go off when you pulled the string, you try to run away \n"
						+ "in hopes of survival but as you get about three steps away the explosion sends thousands of chunks of plastic hurdling towards you tearing through your body leaving your body\n "
						+ "mangled but your still alive.\n "
						+ "\nYou lose 5 health points but continue on");
				number = 4;
		} return number;
	}	
	/**
	 * 
	 * @param userInput int: the value from the user to determine what item they want to select
	 * @return int number: this is a value that will determine the out
	 */
	public int forgottenTomb(int userInput) {
		int number = -1;
		if(userInput == 0) {
				System.out.println("You walk towards the corpse and reach down to grab the sword but the corpses hand is firmly gripping the sword. \n"
						+ "You begin tugging on the sword when suddenly the arm brakes off of the corpse, you then try to pry the fingers of the still gripping arm off the sword.\n"
						+ "Suddenly you hear what sounds like a whoosh of air come out of the corpses mouth that was holding the sword. The corpse suddenly rolls out of its perch on the wall onto the ground.\n"
						+ "You backpedal away from it but are soon stopped by an outreached hand of a different corpse holding you in place, soon all of the armor clad corpses\n"
						+ "are on the ground slowly getting to their feet and they begin drawing there swords and charging towards you and in quick motions they swing their weapons towards you \n"
						+ "and you try to deflect it with the sword you are carrying but its too late and you're slashed by multiple blades and everything fades to black.\n"
						+"\nyou have lost your life, restart the program to play again\n");
				number = 3;
		}else if(userInput == 1) {
				System.out.println("You walk over to the body with the staff and you pull it off the body. As soon as your skin touches the metal you feel a strange surge of power flow through you.\n"
						+ "You then point the staff towards the door and release the energy into the staff and a glowing orb shoots towards the door and as it comes into contact with\n"
						+ "it the door disintegrates into a pile of ash. The corpses of the warriors around you begin to roll out of their tombs onto the ground and getting up drawing their weapons.\n"
						+ "You begin firing orbs at them but instead of disentigrating the orbs have strange effects. One of the orbs transforms the undead warrior into a large crab, another\n"
						+ "one is transformed into a chicken. You continue firing orbs as you run across the room towards the door changing more of the warriors as you go. \n"
						+ "You make it through the door and fire one last orb at the group of undead that was forming and it causes a firey tornado to tear throgh them burning them as it goes\n"
						+ "You run throgh the corridor with the staff you walk into the convenetly placed elevator at the end and make your leave from this wretched place.\n");
				number = 5;
		}else if(userInput == 2) {
				System.out.println("Walk over to the sphere and pick it up off the ground but as you pick it up you cut your palm on the pointed tip and you blood drips down the point and \n"
						+ "begins to eerily flow around the sphere into the engraved patterns until all the gaps are filled. The sphere rapidly begins to heat up and glow brighter and brighter\n"
						+ "until the whole room is filled with blinding light. All of the corpses seemigly writhing in pain as they are burned by the light of the sphere.\n"
						+ "Once the light seemigly couldn't get any brighter all the sudden it dissapated getting absorbed back into the ball. Then suddenly in a glory blaze \n"
						+ "the ball exploded instantly vaporising everything within a mile radius including you\n"
						+ "\nYou are now dead");
				number = 4;
		
		} return number;
	}
	public void roomChecker(String output){
		String user = output ;
		/*switch(output) {
		case "Musty Cavern":*/
		if(output == "Musty Cavern") {
			System.out.println ("You find yourself inside of a very dark cavern that has a strange odor, you hear the sounds of water dripping from the hanging \n"
					+ "stalactites and the occasional sound of wings flapping.\nThe only source of light is coming from the key hole of a stone door at the far side of\n"
					+ "the cavern away from you. It is too dark to see anything other then the outlines of the rocks closest to the door so you have a few options to\n"
					+ "move forward. In your bag you have a flashlight and a lighter, but you also have the option of searching blindly with only the touch of your\n"
					+ "hands to guide you, what to do you choose?\n"
					+ "	\nEnter 0 for the flashlight, 1 for the lighter, or 2 for the option of moving blindly with just your sense of touch to guide you\n");
		}/*case ( "Ancient Library"):*/
		else if(output == "Ancient Library") {
			System.out.println("You enter into a large stone room that is lit by a four torches symmetrically placed around the room.\n"
					+ "The room is lined with cobbweb-riddled, stone bookshelves. The shelves are filled with papyrus scrolls that are rotten from deteriorating of passing time.\n"
					+ "The only thing in the room that stands out is a strange statue of the aztec god of knowledge Quetzalcoatl, there is a book in the statues hand and\n"
					+ "strangly it is in english. For some reason you feel as if the statue is following your every movement with its eyes. You look at the far side of the\n"
					+ "room and you observe an oddly small door with a peculiarly shaped key hole next to the handle. You do a second glance around the room and you realize\n"
					+ "that some of the tourches have metalic grips that are somewhat similar to the keyhole in the door. You also notice that there is a small crate off to\n"
					+ "the side of the statue. You options for escape are to try to read the book in the statues hand and see if it reviels any useful knowledge to aid you.\n"
					+ "Testing the torch handles as keys to the door. Or lastly you can investigate the crate. \n"
					+ "\nEnter 0 to investigate the book, 1 to test the torches, or 2 to try your luck with the crate.\n");
		}/*case "Forgotten Tomb":*/
		else if(output == "Forgotten Tomb") {
			System.out.println("You look around you and see a nordic burial site with cut out slots on the walls for corpses of the fallen warriors. There is lare metal door at the end of the room\n"
					+ "You glance around the room more closely to see a nordic sword on one of withered corpses. There is also a strange metal pole on one of the corpses that has \n"
					+ "faces that wrap around the top of it. The head of the staff resembles three of daedric lord Sheogorath's faces in the differing moods, you feel a strange energy emanating from it.\n"
					+ "There is also a small golden ball with an intricate decorative pattern etched into it, and also a spiked tip on the top of it. \n"
					+ "\nYou have 3 choices, enter 0 to investigate the nordic sword, 1 for the strange staff, or 2 for the golden ball\n");
		}
	}
	
}
	

