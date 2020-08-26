//Darek Konopka; CS-101, in class activity 4/22
//gets the average of three random integers

//Import random library
import java.util.Random;
import java.text.DecimalFormat;

public class ModifiedRandomAverage {
   public static void main ( String [] args ) { 
   //1. Bring random operator into code
   Random rand = new Random(); 
   
   //2. define the three random integers 
   int rand1 = rand.nextInt(51) + 50;  
   int rand2 = rand.nextInt(51) + 50; 
   int rand3 = rand.nextInt(51) + 50; 
   System.out.println("The three randomly generated numbers are: " + rand1 + ", " + rand2 + ", " + rand3);  
   
   //3. Display Average of the numbers
   //I make these doubles so I can get 3 decimal places for the average
   double rand4 = rand1; 
   double rand5 = rand2; 
   double rand6 = rand3; 
   
   double avg = (rand4 + rand5 + rand6)/3; 
   DecimalFormat avgPattern = new DecimalFormat("0.000"); 
   String Avg = avgPattern.format(avg); 
   System.out.println("The average is " + Avg); 
   
   //4. Find the largest number
   int x = Math.max(rand1, rand2); 
   int Max = Math.max(x, rand1); 
   System.out.println("The largest number is " + Max); 
   
   //5. Find square root of the largest number
   double Sroot = Math.sqrt(Max); 
   System.out.println("The square root of " + Max + " is " + Sroot);
   
   //6. Find ceiling of the square root of the largest number AS AN INT
   int Ceil = (int) Math.ceil(Sroot); 
   System.out.println("The ceiling of " + Sroot + " is " + Ceil);
   System.out.println((int) 2.5 * 3 + (double) (7 / 2) * 2);
   }
}