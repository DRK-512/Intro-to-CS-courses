//Darek Konopka; Homework 1 Problem 2
//Here we take change and we spit out how much change that personw will get

import java.util.Scanner;//I imported this library so I could use the input function

public class ChangeMaker { 
   public static void main( String [] args ) { 
      
      double Change; //This could be a float, I do not know why #1) said to make it a double 
      int Dollar = 0; 
      int Quarter = 0; 
      int Dime = 0; 
      int Nickel = 0; 
      int Penny = 0; 
      
      Scanner input = new Scanner(System.in); //Here I define Temp as an input
      System.out.print("Type your change: " );//Prompts user to type temp. 
   	Change = input.nextDouble();//Makes our input an int
      
      double DummyVarible = Change; 
      System.out.println("You got " + DummyVarible);
      
      while (DummyVarible > 0) {
         if (DummyVarible > 1) {
            Dollar = Dollar+1; 
            DummyVarible = DummyVarible-1; 
         } else if (DummyVarible > 0.25) {
            Quarter = Quarter + 1; 
            DummyVarible = DummyVarible - 0.25; 
         } else if (DummyVarible > 0.1) {
            Dime = Dime+1; 
            DummyVarible = DummyVarible-0.1; 
         } else if (DummyVarible > 0.05) {
            Nickel = Nickel+1; 
            DummyVarible = DummyVarible-0.05; 
         }else if (DummyVarible > 0.01) {
            Penny = Penny+1; 
            DummyVarible = DummyVarible-0.01; 
         }else {
         break; 
         }
      }
      
      System.out.println("You got " + Dollar + " " + Quarter); 
   
   }
}