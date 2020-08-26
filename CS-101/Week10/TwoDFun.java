// Darek Konopka; CS-101; Sample Final
// Here we play with a 2D array

import java.util.*;
public class TwoDFun {
   public static void main(String[] args)  { 
   
      // Here we define the list 
      double saleTaxRates[][] = new double [5][10]; 
      double temp; 
      double min=7; 
      int minState=0; 
      double avg=0; 
      double bigAvg=0; 
     
      // Then we make the random numbers
      for (int i=0; i<saleTaxRates.length; i++) {
         for (int j=0; j<saleTaxRates[i].length; j++) {
            temp = Math.random() * (6 - 0 + 1) + 0; 
            temp = Math.floor(temp * 100) / 100; 
            saleTaxRates[i][j] = (temp); 
         }
      }
      
      System.out.println("The array is"); 
      for (int i = 0; i < saleTaxRates.length; i++) {

            System.out.println(Arrays.toString(saleTaxRates[i]));

      }
       
      for (int i=0; i<saleTaxRates.length; i++) {
         if (i==0) { 
            min = saleTaxRates[i][9]; 
         } else {
            if (min>=saleTaxRates[i][9]) {
               min = saleTaxRates[i][9]; 
               minState = i; 
            }
         }
      }
      System.out.println("The lowest rate in the 5th collumn is: " + min + " which comes from the " + (minState) + " row");
       
      
      // Now we find the averages
      for (int i=0; i<saleTaxRates.length; i++) {
      
         avg = 0; 
         for (int j=0; j<saleTaxRates[i].length; j++) {
            avg = saleTaxRates[i][j] + avg; 
         }
         
         avg = avg/10; 
         
         if (i==0) {
            avg = bigAvg; 
            minState = i; 
         } else {
            if (avg>bigAvg) {
               bigAvg = avg; 
               minState = i;
            }
         }
      }
      
      System.out.println("The largest average is: " + bigAvg + " which is located in the " + minState + " row"); 
   }
}