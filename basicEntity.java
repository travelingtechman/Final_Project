package finalProject;
/**
 * This interface lays out the simple format for any entity that will be involved in the battles
 * 
 *
 */
interface basicEntity {
	public void setHealth(int health);
	public void setDmgOutput(int Dmg);
	public void setName(String Name);
	public int getHealth();
	public int getDmgOutput();
	public String getName();
}
