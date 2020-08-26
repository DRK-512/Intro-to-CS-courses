// Darek Konopka; CS-101; Programming Project 4
// This is the super class for any person 
// This is used to filter whether they are a student or employee

import java.io.*;
import java.util.*;

// Data: 
// firstName: String: this is the first name of the person
// lastName: Stirng: this is the last name of the person
// email: String: the email of the individual
// startFirstName: String: the start varible of the first name
// startLastName: Stirng: start varible for last name
// startEmail: String: start varible of email 
// firstNameVar: String: this is a varible for the first name of the person
// lastNameVar: Stirng: this is a varible for this is the last name of the person
// emailVar: String: this is a varible for the email of the individual
// fw: FileWriter: this writes to the file
// pw: PrintWriter: this prints to the file 

public class Person {
    
    // the Person class has three fields:
    private String firstName;
    private String lastName;
    private String email; 
        
    // constructor:
    public Person( String startFirstName, String startLastName, String startEmail )   {
    
        firstName = startFirstName;
        lastName = startLastName;
        email = startEmail;
    }
    
    // accessor methods:
    public String getFirstName( )   {
    
        return firstName;
    }
    
    public String getLastName( )   {
    
        return lastName;
    }
        
    public String getEmail( )   {
        return email;
    }
    
    // mutator methods:
    public void setFirstName( String firstNameVar )   {
    
        firstName = firstNameVar;
    }
    
    public void setLastName( String lastNameVar )   {
    
        lastName = lastNameVar;
    }
        
    public void setEmail( String emailVar )   {
    
        email = emailVar;
    }
    
    // Now we will sort the entire database by last name in ascending order
    public static void sortByName() throws IOException    {
    
         Person temp;
         
         for(int i = 1; i < PersonClient.personList.length && PersonClient.personList[i] != null; i++)    {
            for(int j = 0; j < PersonClient.personList.length - 1 && PersonClient.personList[j+1] != null; j++)   {
            
               if((PersonClient.personList[j].getLastName()).compareTo(PersonClient.personList[j+1].getLastName()) > 0)   {
                  temp = PersonClient.personList[j];
                  PersonClient.personList[j] = PersonClient.personList[j+1];
                  PersonClient.personList[j+1] = temp;
                 
               }
            }
         }
         
         writeToFile();
      }
      
      // This class writes your results to the sortByName file 
      public static void writeToFile() throws IOException   {
      
         File output = new File("sortByName.txt");
         FileWriter fw = new FileWriter(output, false);
         PrintWriter pw = new PrintWriter(fw);
         pw.println("\nPerson Database\nDarek Konopka\nAll last names in ascending order");
         
         for (int i = 0; i < PersonClient.personList.length; i++)
         {
            if(PersonClient.personList[i] != null)
            {
               pw.print(PersonClient.personList[i].toString());
            }
         }
         
         pw.close();
      }
    
    
    // overriding toString method
    @Override
    public String toString( )
    {
        return "\n\tFirst name: " + this.firstName
               + "\n\tLast name: " + this.lastName
               + "\n\te-mail address: " + this.email;
    }
}