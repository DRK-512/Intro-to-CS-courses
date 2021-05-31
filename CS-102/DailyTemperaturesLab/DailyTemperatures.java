/* 
 * Name: Darek Konopka
 * Date: 4/14/2021
 * Question number: 3
 * Description: This is the class for the daily temperatures class
 * Here we create the methods used for the dailyTemperaturesClient 
 */
import java.util.*;

public class DailyTemperatures {

   // fields
   private double[] dailyTemps; 
  
   // Overload constructor 
   public DailyTemperatures (double[] dailyTemps) {
   
      this.dailyTemps = dailyTemps; 
   }
   
   // accessor method
   public double[] getTemperatures() {
      return dailyTemps; 
   }
   
   // mutator method 
   public DailyTemperatures setTemperatures( double[] dailyTemps ) {
   
      this.dailyTemps = dailyTemps; 
      return this; 
   }
   
   // toString override method 
   @Override
   public String toString(){
      return Arrays.toString(dailyTemps); 
   }
   
   // Takes a double parameter and returns an array of temperatures below it
   public double[] tempBelow( double  belowMarker )  {
   
      int counter = 0; 
      
      // First we need to initialize the list 
      for (int i=0; i < dailyTemps.length; i++) {
         if (dailyTemps[i] < belowMarker) {
         
            counter++; 
         }
      }
      
      // Now we can create the list and initialize it as well 
      double[] markerList = new double [counter]; 
      counter = 0; 
      
      // Now we will add the values to the new list then return it
      for (int i=0; i < dailyTemps.length; i++) {
         if (dailyTemps[i] < belowMarker) {
         
            markerList[counter] = dailyTemps[i];
            counter++; 
         }
      }
      
      return markerList; 
   }
   
   // Takes a double parameter and returns an array of temperatures above it
   public double[] tempAbove( double  aboveMarker )  {
   
      int counter = 0; 
      
      // First we need to initialize the list 
      for (int i=0; i < dailyTemps.length; i++) {
         if (dailyTemps[i] > aboveMarker) {
         
            counter++; 
         }
      }
      
      // Now we can create the list and initialize it as well 
      double[] markerList = new double [counter]; 
      counter = 0; 
      
      // Now we will add the values to the new list then return it
      for (int i=0; i < dailyTemps.length; i++) {
         if (dailyTemps[i] > aboveMarker) {
         
            markerList[counter] = dailyTemps[i];
            counter++; 
         }
      }
      
      return markerList; 
   }

   // A method that takes no parameter and returns the largest change in temperature between any two consecutive days
   public double greatestChange()  {
   
      // We start at 0, because if there is no daily temperatures, we can at least print that there is no change
      double change = 0; 
   
      // Here we list out each parameter and then compare it to the one after it, then we change the variable if needed
      for (int i=0; i < dailyTemps.length-1; i++)    {
   
         if (Math.abs(dailyTemps[i]-dailyTemps[i+1]) > change) {
            change = Math.abs(dailyTemps[i]-dailyTemps[i+1]); 
         }
      }
      
   return change;
   } 
   
   // This is an insertion sort of our method, we return it in decreasing order
   public double[] insertionSort() {
   
      // First we initialze the temp (Some value of dailyTemp) and j (a counter)
      int j;                     // the number of items sorted so far
      double key;                // the item to be inserted
      int i; 

      for (j = 1; j < dailyTemps.length; j++) {    // Start with 1 (not 0)
    
         key = dailyTemps[ j ];
         for(i = j - 1; (i >= 0) && (dailyTemps[ i ] < key); i--)  {   // Smaller values are moving up
          
                 dailyTemps[ i+1 ] = dailyTemps[ i ];
          }
          
         dailyTemps[ i+1 ] = key;    // Put the key in its proper location
     }
      
      return dailyTemps; 
   }
}