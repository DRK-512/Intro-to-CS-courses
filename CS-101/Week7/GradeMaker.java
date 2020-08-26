//Darek Konopka; CS-101; 5/21 In Class programming activity 
//Here we write a program to determine the letter grade of a student

import java.util.*;

public class GradeMaker {
   public static void main(String[] args)  {
   
      //Create list of 10 numbers
      double [] gradeList = new double[10];
      ArrayList<Double> eightGradeList = new ArrayList<Double>(8);

      // Now we will ask the user for the 1st 10 grades
      Scanner scan = new Scanner(System.in);
      double input;        // initialized user input 
      double total = 0.0; // initialize total
      int minIndex1 = 0;  // this will be used to find the 2 minimum indexes so we can remove them from the function 
      int minIndex2 = 0;
      double avg = 0; 
      String grade; 
      
      for(int i = 0; i < 10; i++) {
         // Here I ask for the 1st 2nd ... input, the reason why it is if statemnets so I can have the st and ns after the i 
         if (i==0) {  
            System.out.print("Please enter your " + (i+1) + "st grade: ");
         } else if (i==1) {
            System.out.print("Please enter your " + (i+1) + "nd grade: ");
         } else if (i==2) {
            System.out.print("Please enter your " + (i+1) + "rd grade: ");
         } else {
            System.out.print("Please enter your " + (i+1) + "th grade: ");
         }
         
         // Now we put the input into the first list 
         input = scan.nextDouble(); 
         while ((input < 0) || (input > 100)) { 
            System.out.print("I am sorry, but please input a proper grade %: ");
            input = scan.nextDouble();
         }
         gradeList[i] = input;  
      }   

      // This finds the first smallest value
      for ( int i = 1; i < gradeList.length; i++ ) {
         if ( gradeList[i] < gradeList[minIndex1] ) {
               minIndex1 = i;
               }
           }
       
       // This finds the second smallest value   
       for ( int i = 1; i < gradeList.length; i++ ) {
         if (i != minIndex1) {
            if ( gradeList[i] < gradeList[minIndex2] ) {
                  minIndex2 = i;
                  }
               }
           }
           
      // Now we will create the list without the 2 lowest values 
      // The second list will be the same as the first, but then we will remove the two lowest numbers
      for(int i = 0; i < 10; i++) {
      
         // If the i is the first or second minimum, we do not add it to the list 
         if (i != minIndex1 ) {
            if (i != minIndex2) { 
               eightGradeList.add(gradeList[i]); 
            }
         }
      }
      
      // Now we find the average with the new list 
      for (double i: eightGradeList) {
         avg += i;
      }
      avg = (avg/eightGradeList.size()); 
      
      
      System.out.println( "The average of your scores is: " + avg );   
      
      // Now we determine the letter grade
      if (avg >= 90) {
         grade = "A"; 
      } else if (avg >= 80) {
         grade = "B"; 
      } else if (avg >= 70) {
         grade = "C"; 
      } else if (avg >= 60) {
         grade = "D"; 
      } else {
         grade = "F";
      }
      
      System.out.println( "Your letter grade is: " + grade ); 
   }
}