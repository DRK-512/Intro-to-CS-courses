import java.io.*;
import java.util.*;

public class ReadTemperatures{
   public static void main (String [] args) {
   try {
   
      //Here we define the file we will be reading
      File myFile = new File( "C:\\Users\\Darek's PC\\Desktop\\Temperature.txt");
      
      //then we split the file 
      Scanner parse = new Scanner(myFile);
      parse.useDelimiter( "_" );

      //now we write to the terminal until we run out of the parse
      while (parse.hasNext()) {
        String data = parse.next();
        System.out.println(data);
      }
      parse.close();
      
      //this is incase we dont have the correct file location in the first step
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
   }
}