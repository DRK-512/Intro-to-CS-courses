// Darek Konopka; CS-101
// This client take a rnadom numbers for a 2D array to display ratings of multiple hotels over the years 

import java.util.*;

public class HotelRatingsClient { 
   public static void main(String[] args)  {
   
      // Initialization of objects  
      int hotelRatingsArray1[][] = new int[5][]; // This is the 2D list that will contain the values of our hotel 
      int hotelRatingsArray2[][] = new int[5][];
      HotelRatings hotelObj1 = new HotelRatings(hotelRatingsArray1); // This is the object containing the 2D array 
      HotelRatings hotelObj2 = new HotelRatings(hotelRatingsArray2);
      
      // Other needed initializations 
      Random rand = new Random(); // This is a random object, which will be used for creating random integers (ratings for the hotels) 
      int i, j; // Initializing before the for loop 
      
      
      // Now I will place random numbers in the ratings for the first object 
      for (i = 0; i<hotelObj1.getRatings().length; i++) {
         
         // Since each hotel has a different number of ratings, we must make different sizes of each row 
         
         // rows 0 and 3 both need 6 collumns
         if ((i==0) || (i==3)) {
            hotelRatingsArray1[i] = new int[6];
            for (j = 0; j < 6; j++) {
               hotelObj1.setRatings(rand.nextInt(6), i, j);
            }
         
         // rows 1 and 2 both need 5 collumns   
         } else if ((i==1)||(i==2)) {
            hotelRatingsArray1[i] = new int[5];
            for (j = 0; j < 5; j++) {
               hotelObj1.setRatings(rand.nextInt(6), i, j);
            }
         
         // and the rest need 4 collumns   
         } else {
            hotelRatingsArray1[i] = new int[4];
            for (j = 0; j < 4; j++) {
               hotelObj1.setRatings(rand.nextInt(6), i, j);
            }
         } 
      }
      
      
      // Now I will repeat the process for the second object 
      for (i = 0; i<hotelObj2.getRatings().length; i++) {
         
         // Since each hotel has a different number of ratings, we must make different sizes of each row 
         
         // rows 0 and 3 both need 6 collumns
         if ((i==0) || (i==3)) {
            hotelRatingsArray2[i] = new int[6];
            for (j = 0; j < 6; j++) {
               hotelObj2.setRatings(rand.nextInt(6), i, j);
            }
         
         // rows 1 and 2 both need 5 collumns   
         } else if ((i==1)||(i==2)) {
            hotelRatingsArray2[i] = new int[5];
            for (j = 0; j < 5; j++) {
               hotelObj2.setRatings(rand.nextInt(6), i, j);
            }
         
         // and the rest need 4 collumns   
         } else {
            hotelRatingsArray2[i] = new int[4];
            for (j = 0; j < 4; j++) {
               hotelObj2.setRatings(rand.nextInt(6), i, j);
            }
         } 
      }

      
      // Now we print the results 
      System.out.println("These are the first hotel ratings: "); 
      System.out.println(hotelObj1.toString() + "\n");
      
      System.out.println("These are the second hotel ratings: "); 
      System.out.println(hotelObj2.toString() + "\n");
      
      // Then we find out if they are equal, and we take the average 
      System.out.println("It is " + hotelObj1.equals(hotelObj2) + " that the two objects are equal"); 
      System.out.println("The average of all the values of the first object is: " + hotelObj1.avg());
      System.out.println("The average of all the values of the second object is: " + hotelObj2.avg()); 
      
      // Now I will see which hotels have had 5 star ratings 
      System.out.println(Arrays.toString(hotelObj1.fiveStarHotels()) + " are the hotels from the first object that have had at least 1, 5 Star rating");
      System.out.println(Arrays.toString(hotelObj2.fiveStarHotels()) + " are the hotels from the second object that have had at least 1, 5 Star rating");  
   }
}