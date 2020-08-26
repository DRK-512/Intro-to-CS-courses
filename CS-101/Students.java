import java.io.*;
import java.util.*;
import java.text.*;

public class Students {
   public static void main(String[] args)  { 
   
   // 2D array of 30x6
   int students[][] = new int[30][6]; 
   
   // Import registration file and assign them to the list 
   try {
      File myObj = new File("Registration.txt");
      Scanner myReader = new Scanner(myObj);
      int i=0; 
      int j=0; 
      
      while (myReader.hasNextLine()) {
       
         String data = myReader.nextLine();  
         // Initialize Scanner object
   		Scanner scan = new Scanner(data);
   		// initialize the string delimiter
   		scan.useDelimiter(" ");
   		 
   		// Printing the tokenized Strings
   		while(scan.hasNext())   {
            String data2 = scan.next(); 
      			if (data2.equals("1") || data2.equals("0")) {
               
                  students[i][j] = Integer.valueOf(data2);
                     
                     if (j<5) {
                        j++; 
                     }
               }
      		}
            
            j=0; 
            i++;
      		scan.close();
            
            
	      }
         myReader.close();
         
         // The 2D array students now has the values from the file 
         int collumnCounter[] = new int[6]; 
         int counter1 = 0; 
         int counter2 = 0; 
         int counter3 = 0; 
         int counter4 = 0; 
         int counter5 = 0;
         int counter6 = 0; 
         
         // this is how we will find out how many 1's are in each collumn 
         for (i=0; i<30; i++) {
            if (students[i][0] == 1) {
               counter1++; 
            }
         } 
         for (i=0; i<30; i++) {
            if (students[i][1] == 1) {
               counter2++; 
            }
         }
         for (i=0; i<30; i++) {
            if (students[i][2] == 1) {
               counter3++; 
            }
         }
         for (i=0; i<30; i++) {
            if (students[i][3] == 1) {
               counter4++; 
            }
         }
         for (i=0; i<30; i++) {
            if (students[i][4] == 1) {
               counter5++; 
            }
         }
         for (i=0; i<30; i++) {
            if (students[i][5] == 1) {
               counter6++; 
            }
         }
         
         collumnCounter[0] = counter1; 
         collumnCounter[1] = counter2;
         collumnCounter[2] = counter3;
         collumnCounter[3] = counter4;
         collumnCounter[4] = counter5;
         collumnCounter[5] = counter6;
         int avg=0; 
         
         System.out.print("Value of i-th elements in the 2D array: "); 
         for (i=0; i<collumnCounter.length; i++) {
            System.out.print(collumnCounter[i]); 
            avg=avg+collumnCounter[i]; 
            if (i!=5) {
            System.out.print(", "); 
            }
            
         }
         
         System.out.println("\nThe average of the i-th courses is: " + (avg/6)); 
         
         // Now we have to find the students that have registered for the largest number of courses
         // We need an array list because we will add and or clear all the varibles to the list 
         ArrayList<String> list=new ArrayList<String>();
         int max = 0; 
         
         for(i=0; i<students.length; i++) {
            int counter = 0;  
            for (j=0; j<students[i].length; j++) {
               if (students[i][j]==1) {
                  counter++; 
               }
               if (counter>max) {
                  max = counter; 
                  list.clear(); 
                  list.add(String.valueOf(i)); 
               } else if (counter==max) {
                  list.add(String.valueOf(i)); 
               }
            }
         }
         
         System.out.println("The largest number of courses a student took was: " + max); 
         System.out.print("The students who took " + max + " courses were: "); 
         for(i = 0; i < list.size(); i++) {   
            System.out.print(list.get(i) + " ");
         }  
        
   } catch (IOException e) {
         System.out.println("ERROR input file NOT FOUND");
         e.printStackTrace();
      }
   }
}