//Darek Konopka; Homework 1 Problem 2
//Here we take change and we spit out how much change that personw will get

import java.util.Scanner;//I imported this library so I could use the input function

public class ChangeMaker1 { 
   public static void main( String [] args ) { 
   
      //1. Define Varibles
      double Money; 
      int Dollar = 0; 
      int Quarter = 0; 
      int Dime = 0; 
      int Nickel = 0; 
      int Penny = 0; 
      
      //2. Get input of money we want the change of 
      Scanner input = new Scanner(System.in); //Here I define Temp as an input
      System.out.print("Type your change: " );//Prompts user to type temp. 
   	Money = input.nextDouble();
      
      double Change = Money; //This will act as a dummy varible so I can subtract from it without affecting my input
      
      //3. Find # Dollars, Quarters, Dimes, and Pennies
      while (Change > 0) {
      
         if (Change >= 1) { //After we are done with this if statement inside of the while loop, we will have an amount in change EX: 12.67 would be 0.67 after this if statement
         
            Dollar = Dollar+1; 
            Change = Change-1; 
            
         } else if (Change >= 0.25) {
         
            Quarter = Quarter + 1; 
            Change = Change - 0.25;
             
         } else if (Change >= 0.1) {
         
            Dime = Dime+1; 
            Change = Change-0.1; 
            
         } else if (Change >= 0.05) {
         
            Nickel = Nickel+1; 
            Change = Change-0.05; 
            
         }else if (Change >= 0.01) {
         
            Penny = Penny+1; 
            Change = Change-0.01; 
            
         }else {
         break; 
         
         }
      }
      
     System.out.println("An amount of " + Money + " dollars consists of " + Dollar + " dollars, " + Quarter + " quarters, " + Dime + " dimes, " + Nickel + " nickels, and " + Penny  + " pennys."); 
   }
}