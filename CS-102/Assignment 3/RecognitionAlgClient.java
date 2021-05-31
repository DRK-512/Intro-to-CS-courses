/*  

* Name: Darek Konopka     
* Date: 5/12/2021
* Question number: 2
* Description: In this code we will do the following:

2)(20 points) Consider the language which describes a recognition algorithm for 
   the language L= {w$w': w is a possibly empty string of characters other than $, w'= reverse(w) }

a) Write a recognition algorithm for this language that uses both a queue and a stack. 
   Therefore, as you traverse the input string, you insert each character of w into a 
   queue and each character of w’ into a stack. Assume that each input string contains exactly one $.
 b) Implement your approach.
 c) Write a client class to prompt the user 
 for a string, then use the methods in your class to determine 
 and display a message indicating whether that string is in the language or not.
 
 
 1. find $ index in string
 2. store charecters before $ in queue, so keep looping until you find a $
 EX: while(node.get!="$"){
 enqueue()
 }
 3. after while, store onto stack, so loop and push onto stack
 4. compare sizes of string
   4a. if they are equal; compare sizes of queue and stack(dequeue and pop) 
   

*/

  
import java.util.*;
import java.lang.*; 
import Queue.*;
import Stack.*; 

public class RecognitionAlgClient {
    public static void main(String args[])   {
    
       // get input string
       Scanner sc= new Scanner(System.in); 
       System.out.print("Enter a string: ");  
       String inputString= sc.nextLine(); 
        
       // Define the stack and queue
       Stack astack = new Stack();
       QueueReferenceBased q1 = new QueueReferenceBased(); 
       
       // Where the $ is
       int x = inputString.indexOf("$"); 
       
       // check if $ is in the string, and if it is not at the end
       if (x==-1 && (x!=inputString.length()-1)){ 
         System.out.println("Is not in the language"); 
         return; 
       }
       
       // push onto the stack until you reach $
       for(int i=0; i<x; i++) {
         
         astack.push(inputString.charAt(i)); 
       }
       
       // enqueue everything after $
       for(int i=x+1; i < inputString.length(); i++){
         q1.enqueue(inputString.charAt(i)); 
       }
       
       // Now the stack (before $) and queue (after $) to check it is in the language
       for(int i=0; i<x; i++) { 
         if(!q1.dequeue().equals(astack.pop())) {
            System.out.println("Is not in the language"); 
            return; 
           }
       }
      
       // if all tests pass, you can conclue it is the language
       System.out.println("It in the language"); 
   }
}