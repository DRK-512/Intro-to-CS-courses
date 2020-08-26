//Darek Konopka; CS-101; Homework3 Question 2
//This takes your input and returns its factorial  

import java.util.*;

public class InputFactorial {
   public static void main ( String [] Args ){

    // Define varibales (Factorial is a long because after 30 then there arent enough bytes to supprot your answer) 
    int number;
    int counter; 
    long factorial = 1L;
   
    // Input the number we want ot convert to factorial 
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a nonnegative integer to calculate its factorial: ");
   
    number = scan.nextInt();
    
    
    // This keeps prompting the user for a (+) integer 
    while (number < 0) {
      System.out.println("");
      System.out.println("Number should be non-negative");
      System.out.print("Enter a nonnegative integer to calculate its factorial: ");
      
      // Good thing we may assume that the user always enters a number that can be read as an int
      number = scan.nextInt();

    }
    System.out.println(""); 
    
    
    // This for loop keeps going until we have mulitpled all number previous to our input  
    for (counter = 1; counter <= number; counter++) {
      factorial = (long) (factorial*counter);  
            
    }
      // Factorial is in the absolute value format becuase once you get past 22 it prints negative results, they are correct but just negative
      System.out.println("Factorial of " + number +" is = " + Math.abs(factorial));
  }
}
