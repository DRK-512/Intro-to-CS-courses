//Homework assignment 1
//Darek Konopka CS-101
//This code basically converts celcius to farhenhiet 

import java.util.Scanner;//I imported this library so I could use the input function

public class TemperatureConversionr{
   public static void main( String [] args ) {
   
      //***** 1. declare any constants here
      int input; 
      int Tc; 
      int Tf; 
      
      //***** 2.  declare temperature in Fahrenheit as an int 
	   Scanner Temp = new Scanner(System.in); //Input for Temp
      System.out.print("Type the temperature you would like in celcius: " );
      
	   Tf = Temp.nextInt(); 
      //***** 3. calculate equivalent Celsius temperature	 
	  	Tc = (5/9)*(Tf-32); 
      	
      //***** 4. output the temperature in Celsius
      System.out.println(Tf + " In celsius would be " + Tc);
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		
				
      //***** 6. output Fahrenheit temperature to check correctness 
		 

				
   }
}