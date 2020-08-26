//Homework assignment 1
//Darek Konopka CS-101
//This code converts celcius to farhenhiet 

import java.util.Scanner;//I imported this library so I could use the input function

public class TemperatureConversion{
   public static void main( String [] args ) {
   
      //***** 1. declare any constants here
      int input; 
      
      //***** 2.  declare temperature in Fahrenheit as an int 
      
	   Scanner Temp = new Scanner(System.in); //Here I define Temp as an input
      System.out.print("Type the temperature you would like in celcius: " );//Prompts user to type temp. 
	   int Tf = Temp.nextInt();//Makes our input an int
      
      //***** 3. calculate equivalent Celsius temperature	 
      double TF = Tf; 
	  	int Tc = (int) (((TF-32)*5)/9);//This may appear to be a strange way to do it, but java would not let me multiply 5/9 by Tf-32 so I had to split them up
      double TC = (((TF-32)*5)/9);
      
      //***** 5. convert Celsius temperature back to Fahrenheit
      
      double CheckVariable = (((9*TC)/5)+32);  //Should = Tf
      
      //***** 6. output Fahrenheit temperature to check correctness 
      if (CheckVariable==Tf){ // This if statement verifies the input temp is the same as the Tf after conversion  
        
         //***** 4. output the temperature in Celsius
         System.out.println(Tf + " In celsius would be " + Tc);//Here I output the results as integers
         
      } else { //Error Check
    
         System.out.println("There was an error"); 
         
      }		
   }
}

/*
DISCUSSION QUESTIONS
(1) How did you change the expression 5/9 so that the value was not 0?
I split them up to be seperate operations 

(2) What constant(s) did you define?
input = input from the user
Tc = Temperature in Celcius 
Tf = Temperature in Farenhiet
TF = Tf as float
TC = Tc as a float
CheckVariable = Used as a dummy varible to check that Tc and Tf are backwards compatible 

(3) What data type did you use for the Celsius temperature? Why?
I used a double so the results would be more accurate,
and when I had it as an integer, there were rounding errors

*/