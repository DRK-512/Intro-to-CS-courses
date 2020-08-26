//Darek Konopka; CS-101; Programming Project2
//Here we created a series of number guesssing game that repeats until the user says they do not want to play anymore 

/* 
Data Table

Inside of guessGame class: 

Scanner scan = input from the user
String BothNumbers = this is the lower and upper bounds that will be split with a parse
Scanner parse = this is what is used to split BothNumbers into the upper and lower bounds 
int LowerBound = the minimum the random number can be 
int UpperBound = the maximum the random number can be 
int RandomNumber = this is a random number generated in between the upper and lower bounds
int GuessNumber = this is the users guess for the random number
int GuessCounter = this is the amount of times the user guessed the random number
int NumAway = this is the amount of numbers away the guess was from the random number

int RangeError = this is 0 if the user has a sucessful attempt, but if the user inputs a number outside the range, this is used to show that is an error, and it ends the code
ans = this is used to return the values we need 
ans[0] = this stats whether or not the user had a sucessful attempt 
ans[1] = this is the number of guesses the user needed to guess the solution 


Inside main loop: 

Scanner scan = input from the user
int SuccessAttempt = the number of successful attempts made by the user
int OopsieCounter = the number shows whether it was a successful attempt or not 
int NumGuess = the number of guesses the user had 
double Avg = the average of all the NumGuess
int LowestNum = lowest number of guesses needed to guess the random integer 
int OldSuccess = the previous number of guesses
int NewSuccess = the new number of guesses  
String GameOn = states whether or not the user wants to play again 
*/

import java.util.*;

public class GuessingGameSeries {

   //Here I am making the game into a class, because it is easier for me calculate the end results and seperate the code a little
      static int[] guessGame(int RangeError) {
        
         //Always start by defining my varibales 
         int LowerBound; 
         int UpperBound; 
         int RandomNumber;
         int GuessNumber;
         int GuessCounter; 
         int NumAway;
         String BothNumbers;   
         
         //What we need to output from this class is 1. rangeError, lowest # gusses, and Avg guesses
         int[] ans = new int[2]; 
         
         //Input the numbers
         Scanner scan = new Scanner( System.in ); 
         System.out.print( "Enter an integer, or -1 if you've finished >Please enter a range on the random number you are going to guess.\n(A valid range must satisfy: upper bound <= 1000, upper bound - lower bound >= 30)\nSeparate the lower and upper bounds by one space, for example, 1 50 > ");
         BothNumbers = scan.nextLine( );
      
         Scanner parse = new Scanner(BothNumbers);
         parse.useDelimiter( " " );
         
         //Define lower and upper bounds
         LowerBound = Integer.parseInt(parse.next());
         UpperBound = Integer.parseInt(parse.next());
         
         //In range check
         while (((UpperBound-LowerBound) < 30) || (UpperBound > 1000)){
         
            //display error message and ask for new input 
            System.out.println("The range you entered is not valid."); 
            System.out.println("A valid range must satisfy: upper bound <= 1000, upper bound - lower bound >= 30"); 
            System.out.print("Please enter a valid range: > ");
      
            //now split the numbers with a parse 
            BothNumbers = scan.nextLine( );
         
            parse = new Scanner(BothNumbers);
            parse.useDelimiter( " " );
            
            LowerBound = Integer.parseInt(parse.next());
            UpperBound = Integer.parseInt(parse.next());
            
         }
         
         System.out.println("Now I am thinking of a number in between " + LowerBound + " and " + UpperBound);
         
         //Now I am going to generate the random number and I will put the user in a while loop until they guess the number
         RandomNumber = (int)(Math.random() * (UpperBound - LowerBound + 1) + LowerBound);
         System.out.print("What is your first guess? > "); 
         GuessNumber = scan.nextInt();
         GuessCounter = 1;  
         
         while (GuessNumber!=RandomNumber) {
         
            //If number is not in range, the entire game is ended
            if ((UpperBound < GuessNumber) || (LowerBound > GuessNumber)) {             
               ans[0] = RangeError+1; 
               ans[1] = GuessCounter;
               
               return ans; 
            }
            
            NumAway = RandomNumber-GuessNumber;
            
            //Here we display some hints for the user
            //if guess is lower than the random number
            if (NumAway>0) {
               if (NumAway<=10) {
                  System.out.println("Too low, but you were close (within 10 numbers)!"); 
               } else {
                  System.out.println("Too low, and you were not even close (more than 10 numbers away)!"); 
               } 
               
            //if its not lower than it must be higher
            } else {
               if (NumAway>=-10) {
                  System.out.println("Too high, but you were close (within 10 numbers)!"); 
               } else {
                  System.out.println("Too high, and you were not even close (more than 10 numbers away)!"); 
               }
            }
            
            //Then they type their next desk 
            System.out.print("What is your next guess? > "); 
            GuessNumber = scan.nextInt();
            GuessCounter++;  
         }
         
         //if successfully made it through the loop we return false
         System.out.println("Congratulations! You got it right in " + GuessCounter + " guesses!");  
         ans[0] = RangeError;
         ans[1] = GuessCounter; 
         return ans; 
      }
      
   public static void main ( String [] Args ){
   
      //defining varibles used in the rest of the code
      int SuccessAttempt = 0;
      int OopsieCounter;  
      int NumGuess; 
      double Avg = 0; 
      int LowestNum = 0; 
      int OldSuccess = 0; 
      int NewSuccess = 0;  
      String GameOn; 
      Scanner scan = new Scanner( System.in );
      
      //Introduction to game 
      System.out.println("Hi, and welcoming to the Number Guessing Game"); 
      
      //As long as the user wants to play the game, I will repeat the loop   
      while (true) {  
         OldSuccess=NewSuccess; 
         
         //Here we call the guessing game class with putting weather or not we have a sucessful attempt
         int[] ans = guessGame(0); 
         OopsieCounter = ans[0];
         NumGuess = ans[1]; 
         
         //If we have a sucessful attempt, then our successAttempt counter goes up 
         if (OopsieCounter==0) {
               SuccessAttempt++;
               NewSuccess++;
               Avg = Avg + NumGuess; 
         } else {
               System.out.println("ERROR: Not a number in range");
         }
         
         //this find the minimum if we had a successful attempt
         if (NewSuccess>OldSuccess) {
            if (SuccessAttempt==1) {
                  LowestNum = NumGuess; 
            }else if (SuccessAttempt>1) {
                  LowestNum = Math.min(LowestNum, NumGuess); 
            }
         }   
         
         //Prompt user to play again
         System.out.print("Do you want to play this game again? > ");
         GameOn = scan.next();
         GameOn = GameOn.toLowerCase();  
         System.out.println(""); 
        
         if ((GameOn.equals("yes")) || (GameOn.equals("y"))) {           
         }  else { break; }  
     }
     
     //This is after our while loop, we find the average of the successful attempts
     if (SuccessAttempt>0) {
         Avg = (double) (Avg/SuccessAttempt); 
     }
     
     //This displays the end results 
     System.out.println("Your overall results:"); 
     System.out.println("The total number of sucessful attempts was: " + SuccessAttempt);
     System.out.println("Average number of guesses = " + Avg); 
     System.out.println("Fewest number of guesses = " + LowestNum);
     System.out.println("Goodbye!"); 
   }
}