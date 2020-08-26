//Darek Konopka; CS-101
//The purpose of this is to determine the number of days in a month using switch statements.

import java.util.Scanner;  
import java.util.Locale;

public class DayCounterInMonth {
   public static void main ( String [] args ) { 
   
   //Inputs month
   String Month; 
	Scanner month = new Scanner(System.in);
 	System.out.println("Enter a month: "); 
 	Month = month.nextLine(); 

   //First we will see if it is a leap year or not
   Scanner Input = new Scanner(System.in); 
   System.out.print("Enter the year: ");
   int Year = Input.nextInt();
   
   //Lets see if our three cases are divisible 
   int Case1 = Year%4; 
   int Case2 = Year%100;
   int Case3 = Year%400;
   boolean LYear; 
   
   //Here we will test if the input meets the requirements of the following cases
   if (Case1==0) {
      if (Case2!=0) {
         LYear = true;  
         }
      
      else if (Case3==0) {
         LYear = true; 
         
      }else {
         LYear = false;  
      } 
   } else {
     LYear = false;             
   }
               
    
   //Here we determine the days according to which month it is
   //then we print the number of days it has 
   switch (Month) {
   
      case "January":
      
         System.out.println("There are 31 days in " + Month); 
         break; 
         
      case "Febuary":
         if (LYear==true) {
            System.out.println("There are 29 days in " + Month);
         } else {
            System.out.println("There are 28 days in " + Month);
         } 
         break; 

      //And here are the rest of the months 
      case "March":
         System.out.println("There are 31 days in " + Month); 
         break; 
      case "April":
         System.out.println("There are 30 days in " + Month); 
         break; 
      case "May":
         System.out.println("There are 31 days in " + Month); 
         break; 
      case "June":
         System.out.println("There are 30 days in " + Month); 
         break;
      case "July":
         System.out.println("There are 31 days in " + Month); 
         break; 
      case "August":
         System.out.println("There are 31 days in " + Month); 
         break;
      case "September":
         System.out.println("There are 30 days in " + Month); 
         break; 
      case "October":
         System.out.println("There are 31 days in " + Month); 
         break; 
      case "November":
         System.out.println("There are 30 days in " + Month); 
         break;
      case "December":
         System.out.println("There are 31 days in " + Month); 
         break; 
      default: 
         System.out.println("ERROR: The month you entered was not valid"); 

      }
   }
}