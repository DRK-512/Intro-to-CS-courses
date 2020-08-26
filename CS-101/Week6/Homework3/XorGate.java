//Darek Konopka; CS-101; Homework3 Question 1
//This program takes your input and tells you if it is true or false with respect to a XOR gate

import java.util.*;
   
public class XorGate {

   // Declaring varibles before using them in my public classes
   boolean check; 
   String input; 
   
   // This class checks the input, and will ask for a proper input if a non binary number is entered 
   public void ErrorCheck() {
   
      // First we get the input 
      check = false; 
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a binary number: ");
      input = scan.nextLine(); 
      
      // Then we check if it is a binary number, if not, the user will be propted again to type in a binary number 
      while (check==false) {
         check = true; 
         
         for (int i=0; i < input.length(  ); i++){
         
            char a = input.charAt(i); 
            
            if (a == '0'  || a == '1') {
                check = true; 
          } else {
             check = false; 
            } 
         }
        // If fails, we will keep calling that class until the user types a binary number
          if (check==false) {
             System.out.print("Actually enter a binary number please: ");
             input = scan.nextLine(); 
      
         }
      }
   }
   
   // This class takes our string input and converts it into a list of strings 
   public static List<String> convertStringToList(String str) { 
  
     // Create an empty to list all the charecters from the input  
     List<String> chars = new ArrayList<>(); 
     
     // Then we will split the string 
     String[] token = str.split("");

     // Now we take each part and throw it into our list
     for (String ch: token) { 
         
         chars.add(ch); 
     } 
  
     // return the List of charecters
     return chars; 
 }
    
   public static void main ( String [] Args ){
   
      // Declare varibles
      String LowerBound; 
      String UpperBound; 
      int counter = 0; 
      int Divider; 
      String lastLetter; 
      
      // Input the number using the ErrorCheck class above (It checks if it is a proper binary digit)  
      XorGate myObj = new XorGate(); 
      myObj.ErrorCheck(); 
      String num = myObj.input; 
   
      // Once we have the binary number, we put it into a list using the convertStringToList function
      List<String> numberList = convertStringToList(num); 
      
      // Then we make an empty list which we will use to campare to the orginal list later
      ArrayList<String> newList = new ArrayList<String>(); 
  
     // Now I will take apart the first string, and input the results of the XOR gate in the new list, and keep repeating until we are done 
       while (numberList.size() != 1) {
       
       // If the size of the input is less than 1, we either have no input or we only have 1 input 
         if (numberList.size() > 1) {
         
            // if the size is odd, we need to remove the last digit and put it back in afterwards 
            if (numberList.size() % 2 == 0) {
            
               for(int i=0 ; i < numberList.size() ; i = i + 2){
            
                  // Then we take the results of the first itteration through the input and put those results into the newList 
                  if (i < numberList.size()) {
                     LowerBound = numberList.get(i);
                     UpperBound = numberList.get(i+1);
                  
                     if (LowerBound.equals(UpperBound)) {
                        newList.add("0");
      
                     } else {
                        newList.add("1"); 
                     }   
                  } 
               } 
            
            // Since the size is odd, we need to remove the last digit and put it back in after we get the results of this itteration     
            } else {
               lastLetter = numberList.get(numberList.size()-1); 
               numberList.remove(numberList.size()-1); 
               
               for(int i=0 ; i < numberList.size() ; i = i + 2){
                  
                  // If our size was 3, then we will finish it up here
                  if (numberList.size() == 2) {
                  
                     // Then we take the results of the first itteration through the input and put those results into the newList 
                     if (i < numberList.size()) {
                        LowerBound = numberList.get(i);
                        UpperBound = numberList.get(i+1);
                     
                        if (LowerBound.equals(UpperBound)) {
                           newList.add("0");
         
                        } else {
                           newList.add("1"); 
                        }   
                     } 
                  } newList.add(lastLetter); 
               } 
            }
         }

         //After an itteration, we take our newList, make it equal to our old list, then we erase the new list
         numberList.clear(); 
         
            
         for(String str:newList) {  
            numberList.add(str);  
         }  
            
         newList.clear();
         
      }  
   
   // Finally we output the results 
   if (numberList.get(0) == "1") {
      System.out.println("True"); 
      
   } else {
      System.out.println("False"); 
      }
   }
}
