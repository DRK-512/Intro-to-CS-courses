/*
   *Name: Darek Konopka
   *Date: 04/21/2021
   *Question: Number 2
   *Description: This program runs a recussive and iterative powers function, and if the input is invalid, returns -1
*/

import java.util.*; 
public class Recursive {

   public static void main (String [] args) {
   
      Scanner scan = new Scanner(System.in);
      int inputNumber; 
      
      //1.Develop an iterative implementation of “sumOfPowers”.
      //2.Write a complete recursive definition to compute P(n) recursively.
      //3.Develop a recursive implementation of “sumOfPowers”, using your definition for (2).
      System.out.print("Type a number to run through recusion and iteration: "); 
      inputNumber = scan.nextInt(); 
      int sumI;
      int sumR;  
      
      // Test iterative method
      sumI = sumOfPowersIter(inputNumber); 
      System.out.println("The sum from the iterative solver is: " + sumI); 
      
      // Test Recursive method
      sumR = sumOfPowersRec(inputNumber); 
      if(sumR<-1) { sumR = Math.abs(sumR); }
      System.out.println("The sum from the recursive solver is: " + sumR); 
          
      
   }
   
   // iterative implementation of sumOfPowers
   public static int sumOfPowersIter(int n){
      
      if( n <= 0 ) { return -1; }
      else {
         // Here n is > 0.
         int temp = 1;
         // Loop to perform multiplications as needed.
         for( int i = 0; i < n; i++ ) {
             
            temp = temp * 2;
         }
         // Return result.
         
         return temp;
      }
   }

   // recursive implementation of sumOfPowers
   public static int sumOfPowersRec(int n){
      if( n <= 0 ) { return -1; } // Base case.

      else {
         // Here b > 1.
         
         return 2 * sumOfPowersRec(n-1); // Recursive call.
      }
   }
}