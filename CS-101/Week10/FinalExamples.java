import java.io.*;
import java.util.*;

public class FinalExamples {
   public static void main(String[] args)  { 
   
   int numbers[] = new int[9]; 
   numbers[0] = 11; 
   numbers[1] = 53; 
   numbers[2] = 2; 
   numbers[3] = 21; 
   numbers[4] = 15; 
   numbers[5] = 8; 
   numbers[6] = 45; 
   numbers[7] = 2; 
   numbers[8] = 32; 
  int temp; 
   
   for ( int i = 3; i < numbers.length - 1; i++ )  {
      int m = 3;
      
      for ( int j = 4; j < numbers.length - i + 3; j++ )    {
         if ( numbers[j] < numbers[m] ){
            m = j; 
            }
      }
      
      temp = numbers[m];
      numbers[m] = numbers[numbers.length - i + 2];
      numbers[numbers.length - i + 2] = temp;
      
      for (int k=0; k < numbers.length; k++) {
         System.out.println(numbers[k]); 
      }System.out.println(" ");
   }

   
   }
}