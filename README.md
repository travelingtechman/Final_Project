# Final_Project

## This project is made up of a couple different objects that i designed for a simple text based adventure game. You will get descriptions for each room and for the the outcomes of selecting 1 of the three items you have to choose from for each room. There is a simple health system as well as a penitly system which affects your health based on the choices you make in the game. 

## I made this program because i wanted to meet the course requirements in a way that i found fun and interactive. I chose to make it a text based adventure game because of a easter egg in call of duty black ops one that allowed me to play a text based adventure game called "Zork I: The Great Underground Empire".

## The files required to run this program are basicEntity.java, Enemy.java, MainProject.Java, Player.Java, RoomMaker.java, and Rooms.Java. It would be easiest to run them from eclipse just make sure to put them all into the same package. To start the program use the MainProject.java file to start it because that is where my main method is. To run it after you start it just type the word start or any word and it will begin, after it starts it should print out a short discription of the room that you are in and the objects that you will have to pick between to determine the outcome. Each object has a different outcome for the room. After you select an object by typing  a 0,1, or 2 and hitting enter it will tell you the outcome and how much health you have left over. 

## Example code
interface basicEntity {
	public void setHealth(int health);
	public void setDmgOutput(int Dmg);
	public void setName(String Name);
	public int getHealth();
	public int getDmgOutput();
	public String getName();
}
im proud of this code because i didn't quite understand how to use interfaces but i figured it out and was able to make this

##tests
using JUnit4 to test i created IsPlayerDeadTest,Junit,RoomMakerTest,TestAncientLibrary,TestForgottenTomb, TestMustyCavern. I also created a AllTest.java so you can run them all at once simply by putting all the files into a package and running it on eclipse

