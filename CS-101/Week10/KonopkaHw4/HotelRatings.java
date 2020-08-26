// Darek Konopka; CS-101
// This class manipulates a 2D array of integers to create an array of hotel ratings 

import java.util.*;

public class HotelRatings {

   // Fields
   private int hotelDimensions[][]; // Dimension 1 represents the hotel and dimension 2 represents the year
   private int hotelDimension; // this is the [i][j] of the list 
   
   // Overload constructor 
  public HotelRatings (int[][] hotelDimensions) {
   
      this.hotelDimensions = hotelDimensions; 
   }
   
   // accessor method
   public int[][] getRatings() {
      return hotelDimensions; 
   }
   
   // mutator method 
   public void setRatings( int hotelDimension, int row, int collumn ) {
      
      this.hotelDimensions[row][collumn] = hotelDimension;   
   }

   // toString override method 
   @Override
   public String toString(){
   
   // The point here is to print 
   String [] myList = new String[hotelDimensions.length]; 
   
      for (int i = 0; i < hotelDimensions.length; i++) {
         if (i==0) {
            myList[i] = Arrays.toString(hotelDimensions[i]);
         } else { 
            myList[i] = "\n" + Arrays.toString(hotelDimensions[i]); 
         }
      }
      return Arrays.toString(myList); 
   }
   
   //An overriding equals(Object objectReference) method 
   public boolean equals( Object o ) {
      // if o is not a HotelRatings object, return false
      if ( ! ( o instanceof HotelRatings ) ) {
         return false;
         
      } else {
         // type cast o to a HotelRatings object
         HotelRatings myHotelRatings = ( HotelRatings ) o;
         if ( hotelDimensions == myHotelRatings.hotelDimensions ) {
            return true;
         } else {
            return false;
         }
      }
   }
   
   // This takes the avergae of the object 
   public int avg() {
      int temp = 0; 
      int counter = 0; 
      for (int i = 0; i < hotelDimensions.length; i++) {
         for (int j = 0; j < hotelDimensions[i].length; j++) {
         temp = temp + hotelDimensions[i][j];
         counter++;  
         }
      }
      
      return temp/counter; 
   }
   
   // This returns the hotels with at least one 5 star rating
   public int[] fiveStarHotels() {
   
      int counter1 = 0; // This is for resetting the j for loop 
      int counter2 = 0; // This is for the dimension of the fiveStarList
      int temp; 
      
      // First we needed to find out how many 5's are in the list then we can initialize it
      for (int i = 0; i < hotelDimensions.length; i++) {
         counter1 = 0; 
         
         for (int j = 0; j < hotelDimensions[i].length; j++) {
            if (hotelDimensions[i][j] == 5) {
               counter1++;  
            }
         }
         if (counter1 >= 1) {
            counter2++; 
         }
     }
     
      // Now we create the list and reset the variables 
      int fiveStarList[] = new int[counter2];
      counter1 = 0; 
      counter2 = 0;
      
      // Here we will add the values to the list 
      for (int i = 0; i < hotelDimensions.length; i++) {
         for (int j = 0; j < hotelDimensions[i].length; j++) {
            
            // This will check if that value is already in the list or not
            if (check(fiveStarList, i) == false) {
               if (hotelDimensions[i][j] == 5) {
               
                  fiveStarList[counter2] = i; 
                  counter2++; 
               }
            }
            
            // Since we start with a list of 0's, then we need to make seperate if statements for the 0's 
            if ((i==0) && (counter2==0)) {
               if (hotelDimensions[i][j] == 5) {
               
                  fiveStarList[counter2] = i; 
                  counter2++; 
               }
            }
         }
      } 
      
      return fiveStarList; 
   }
   
   // This is somehting I added, but basically it checks if an element is already in your array ( I made this for the fiveStarList method because i would repeat) 
   private boolean check(int[] arr, int toCheckValue) {
     
        boolean test = false; 
        for (int element : arr) { 
            if (element == toCheckValue) { 
                test = true; 
                break; 
            } 
        } 
  
        return test;  
    } 
}