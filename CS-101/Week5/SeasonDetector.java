//Darek Konopka; CS-101; practice midterm 

import java.io.*;
import java.util.*;

public class SeasonDetector{
  public static void main( String [] args ){
  try { 
      //Declare varibles 
      int Temp; 
      String Season; 
      Scanner scan = new Scanner( System.in );

     // priming read
      System.out.print( "Enter the temperature: " );
      Temp = scan.nextInt( );
      
/*TABLE
If the temperature is greater than or equal to 90, it is probably summer.
If the temperature is greater than or equal to 70 and less than 90, it is probably spring.
If the temperature is greater than or equal to 50 and less than 70, it is probably fall.
If the temperature is less than 50, it is probably winter.
If the temperature is greater than 110 or less than -5, then you should write to the file with a sentence saying that the temperature entered is outside the valid range.*/

      if (Temp>=90) {
         Season = "summer"; 
      }else if (Temp>=70) {
         Season = "spring";
      }else if (Temp>=50) { 
         Season = "fall";
      } else {
         Season = "winter"; 
      }
      
      //Now we will write to the file
       FileWriter fw = new FileWriter( "Temperature.txt", false);\
       //if the temp is in our range we output the season, if not then the season should be obvious 
      if ( (Temp > 110) || (Temp < -5) ) {
          fw.write("You have entered a value outside of the temperature range\n"); 
          fw.write("Please enter something less than 110 and greater than -5 ");
      } else { 
         fw.write("The temperature is " + Temp + " , so it is probably " + Season + "."); 
      } 
      
      fw.close(); 
  

  }catch(IOException e) {
         e.printStackTrace();
      }
   }
}