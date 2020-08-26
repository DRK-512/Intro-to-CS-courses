import java.io.*;
import java.util.*;

public class SimpleCalulations {
   public static void main (String [] args) {

   //I am defining these to comapre it to what the user typed in for the opperator 
   String add1 = "+";
   String add2 = "add";
   
   String sub1 = "-";
   String sub2 = "subtract";
   
   //Other variables 
   int PlusNumber=0; 
   int MinusNumber=0; 
   int Answer=0; 
   
   //1) Prompt the user to enter the type of calculation he or she would like to practice, which can be either addition or subtraction.
   System.out.println("Operations are:"); 
   System.out.println("     ADD or + for addition\n     SUBTRACT or - for subtraction\n     (each letter can also be lowercase)");
 	
   //Input the operator
	Scanner operator = new Scanner(System.in);
   System.out.print("Enter your selection: "); 
   String Operator = operator.nextLine();
   Operator = Operator.toLowerCase(); 
   
   //2) Generate two random integers, both between 10 and 1000 (inclusive), and assign them to two int variables number1 and numbers.
   int number1 = (int) (Math.random() * (1000 - 10 + 1) + 10);
   int number2 = (int) (Math.random() * (1000 - 10 + 1) + 10);
   
   if ((Operator.equals(add1)==true) || (Operator.equals(add2)==true)){
   //3.1) If the user chooses to practice addition, display a question: What is number1 + number2?
      if (number1>=number2) {
         System.out.print("What is " + number1 + " + " + number2 + " : "); 
         PlusNumber = operator.nextInt();
         Answer = number1 + number2; 
      } else {
         System.out.print("What is " + number2 + " + " + number1 + " : "); 
         PlusNumber = operator.nextInt();
         Answer = number1 + number2;
      }
      if (Answer==PlusNumber) {
      System.out.println("Congrats the answer " + PlusNumber + " is correct"); 
      } else {
      System.out.println("Sorry the answer " + PlusNumber + " is not correct\nThe actual answer was " + Answer); 
      }
   }
   
   //3.2) If the user chooses to practice subtraction, compare number1 with number2 first.
   else if ((Operator.equals(sub1)==true) || (Operator.equals(sub2)==true)){
      if (number1>=number2) {
         System.out.print("What is " + number1 + " - " + number2 + " : "); 
         MinusNumber = operator.nextInt();
         Answer = number1 - number2; 
      } else {
         System.out.print("What is " + number2 + " - " + number1 + " : "); 
         MinusNumber = operator.nextInt();
         Answer = number2 - number1; 
   }
      if (Answer==MinusNumber) {
         System.out.println("Congrats the answer " + MinusNumber + " is correct"); 
      } else {
         System.out.println("Sorry the answer " + MinusNumber + " is not correct\nThe actual answer was " + Answer); 
      }
   } else {
      System.out.println("Please type in 2 numbers, then say +, -, add, subtract"); 
      }
   }
}