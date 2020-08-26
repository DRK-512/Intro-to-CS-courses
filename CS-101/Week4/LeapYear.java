//Darek Konopka; CS-101
//This code is to determin whether or not it is a leap year or not
import java.util.Scanner; 

public class LeapYear {
   public static void main ( String [] args ) { 
   
   Scanner Input = new Scanner(System.in); 
   System.out.print("Enter the year: ");
   int Year = Input.nextInt();
   
   //Lets see if our three cases are divisible 
   int Case1 = Year%4; 
   int Case2 = Year%100;
   int Case3 = Year%400;
   
   //Here we will test if the input meets the requirements of the following cases
   if (Case1==0) {
      if (Case2!=0) {
         System.out.print("Yes it is a leap year");
      }
      
      else if (Case3==0) {
         System.out.print("Yes it is a leap year");
         }
         
         else {
         System.out.print("No it is not a leap year");
         } 
      }
      
      else {
         System.out.print("No it is not a leap year");
      }
   }
}