//Darek Konopka; CS-101; practice midterm 
//Repeatedly prompt the user for an integer until the user enters "-99". You may assume that the input can always be read as an int.
//Find and output the average of all the integers entered by the user, NOT including "-99".

import java.io.*;
import java.util.*;

public class AvgOfInputs
{
  public static void main( String [] args )
  {
  
     //Declare variables
     final int FinalNum = -99;
     int number;
     int Counter = 0;  
     int avg = 0; 
     
     //scan for first input
     Scanner scan = new Scanner( System.in );

     // priming read
     System.out.print( "Enter an integer, or -99 if you've finished > " );
     number = scan.nextInt( );
 
     while ( number != FinalNum )
     {  avg = avg+number; 
     
       // update read
        System.out.print( "Enter an integer, or -99 if you've finished > " );
        number = scan.nextInt( );
        Counter++;
        
     }
     
     if (Counter==0) {
     System.out.println("There were no integers entered"); 
     
     } else {
        //Print results
        System.out.println("You have entered " + Counter + " integers"); 
        
        //calculate the average
        float Avg = (float) avg; 
        float counter = (float) Counter; 
        float AVG = (Avg/counter);
        System.out.println("The average is "  + AVG); 
     }
  }
}
