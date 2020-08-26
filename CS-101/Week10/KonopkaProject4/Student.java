// Darek Konopka; CS-101
// This is the subclass for the Person class but a super class for the Students (graduate and undergraduate) 
// Here we define some fields that are in both students, so it would not be neccessary to redefine everything in those classes  

import java.util.*;
import java.io.*;

// Data: 
// studentID; int; the student ID
// gpa; double; students gpa
// size; int; amount of objects we are sorting 
// temp; Person; this is a temperarory object used to sort the input

public class Student extends Person {

   // Fields 
   private int studentID; // a number with 9 digits, between 100,000,000 and 999,999,999
   private double gpa; // a number between 0 and 4, inclusive
   
   
   // constructor:
   public Student(String firstName, String lastName, String email, int studentID, double gpa)   {
   
      super(firstName, lastName, email);
      this.studentID = studentID;
      this.gpa = gpa;
      
   }
   
   // accessor methods:
   public int getStudentID(){
   
      return studentID;
   }
   public double getGpa(){
   
      return gpa;
   }
   
   // mutator method:
   public void setStudentID (int studentID)   {

     this.studentID  = studentID;
   }
   public void setGpa (double gpa)   {

     this.gpa  = gpa;
   }
   
   
   // Overriding toString method
   @Override
   public String toString()   {
      
      // Here are the restrictions 
      if ( 100000000 <= studentID && studentID <= 999999999 ) {
         if ( 0 <= gpa && gpa <= 4) {
            return super.toString() + "\n\tStudent ID: " + this.studentID + "\n\tGPA: " + this.gpa;
         } else {
      
         return super.toString() + "\n\tStudent ID: " + this.studentID + "\n\tGPA: The GPA was out of range";
      }

      } else {
      
         return super.toString() + "\n\tStudent ID: The ID is out of the range" + "\n\tGPA: "+ this.gpa;
      }
   }
      
   // Now we will sort the GPA in decending order 
   public static void sortByGPA(Person[] per) throws IOException  {
   
         int size = 0;
         for(int i = 0; i < per.length; i++)    {
         
            if(per[i] instanceof Student)   {
               size++;
            }
         }
            
         int[] studentIndex = new int[size];
         int f = 0;
         
         for(int i = 0; i < PersonClient.personList.length; i++)   { 
         
            if(PersonClient.personList[i] instanceof Student)   {
            
               studentIndex[f] = i;
               f++;
            }
         }
            
         Person temp;
         boolean nextPass = true;
            
         for(int i = 1; i < studentIndex.length && nextPass; i++)   {
         
            nextPass = false;
            for(int j = 0; j < studentIndex.length - i; j++)   {
               if(((Student)per[studentIndex[j]]).getGpa() < ((Student)per[studentIndex[j+1]]).getGpa())   {
               
                  temp = per[studentIndex[j]];
                  per[studentIndex[j]] = per[studentIndex[j+1]];
                  per[studentIndex[j+1]] = temp;
                  nextPass = true;
               }
            }
         }
            
         writeToFile();
      }
      
      // Here we write the to the file of the students in decending order by gpa    
      public static void writeToFile() throws IOException    {
      
         File output = new File("sortByGPA.txt");
         FileWriter fw = new FileWriter(output, false);
         PrintWriter pw = new PrintWriter(fw);
         pw.println("\nPerson Database\nDarek Konopka\nAll students sorted by GPA in descending order");
         
         for (int i = 0; i < PersonClient.personList.length; i++)   {
         
            if(PersonClient.personList[i] != null && PersonClient.personList[i] instanceof Student)    {
               pw.print(PersonClient.personList[i].toString());
            }
         }
         
         pw.close();
      }
}