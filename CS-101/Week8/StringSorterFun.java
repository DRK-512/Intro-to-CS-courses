

import java.util.*;

public class StringSorterFun {
   public static void main(String[] args)  {
   String[] array= new String[5];
   array[0] = "TarTar"; 
   array[1] = "AlphaBird"; 
   array[2] = "Ewy"; 
   array[3] = "Jifs"; 
   array[4] = "Badsgs"; 
   
   for (int i = 0; i <= array.length-1; i++) {
         System.out.println(array[i]); 
      }
// Find the string reference that should go in each cell of
    // the array, from cell 0 to the end
    for ( int j=0; j < array.length-1; j++ )    {
      // Find min: the index of the string reference that should go into cell j.
      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
      int min = j;
      for ( int k=j+1; k < array.length; k++ )
        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

      // Swap the reference at j with the reference at min 
      String temp = array[j];
      array[j] = array[min];
      array[min] = temp;
      }
      for (int i = 0; i <= array.length-1; i++) {
         System.out.println(array[i]); 
      }
   }
}