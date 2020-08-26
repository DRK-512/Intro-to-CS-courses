//Darek Konopka; CS-101
//Write a program to sort three integers in non-decreasing order using if/else statements

import java.util.Scanner; 

public class NonIncreaseOrder {
   public static void main ( String [] args ) { 
   
   //input the three numbers
   Scanner Input = new Scanner(System.in); 
   System.out.print("Enter your first integer: ");
   int Num1 = Input.nextInt();

   Input = new Scanner(System.in); 
   System.out.print("Enter your second integer: ");
   int Num2 = Input.nextInt(); 

   Input = new Scanner(System.in); 
   System.out.print("Enter your third integer: ");
   int Num3 = Input.nextInt();

   //Before I start the if statements, I need to keep in mind that 3! = 6 so there will be a total of 6 possible combonations
   //those combinations are as follows:
   //123, 132, 231, 321, 312, 213
    
   //if num 1 is the greatest number
   if (Num1>=Num2) {
      if (Num1>=Num3){
         //if order is 123
         if (Num2>=Num3){
            System.out.println("The order of your numbers is: " + Num3 + " " + Num2 + " " + Num1); 
            
         //if order is 132
         } else {
            System.out.println("The order of your numbers is: " + Num2 + " " + Num3 + " " + Num1);
         }
         
      //if 3 is bigger than 1 and 1 is bigger than 3 then the order must be 312
      }else {
         System.out.println("The order of your numbers is: " + Num2 + " " + Num1 + " " + Num3);
         }
      //now we know 2 is grater than 1
      }else {
      
         //this would be 321 since 2>1 and 3>2
         if (Num3>=Num2) {
            System.out.println("The order of your numbers is: " + Num1 + " " + Num2 + " " + Num3);
            
         //now we know 2 must be the greatest number
         //so this will be 231
         } else if (Num3>=Num1) {
            System.out.println("The order of your numbers is: " + Num1 + " " + Num3 + " " + Num2);
            
         //and lastly 213
         } else {
            System.out.println("The order of your numbers is: " + Num3 + " " + Num1 + " " + Num2);
         }
      }
   } 
}
