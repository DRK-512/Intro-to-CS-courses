//Darek Konopka; CS-101
//This checks if the entered coordinates are inside a rectangle with width = 11 and height = 4

import java.io.*;
import java.util.*;

public class InsideRectCheck {
  public static void main( String [] args ) {
  
      Scanner scan = new Scanner(System.in);
   
      //Scan for int
      System.out.print("Please enter two coordinates separated by a comma: ");
      String Coord = scan.nextLine( );
      
      //now we split input by comma      
      Scanner parse = new Scanner(Coord);
      parse.useDelimiter( "," );
      
      //we make the number a float
      double XVal = Double.parseDouble(parse.next());
      double YVal = Double.parseDouble(parse.next());
      
      //Our y coordiantes are -2 < y < 2 and our x are -5.5 < x < 5.5 since widht is 11 and height is 4
      if ((XVal >= -5.5) && (XVal <= 5.5) && (YVal >= -2) && (YVal <= 2)) {
         System.out.println("The input point (" + XVal + "," + YVal + ") is within the rectangle"); 
      } else {
         System.out.println("The input point (" + XVal + "," + YVal + ") is not within the rectangle"); 
      }
      
   }      
}
      
      