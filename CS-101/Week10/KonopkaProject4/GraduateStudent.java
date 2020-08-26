// Darek Konopka; CS-101
// This is a subclass of the person class
// Here we define an graduate student

import java.util.*;
import java.io.*;

// level; char; this is the level the student is 
// tempLevel; String; This takes the char such as d and makes it display doctorate

public class GraduateStudent extends Student {

   // Fields 
   private String tempLevel;
   private char level; // either ‘m’ for master or ‘d’ for doctoral
   
   
   // Constructor 
   // These values are passed from the student class
   public GraduateStudent( String firstName, String lastName, String email, int studentID, double GPA, char level )   {
   
         super( firstName, lastName, email, studentID, GPA);
         this.level = level;
      }
   
   // accessor method:
   public char getLevel() {
      return level; 
   }
   
   // mutator method:
   public void setLevel (char level)   {

      this.level  = level;
   }
   
   // Overriding tostring method
   @Override
   public String toString()   {
   
      // either ‘m’ for master or ‘d’ for doctoral, if not either I will show an error 
      switch(level)   {
         case 'd':
            tempLevel = "Doctorate";
            break;
         case 'm':
            tempLevel = "Master";
            break;
         default:
            tempLevel = "input was not valid";
            break;
      }
      return "\nGraduate Student" + super.toString() + "\n\tLevel: " + tempLevel + "\n";
   }
}