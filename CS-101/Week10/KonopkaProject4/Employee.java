// Darek Konopka; CS-101
// This class is in between the super class person and the subclasses facultty and staff
// The purpose is to determin the difference between the faculty and staff 
// Data tabels will be formated as such: name; data type; purpose

import java.util.*;
import java.io.*;

// Data: 
// office; String; Where the emploree works
// hiringYear; int; The year the person got hired
// size; int; amount of objects we are sorting
// temp; Person; this is a temperarory object used to sort the input

public class Employee extends Person {

   // Fields
   private String office;
   private int hiringYear; // a number between 1980 and 2020, inclusive
   
   // Constructor 
   public Employee(String firstName, String lastName, String email, String office, int hiringYear)    {

      super(firstName, lastName, email);
      this.office = office;
      this.hiringYear = hiringYear;
   }
   
   // accessor methods:
   public String getOffice(){
      return office;
   }
   public int getHiringYear(){
      return hiringYear;
   }
   
   // mutator method:
   public void setOffice (String office){

      this.office  = office;
   }
   public void setHiringYear (int hiringYear) {

      this.hiringYear = hiringYear;
   }
   
   
   // Overring toString method
   @Override
   public String toString()   {
      if (hiringYear>=1980 && hiringYear<=2020) {
         return super.toString() + "\n\tOffice: " + this.office + "\n\tHiring Year: " + this.hiringYear;
      } else {
         return super.toString() + "\n\tOffice: " + this.office + "\n\tHiring Year: This person is our of the 1980-2020 range"; 
      }
   }
   
   // Now we will sort by hiring year in descending order
   public static void sortByLength(Person[] per) throws IOException   {
      int size = 0;
      
      for(int i = 0; i < per.length; i++)   {
         if(per[i] instanceof Employee)   {
            size++;
         }
      }
      
      int[] employeeIndex = new int[size];
      int f = 0;
      
      for(int i = 0; i < PersonClient.personList.length; i++)   {
         if(PersonClient.personList[i] instanceof Employee)   {
         
            employeeIndex[f] = i;
            f++;
         }
      }
      
      Person temp;
      boolean nextPass = true;
      
      for(int i = 1; i < employeeIndex.length && nextPass; i++)   {
         nextPass = false;
         for(int j = 0; j < employeeIndex.length - i; j++)   {
            if(((Employee)per[employeeIndex[j]]).getHiringYear() < ((Employee)per[employeeIndex[j+1]]).getHiringYear())   {
            
               temp = per[employeeIndex[j]];
               per[employeeIndex[j]] = per[employeeIndex[j+1]];
               per[employeeIndex[j+1]] = temp;
               nextPass = true;
            }
         }
      }
      
      writeToFile();
   }
   
   // Here we write to the file, the employees from hiring year in descending order
   public static void writeToFile() throws IOException   {
   
      File output = new File("sortByDuration.txt");
      FileWriter fw = new FileWriter(output, false);
      PrintWriter pw = new PrintWriter(fw);
      pw.println("\nPerson Database\nDarek Konopka\nEmployees sorted by duration worked in Descending Order");
      
      for (int i = 0; i < PersonClient.personList.length; i++)   {
         if(PersonClient.personList[i] != null && PersonClient.personList[i] instanceof Employee)  {
         
            pw.print(PersonClient.personList[i].toString());
         }
      }
      pw.close();
   }

}