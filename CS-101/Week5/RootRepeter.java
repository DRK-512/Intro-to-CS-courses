//Darek Konopka; CS-101
//keeps taking the square root of the input until it is lower than 1.01

import java.io.*;
import java.util.*;

public class RootRepeter {
  public static void main( String [] args ) {
      //declare initial variable 
      int counter = 0; 
      Scanner scan = new Scanner(System.in);
   
      //Scan for double
      System.out.print("Enter a number greater than 10: ");
      double num = scan.nextDouble( );
      
      //keep taking the square root and make counter go up
      while (num>=1.01) {
         counter++; 
         num = Math.sqrt(num); 
      }
      
      //print results 
      System.out.println("The square root operation was preformed " + counter + " times.");
      
         }      
}