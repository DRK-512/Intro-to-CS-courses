//This code will prompt the user for numbers until they hit -1
//Then will tell the user how many numbers they put in, the min, and average

import java.util.Scanner;

public class ModifedEchoInput
{
  public static void main( String [] args )
  {
     //Declare variables
     final int SENTINEL = -1;
     int number;
     int OldNumber; 
     int MinNumber = 0;
     int MaxNumber = 0;
     int Counter = 0;  
     int avg = 0; 
     
     //scan for first input
     Scanner scan = new Scanner( System.in );

     // priming read
     System.out.print( "Enter an integer, or -1 if you've finished > " );
     number = scan.nextInt( );
      
     OldNumber = number;
     MinNumber = number; 
     
     while ( number != SENTINEL )
     {  avg = avg+number; 
        OldNumber = number; 
        MaxNumber = Math.max(MaxNumber, number);
        MinNumber = Math.min(MinNumber, number);
        // update read
        System.out.print( "Enter an integer, or -1 if you've finished > " );
        number = scan.nextInt( );
        Counter++;
        
     }
     
     //Print results
     System.out.println("You have entered " + Counter + " integers"); 
     System.out.println("The minimum number is " + MinNumber + " and the maximum is " + MaxNumber);
     
     //calculate the average
     float Avg = (float) avg; 
     float counter = (float) Counter; 
     float AVG = (Avg/counter);
     System.out.println("The average is "  + AVG); 
  }
}
