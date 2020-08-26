//Darek Konopka; CS-101; In Class Activity P1 4/23/2020
//Here we will take a date, and append that date along with the two days after to a txt file

//Import libraries to write to file, and to use delimiter
import java.io.*;
import java.util.*;
import java.util.Scanner; 

public class DayManipulator{
   public static void main (String [] args) {
   
      try {
         //1. Declare string varible of 2/28/2020 & useDelimiter
         String Date1 = "2/28/2020"; 
         Scanner parse = new Scanner(Date1);
         parse.useDelimiter( "/" );

         //2. Make SimpleDate object
         int month = Integer.parseInt(parse.next());
         int day = Integer.parseInt(parse.next());
         int year = Integer.parseInt(parse.next());
   
         SimpleDate someDay = new SimpleDate(month, day , year); 
   
         //3. Make the Days.txt files and write the next three days to it
         FileWriter fw = new FileWriter( "Days.txt", false);
     
         fw.write(someDay.toString()+"\n"); 
         someDay.nextDay(); 
         fw.write(someDay.toString()+"\n");
         someDay.nextDay(); 
         fw.write(someDay.toString());
         
         fw.close(); 
         
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}
