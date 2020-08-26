//Darek Konopka; CS-101
//Project One: Coffee Ordering

/*This program was made to simulate a coffee ordering companys' order form
essentially you input your name, date, and lb wanted 
then the code will calculate the delivery date, and cost for all
at the end it will output a reciept for the User
*/

import java.io.*;
import java.util.*;
import java.text.*;

public class CoffeeOrder {
   public static void main ( String [] args ) { 
   
   /*
   Varible        DataType    Purpose
   LargeBox       int         this is the amount of bags a large box holes
   MediumBox      int         this is the amount of bags a medium box holes
   SmallBox       int         this is the amount of bags a small box holes
   DeliveryTime   int         the amount of time it takes to delivery the boxes
   Charge         double      this is the amount per bag
   LargeCharge    double      this is the amount a large box costs
   MediumCharge   double      this is the amount a large box costs
   SmallCharge    double      this is the amount a large box costs
   name           scanner     this is the input for the name
   Name           string      this is the input for the name converted into a string
   OrderDate      SimpleDate  this is the day the user ordered the coffee beans
   Date1          scanner     this is the input for the date
   parse          scanner     used to split the date into month, day, year
   month          int         month of order
   day            int         day of order
   year           int         year of order
   ArrivalDay     SimpleDate  This is the day the package arrives
   Input          scanner     used to input pounds ordered
   Pounds         float       this is the amount of pounds of corffee the user ordered
   DeliveryCost   double      the cost of delivery
   Total          double      total cost of everything (Delivery, large, medium, and small bags) 
   */
   
   //Define Varibales
   int LargeBox = 12; 
   int MediumBox = 6; 
   int SmallBox = 3; 
   int DeliveryTime = 3; 
   
   double Charge = 9.49; 
   double LargeCharge = 1.78; 
   double MediumCharge = 1.08; 
   double SmallCharge = 0.68; 
   
   //This prompts User for their name
   String Name; 
	Scanner name = new Scanner(System.in);
 	System.out.println("Enter your name: "); 
 	Name = name.nextLine();  
   
   //This inputs the Date
   String OrderDate; 
	Scanner Date1 = new Scanner(System.in);
 	System.out.println("Enter the Date in format (mm/dd/yyyy): "); 
 	OrderDate = Date1.nextLine();  
   
   //Then we need to split it by day, month, and year so we can use the .nextday() method
   Scanner parse = new Scanner(OrderDate);
   parse.useDelimiter( "/" );
   
   int month = Integer.parseInt(parse.next());
   int day = Integer.parseInt(parse.next());
   int year = Integer.parseInt(parse.next());
   
   SimpleDate ArrivalDay = new SimpleDate(month, day , year); 
   
   //We know deliver is 3 days, so we make the date 3 Days later  
   ArrivalDay.nextDay();
   ArrivalDay.nextDay();
   ArrivalDay.nextDay();
 
   //Now we will calculate cost
   //First we ask how many pounds they want
   Scanner Input = new Scanner(System.in); 
   System.out.print("Type how many pounds you want:\n" );
   double Pounds = Input.nextFloat(); 
   
   //TIP: Sold exlusivly in 1/2lb bags, but x/0.5 has to be an integer
   int CoffeeBags = (int) Math.round(Pounds/0.5); 

   //Now we will find the amount of bags needed
   int LargeBags = CoffeeBags / LargeBox; 
   int Remainder1 = CoffeeBags % LargeBox; 
   
   int MediumBags = Remainder1 / MediumBox; 
   int Remainder2 = Remainder1 % MediumBox;
   
   float Remainder3 = (float) Remainder2 / SmallBox; 
   int SmallBags = (int) Math.ceil(Remainder3); 
   
   //Here we find the total, and the cost of delivery
   double Total = (double) ((Charge * CoffeeBags) + (LargeBags * LargeCharge) + (MediumBags * MediumCharge) + (SmallBags * SmallCharge)); 
   DecimalFormat ToMoney = new DecimalFormat("##.00");
   double DeliveryCost = Charge * CoffeeBags; 
   
   //Now we will print the Customers receipt
   //I refrained from using \n in most lines to make the code more physically appealing for me
   System.out.println("\n---------------------------------------------------------------------------------------\n");
   System.out.println("Customer:             " + Name);
   System.out.println("Date of Order:        " + OrderDate);
   System.out.println("Date of Arrival       " + ArrivalDay);
   System.out.println("");
   System.out.println("Number of Bags Ordered: " + CoffeeBags + " . . . $" + ToMoney.format(DeliveryCost));
   System.out.println("");
   System.out.println("Boxes Used:");
   System.out.println("             " + LargeBags + " Large . . . . $" + (LargeBags * LargeCharge));
   System.out.println("             " + MediumBags + " Medium . . . $" + (MediumBags * MediumCharge));
   System.out.println("             " + SmallBags + " Small . . . . $" + (SmallBags * SmallCharge));
   System.out.println("");
   System.out.println("Total cost of the order: . . . . $" + ToMoney.format(Total));
   System.out.println("");
   System.out.println("Thank you for your JavaLumen Corporation coffee bean purchase!");
   System.out.println("\n---------------------------------------------------------------------------------------");
    
   }
}