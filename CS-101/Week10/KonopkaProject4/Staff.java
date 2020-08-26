// Darek Konopka; CS-101
// This is a subclass of the person class
// Here we define a staff member of the school 

import java.util.*;
import java.io.*;

// title; String; the title of the employee

public class Staff extends Employee {

   // Fields
   private String title; 
   
   
   // Constructor 
   public Staff(String firstName, String lastName, String email, String office, int hiringYear, String title)    {

      super(firstName, lastName, email, office, hiringYear);
      this.title = title;
   }
   
   // accessor methods:
   public String getTitle(){
      return title;
   }
   
   // mutator method:
   public void setTitle (String title){

      this.title  = title;                                                                         
   }
   
   // Overring toString method 
   @Override
   public String toString()   {
   
      return "\nStaff" + super.toString() + "\n\tTitle: " + this.title + "\n";
   }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}