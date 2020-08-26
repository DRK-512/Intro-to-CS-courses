// Darek Konopka; CS-101; Programming Project 4
// This project mainly focuses on sorting arrays of objects and practice inheritance and polymorphism
// of classes. In this project, you will write a program to prepare reports for a small database on people. 
// Data tabels will be formated as such: name; data type; purpose

import java.io.*;
import java.util.*;

// Data: 
// personList: Person list: This is the list of the people in the data base
// file: File: This is the input file 
// fr: FileReader: This is the file put into a string
// scan: Scanner: This is the file as an input
// i: int: this is used as a counter for the while loop
// line: String: This is each line after the \n of the inputFile
// parse: Scanner: this is the parse from each line
// firstName: String: this is the first name of the person
// lastName: Stirng: this is the last name of the person
// email: String: the email of the individual
// studentID: int: the student ID of the student
// GPA: double: the GPA of the student
// status: int: the class standing of the individual
// level: char: whether the student is in the masters or doctorit program 
// office: String: this is the office where the employee resides
// hiringYear: int: the year the professor got hired
// rank: char: which position the faculty is 
// title: String: the title of the staff 

public class PersonClient {
   
   // Your program should run for any valid input of 1 to 100 people 
   static Person [] personList = new Person[100];
   
   public static void main(String[] args)  { 
   
      File file = new File("inputFile.txt"); // This is the input file located in the same folder as the main class
      
      // This checks if the file exsists 
      try (FileReader fr = new FileReader(file)) {

         // Now we can extra all the information from the file and 
         Scanner scan = new Scanner( file );
      
         int i = 0;
         
         while ( scan.hasNextLine( ) ) {
            
            String line = scan.nextLine( );           
            Scanner parse = new Scanner( line );
            parse.useDelimiter("#");
            switch(line.charAt(0) )   {          
             
               // If we have an undergrade, we will make it the person db meaning the object
               case 'U':
               
                  parse.next();
                  String firstName = parse.next();
                  String lastName = parse.next();
                  String email = parse.next();
                  int studentID = parse.nextInt();
                  double GPA = parse.nextDouble();
                  int status = parse.nextInt();
               
                  personList[i] = new UndergraduateStudent(firstName, lastName, email, studentID, GPA, status);
                  break;
               
               // If we have a graduate student 
               case 'G':
               
                  parse.next();
                  firstName = parse.next();
                  lastName = parse.next();
                  email = parse.next();
                  studentID = parse.nextInt();
                  GPA = parse.nextDouble();
                  char level = parse.next().charAt(0);
               
                  personList[i] = new GraduateStudent(firstName, lastName, email, studentID, GPA, level);       
                  break;
               
               // Faculty
               case 'F':
               
                  parse.next();
                  firstName = parse.next();
                  lastName = parse.next();
                  email = parse.next();
                  String office = parse.next();
                  int hiringYear = parse.nextInt();
                  char rank = parse.next().charAt(0);
               
                  personList[i] = new Faculty(firstName, lastName, email, office, hiringYear, rank);            
                  break;
               
               // Staff    
               case 'S':
               
                  parse.next();
                  firstName = parse.next();
                  lastName = parse.next();
                  email = parse.next();
                  office = parse.next();
                  hiringYear = parse.nextInt();
                  String title = parse.next();
               
                  personList[i] = new Staff(firstName, lastName, email, office, hiringYear, title);          
                  break;
               }
               
                  i++;  
            
         }  
            
         Person.sortByName(); 
         UndergraduateStudent.sortByStanding(personList);
         Student.sortByGPA(personList);
         Employee.sortByLength(personList);
             
         // If the file is not found, we throw an error message 
      } catch (IOException e) {
         System.out.println("ERROR input file NOT FOUND");
         e.printStackTrace();
      }
   }
}