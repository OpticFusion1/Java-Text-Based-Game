/*Program: Final Project*/
/*CIS163AC */
/*Norman Nguyen */
/*4/20/2018 */
/*In this Final Project, I decided to do somewhat similar to a program reading on a 
  text file.  */

import java.util.Scanner;
import java.util.*;
import java.io.*;

//Your class name, meaning the name for your file and code.
public class Game
{
   //Main Function, it's where all the programs
   public static void main(String[] args)
   {
      //Arraylist
      ArrayList<String> inventory = new ArrayList<String>();
      Scanner keyboard = new Scanner(System.in);
      String Obj;
      //Utilizing the player file
      Player player1 = new Player(100, "Player 1");
      System.out.println("Welcome player, you need to find a way to get out of here.");
      System.out.println("");
      //Array list of items
      inventory.add("Key 1");
      inventory.add("Key 2");
      inventory.add("Key 3");
      //Room1
      //Notice how this includes the name, HP and the list of options available. But that doesn't mean it'll
      do
      {
         System.out.println("");
         System.out.println("Name: " + player1.getname());
         System.out.println("Your current HP: " + player1.gethealth());
         System.out.println("");
         System.out.println("Enter Left(L) Right(R) or Forward(F): ");
         System.out.println("Room 1");  
         Obj = keyboard.next();
         //If and Else
         if( ( Obj.equals("L") ) || ( Obj.equals("l"))  )
         {
            System.out.println("You have used a " + inventory.remove(0)+ " to open");
         }
         else if( ( Obj.equals("R") ) || ( Obj.equals("r"))  ) 
         {
            System.out.println("Whoops, you fell into a trap, try again");
            player1.setdamage(10);
         }
         else 
         {
            System.out.println("Game Over, try again");
         } 
      }
      //1st while loop
      while(!Obj.equals("L") &&! Obj.equals("l")&&(player1.gethealth()>0));
      //Room2
      while(!Obj.equals("R") &&! Obj.equals("r")&&(player1.gethealth()>0))
      {
         System.out.println("");
         System.out.println("Name: " + player1.getname());
         System.out.println("Your current HP: " + player1.gethealth());
         System.out.println("");
         System.out.println("Enter Left(L) Right(R) or Forward(F): ");  
         System.out.println("Room 2");       
         Obj = keyboard.next();
         //If and Else
         if( ( Obj.equals("L") ) || ( Obj.equals("l"))  )
         {
            System.out.println("Dead End");
         }
         else if( ( Obj.equals("R") ) || ( Obj.equals("r"))  )
         {
            System.out.println("You have used a " + inventory.remove(0)+ " to open");
         }
         else if( ( Obj.equals("F") ) || ( Obj.equals("f"))  )
         {
            System.out.println("Fell in a pool of sharks.");
            return;
         }
         else
         {
            System.out.println("Try again");
         } 
       }
       //Room 3
       while(!Obj.equals("F") &&! Obj.equals("f")&&(player1.gethealth()>0))
       {
          System.out.println("");
          System.out.println("Name: " + player1.getname());
          System.out.println("Your current HP: " + player1.gethealth());
          System.out.println("");
          System.out.println("Enter Left(L) Right(R) or Forward(F): ");
          System.out.println("Room 3");  
          Obj = keyboard.next();
          //If and Else
          if( ( Obj.equals("L") ) || ( Obj.equals("l"))  )
          {
             System.out.println("Dead End");
          }
          else if( ( Obj.equals("R") ) || ( Obj.equals("r"))  )
          {
             System.out.println("You fell in the furnance, try again.");
             return;
          }
          else if( ( Obj.equals("F") ) || ( Obj.equals("f"))  )
          {
             System.out.println("You have used a " + inventory.remove(0)+ " to open");
          }
          else
          {
             System.out.println("Try again");
          } 
      }
      //Room 4/Last Room
      while(!Obj.equals("123") &&! Obj.equals("321")&&(player1.gethealth()>0))
      {
          System.out.println("");
          System.out.println("Name: " + player1.getname());
          System.out.println("Your current HP: " + player1.gethealth());
          System.out.println("");
          System.out.println("You're in the last room, you used all your keys. However, you need a code to exit out.");
          System.out.println ("Enter Left(L), Right(R) and Forward(F) to get the numbers: ");
          System.out.println("Room 4");  
          Obj = keyboard.next();
          //If and Else, but you need to get the number and input them altogether.
          if( ( Obj.equals("L") ) || ( Obj.equals("l"))  )
          {
             System.out.println("");
             System.out.println("Number is 1");
          }
          else if( ( Obj.equals("R") ) || ( Obj.equals("r"))  )
          {
             System.out.println("");
             System.out.println("Number is 3");
          }
          else if( ( Obj.equals("F") ) || ( Obj.equals("f"))  )
          {
             System.out.println("");
             System.out.println("Number is 3");
          }
          else if( ( Obj.equals("123") ) || ( Obj.equals("321"))  )
          {
             System.out.println("");
             System.out.println("Congratulations!");
             return;
          }
          else
          {
             System.out.println("Try again");
             player1.setdamage(30);
          } 
      }
      //Final while loop
      if(player1.gethealth()>0)
         System.out.print("Congratulations!");
      else
         System.out.print("Game Over");
   }
}