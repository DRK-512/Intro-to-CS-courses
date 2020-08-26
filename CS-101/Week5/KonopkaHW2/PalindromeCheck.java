//Darek Konopka; CS-101
//This code checkes if an int is a palindrome

import java.util.Scanner;

public class PalindromeCheck {
  public static void main( String [] args ) {
  
      //Declare variables
      int ReversedInt = 0; 
      int Remainder; 
      int OriginalInt;
         
      Scanner scan = new Scanner(System.in);
   
      //Scan for int
      System.out.print("Enter a five-digit integer: ");
      int num = scan.nextInt( );
        
      //Make num = a variable so we can make the num backwards then compare the two
      OriginalInt = num;
      
      //Reversed integer is stored as a variable 
      while(num != 0)   {
         Remainder = num % 10;
         ReversedInt = ReversedInt * 10 + Remainder;
         num  /= 10;
      }
      
      //Palindrome is true if the forwards = the backwards
      if (OriginalInt == ReversedInt) {
         System.out.println(OriginalInt + " is a palindrome.");
      }else  {
         System.out.println(OriginalInt + " is not a palindrome.");
      }
   }
} 
     
