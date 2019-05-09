/*Program: Player*/
/*CIS163AC */
/*Norman Nguyen */
/*4/20/2018 */
/*This is the player file where it contains the name and health points */
public class Player
{
   //Variables
   private int health;
   private String name;
   //Constructor
   //These are the default settings, mostly for the speed.
   public Player(int Hlth, String Nme)
   {
      health = Hlth;
      name = Nme;
   }
   //Getters/Accessors
   public int gethealth()
   {
      return health;
   }
   public String getname()
   {
      return name;
   }
   //Setters/Mutators
   public void sethealth(int newhealth)
   {
      health = newhealth;  
   }
   public void setdamage(int newdamage)
   {
      health = health-newdamage;
   }
   public void setobject(String newname)
   {
      name = newname;
   }
}