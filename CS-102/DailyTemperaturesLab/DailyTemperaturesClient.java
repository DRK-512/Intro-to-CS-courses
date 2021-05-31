/* 
 * Name: Darek Konopka
 * Date: 4/14/2021
 * Question number: 3
 * Description: This is the client class for the daily temperatures class
 * Here we will demonstrate the methods in the daily temperature class
 */


import java.util.*;

public class DailyTemperaturesClient {
   public static void main(String[] args)  { 
   
   // First we create an array of 7 doubles 
   double temperatureList[] = new double[] {33.08, 2.18, 102.50, 78.04, 23.45, 112.12, 67.74}; 
   
   // Then we create that list into an object, and print it using toString()
   DailyTemperatures temperatureObj = new DailyTemperatures(temperatureList); 
   
   System.out.println("These are the 7 daily temperatures in fahrenheit: "); 
   System.out.println(temperatureObj.toString());
   
   // Now I will continue to print the returns of the extra methods 
   
   // This one returns values less than 32 which is considered freezing in fahrenheit
   System.out.println("These are the temperatures below freezing: ");
   System.out.println(Arrays.toString(temperatureObj.tempBelow(32.0)));
   
   // This one returns values above 100 fahrenheit
   System.out.println("These are the temperatures above 100*F: ");
   System.out.println(Arrays.toString(temperatureObj.tempAbove(100.0)));
   
   // This displays the greatest change between two parameters
   System.out.println("This is the greatest change between two consecutive days: ");
   System.out.println(temperatureObj.greatestChange());
   
   // Now we will sort the list in decreasing order
   System.out.println("These are the 7 daily temperatures in decreasing order: ");
   System.out.println(Arrays.toString(temperatureObj.insertionSort()));
   }
}