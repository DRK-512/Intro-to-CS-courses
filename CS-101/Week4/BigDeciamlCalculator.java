//Darek Konopka; CS-101
//This program is used as a calculator using the big decimal class

import java.util.Scanner;  
import java.util.Locale;
import java.math.BigDecimal; 

public class BigDeciamlCalculator {
   public static void main ( String [] args ) { 
   
   //Input my two numbers
   String Num1; 
	Scanner num1 = new Scanner(System.in);
 	System.out.println("Enter the first operand: "); 
 	Num1 = num1.nextLine(); 
   
   String Num2; 
	Scanner num2 = new Scanner(System.in);
 	System.out.println("Enter the second operand: "); 
 	Num2 = num2.nextLine();   
   
   System.out.println("Operations are:"); 
   System.out.println("     ADD or + for addition\n     SUBTRACT or - for subtraction\n     MULTIPLY or * for multiplication\n     (each letter can also be lowercase)");
 	
   //Input the operator
   String Operator; 
	Scanner operator = new Scanner(System.in);
   System.out.println("Enter your selection: "); 
   Operator = operator.nextLine();
   
   //if a person types SUBTRACT or subtract, after this they will be the same
   Operator = Operator.toLowerCase(); 
   
   //Here we turn the numbers into big decimal format
   BigDecimal NUM1 = new BigDecimal(Num1); 
   BigDecimal NUM2 = new BigDecimal(Num2);
   
   String add1 = "+";
   String add2 = "add";
   
   String sub1 = "-";
   String sub2 = "subtract";
   
   String mult1 = "*";
   String mult2 = "multiply";
    
   if ((Operator.equals(add1)==true) || (Operator.equals(add2)==true)){
      System.out.println("The sum is: " + NUM1.add(NUM2)); 
   }
   
   else if ((Operator.equals(sub1)==true) || (Operator.equals(sub2)==true)){
      System.out.println("The difference is: " + NUM1.subtract(NUM2)); 
   }
   else if ((Operator.equals(mult1)==true) || (Operator.equals(mult2)==true)){
      System.out.println("The product is: " + NUM1.multiply(NUM2)); 
   } 
   else {
      System.out.println("Please type in 2 numbers, then say +, -, *, add, subtract, multiply"); 
   }
   
   }
}
   