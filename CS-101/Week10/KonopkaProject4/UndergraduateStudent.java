// Darek Konopka; CS-101
// This is a subclass of the person class
// Here we define an undergraduate student


import java.io.*;
import java.util.*;

// status; int; the number that signifies which grade the studetn is in
// tempStatus; String; the string version of status, so if statsu = 1 then tempStatus = freshmen
// tempStanding; int; this number is the status that is manipulated for sorting 

public class UndergraduateStudent extends Student {

   // Fields 
   private int status; // either 1 for freshman, 2 for sophomore, 3 for junior, or 4 for senior
   private String tempStatus; // store class level to number
   private int tempStanding; 
   
   // constructor:
   public UndergraduateStudent(String firstName, String lastName, String email, int studentID, double GPA, int status)   {
   
      super(firstName, lastName, email, studentID, GPA);
      this.status = status;
   }
   
   // accessor methods:
   public int getStatus(){
      return status;
   }
   
    public int getStanding(int standing)   {
      
      tempStanding = standing;
      return tempStanding;
   }

   // mutator method:
   public void setStatus (int status)   {

     this.status  = status;
   
   }
   
   // Overriding string method for class standing 
   @Override
   public String toString()   {
      
      switch(getStatus())   {
      
         case 1:
            tempStatus = "Freshman";
            break;
         case 2:
            tempStatus = "Sophomore";
            break;
         case 3:
            tempStatus = "Junior";
            break;
         case 4:
            tempStatus = "Senior";
            break;
         default:
            tempStatus = "The input is invalid"; 
            break;
      }
      
      return "\nUndergraduate Student" + super.toString() + "\n\tStatus: " + tempStatus + "\n";
   }
   
  

   public static void sortByStanding(Person[] per) throws IOException   {
      int size = 0;
      
      for(int i = 0; i < per.length; i++)   {
      
         if(per[i] instanceof UndergraduateStudent)   {
         
            size++;
         }
      }
      
      int[] studentIndex = new int[size];
      int f = 0;
      
      for(int i = 0; i < PersonClient.personList.length; i++)   {
         if(PersonClient.personList[i] instanceof UndergraduateStudent)   {
         
            studentIndex[f] = i;
            f++;
         }
      }
      
      Person temp;
      
      boolean nextPass = true;
      
      for(int i = 1; i < studentIndex.length && nextPass; i++)   {
      
         nextPass = false;
         for(int j = 0; j < studentIndex.length - i; j++)   {
         
            if((((UndergraduateStudent)per[studentIndex[j]]).getStanding(((UndergraduateStudent)per[studentIndex[j]]).getStatus())) > (((UndergraduateStudent)per[studentIndex[j+1]]).getStanding(((UndergraduateStudent)per[studentIndex[j+1]]).getStatus())))   {  
               temp = per[studentIndex[j]];
               per[studentIndex[j]] = per[studentIndex[j+1]];
               per[studentIndex[j+1]] = temp;
               nextPass = true;
            }
         }
      }
      
      writeToFile();
   }
   
   // Here we create the txt file that is sorts the undergraduate students by status in ascending order 
   public static void writeToFile() throws IOException   {
   
      File output = new File("sortByStatus.txt");
      FileWriter fw = new FileWriter(output, false);
      PrintWriter pw = new PrintWriter(fw);
      pw.println("\nPerson Database\nDarek Konopka\nUndergraduate Students sorted by class standing in ascending order");
      
      for (int i = 0; i < PersonClient.personList.length; i++)   {
         if(PersonClient.personList[i] != null && PersonClient.personList[i] instanceof UndergraduateStudent)   {
         
            pw.print(PersonClient.personList[i].toString());
         }
      }
      
      pw.close();
   }

}
