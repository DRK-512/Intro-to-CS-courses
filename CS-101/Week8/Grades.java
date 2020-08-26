// Darek Konopka; CS-101; 5/27 acrtivity
// Here we make a grade class 

import java.util.*;

public class Grades{ 
   
   // Instance variables fields 
   public String courseCode;        
   public int [] examGrades;    // This is an array list so we can do the .clear command in the constructor 
   
   // Default constructor 
   // Sets default values 
   public Grades( int [] grades ) {
       courseCode = "";
       
       // instantiate instance variable array
       // with same length as parameter
       examGrades = new int [grades.length];
       
       // copy parameter array to cellBills array
       for ( int i = 0; i < examGrades.length; i++) {
       examGrades [i] = grades[i];  
       }
   }
   //******************************* Accessor Methods ********************************//
   
   // These return the fields to the client code 
   public String getCourseCode() {
      return courseCode; 
   }
   
   public int[] getExamGrades() {
      // instantiate temporary array
      int [] temp = new int [examGrades.length]; 
      
      // copy instance variable values to temp
      for ( int i = 0; i < examGrades.length; i++ ) {
         temp[i] = examGrades[i];
      }
      
      // return copy of array
      return temp;
   }
   
   //******************************* Mutator Methods ********************************//
   
    // Mutator Method:
    // allows client to set model
    public Grades setCourseCode( String newCourseCode )    {
        this.courseCode = newCourseCode;
        return this;
    }
    
    // Mutator Method:
    // allows client to set model
    public Grades setExamGrades( int [] newExamGrades )   {
       // instantiate instance variable array
       // with same length as parameter
       examGrades = new int [newExamGrades.length];
       
       // copy parameter array to cellBills array
       for ( int i = 0; i < examGrades.length; i++) {
         examGrades [i] = newExamGrades[i]; 
       }
        this.examGrades = newExamGrades;
        return this;
    } 
      
     // toString: returns a String of instance variable values
    @Override
    public String toString( )    {
       return "Course: " + courseCode
             + "\nGrades: " + Arrays.toString(examGrades);      
    }
    
   // An overriding equals(Object objectReference) method 
   @Override
   public boolean equals( Object o ) {
      boolean isEqual = true;
      
      // if o is not a GradeClass object, return false
      if ( ! ( o instanceof Grades ) ) {
      
         return false;
         
      } else {
         
         // type cast o to a GradeClass object
         Grades objGrade = ( Grades ) o;
         
         int length1 = examGrades.length; 
         int length2 = objGrade.examGrades.length; 
         
         if ( examGrades == objGrade.examGrades ) { 
            if ( length1 == length2) { 
            
               for ( int i = 0; i < length1 && isEqual; i++ ) {
                  if ( Math.abs( examGrades[i] - objGrade.examGrades[i] ) > 0.001 ) {
                     isEqual = false; // elements are not equal
               }
            }
            
               } else {
               isEqual = false; 
               }
            } else {
               isEqual = false;
            }

         } return isEqual; 
      }
         
   public int[] gradesAboveNinety() {
      int counter = 0; 
      
      // First we find how many numbers are above 90 in the list, so we knnow the size of the new list 
      for ( int i = 0; i < examGrades.length; i++ ) {
         if (examGrades[i] >= 90) {
            counter++;    
         }
      }
      
      // Then we create the new list, size of #90 values, and we reset the counter 
      int [] nintyGrades = new int [counter];
      counter = 0; 
      
      for ( int i = 0; i < examGrades.length; i++ ) {
          
         if (examGrades[i] >= 90) {
            
            // We then add the number above 90 to the list, and the counter goes up 
            nintyGrades[counter] = examGrades[i];
            counter++; 
             
         }
         
      } return nintyGrades; 
   }  
}

