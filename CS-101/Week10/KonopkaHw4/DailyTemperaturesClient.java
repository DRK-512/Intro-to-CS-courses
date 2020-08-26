// Darek Konopka; CS-101
// This is the client class for the daily temperatures class
// Here we will demonstrate the methods in the daily temperature class

import java.util.*;

public class DailyTemperaturesClient {
   public static void main(String[] args)  { 
   
   // First we create an array of 30 doubles 
   double temperatureList[] = new double[]{33.08, 28.76, 31.46, 37.4, 20.12, 
   10.76, 9.32, 7.88, 15.8, 28.4, 15.08, 15.08, 32.0, 43.34, 
   38.66, 14.18, 6.08, 25.52, 30.74, 33.62, 34.52, 37.22, 
   29.66, 21.2, 17.42, 21.2, 31.28, 25.34, 23.36, 23.9}; 
   
   // Then we create that list into an object, and print it using toString()
   DailyTemperatures temperatureObj = new DailyTemperatures(temperatureList); 
   
   System.out.println("These are the 30 daily temperatures: "); 
   System.out.println(temperatureObj.toString());
   
   // Now I will continue to print the returns of the extra methods 
   
   // This one returns values less than 10
   System.out.println("These are the values below 10: ");
   System.out.println(Arrays.toString(temperatureObj.tempBelow(10.0)));
   
   // This displays the greatest change between two parameters
   System.out.println("This is the greatest change between two array elements: ");
   System.out.println(temperatureObj.greatestChange());
   
   // Now we will sort the list
   System.out.println("These are the 30 daily temperatures in decreasing order: ");
   System.out.println(Arrays.toString(temperatureObj.insertionSort()));
   }
}