// Darek Konopka; CS-101; 5/27 acrtivity
// Here we make a grade class 

import java.util.*;

public class GradeClassClient { 
   public static void main(String[] args)  {


   // Declare the variables
   int [] myList1 = new int [20]; 
   int [] myList2 = new int [20]; 
      
   // Here I will make the two lists contain a random number from 50-100
   
   for (int i = 0; i<myList1.length; i++) {
   
      // With min = 50 and max = 100 
      myList1[i] = (int) (Math.random() * (100 - 50 + 1) + 50); 
   }
   
   for (int i = 0; i<myList2.length; i++) {
      
      // With min = 50 and max = 100
      myList2[i] = (int) (Math.random() * (100 - 50 + 1) + 50); 
   }
   
   // Here I create two Grades objects using the two arrays, then define everything 
   Grades gradeObj1 = new Grades(myList1); 
   Grades gradeObj2 = new Grades(myList2);

   gradeObj1.setCourseCode("CS-101"); 
   gradeObj2.setCourseCode("MATH-258");
   
   gradeObj1.setExamGrades(myList1);
   gradeObj2.setExamGrades(myList2);
   
   System.out.println(gradeObj1.toString() + "\n" + gradeObj2.toString() + "\n"); 
   
   // Here I compare the course codes and array values of the two objects by calling the equals method made in the GradesClass
   if ( gradeObj1.equals( gradeObj2 ) ) {
        System.out.println( "Grades Object 1 and Grades Object 2 are equal" );
      } else { 
        System.out.println( "Grades Object 1 and Grades Object 2 are not equal" );
      }
    

   // Use any object reference to output all the grades above 90 by calling the gradesAboveNinety method 
   System.out.println(Arrays.toString(gradeObj1.gradesAboveNinety())); 
   
   }
}