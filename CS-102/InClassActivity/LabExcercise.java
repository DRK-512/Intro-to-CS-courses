/*  

* Name: Darek Konopka     
* Date: 5/5/2021
* Question number: 1
* Description: In this code we will do the following:

1) add some strings to Stack
2) use search method from stack Java class to get the position of an element in the stack
3) get the top element in the stack
4) pop elements from stack

*/

import java.util.*;
import Stack.*; 
  
public class LabExcercise {
    public static void main(String args[])   {
    
        // Creating an empty Stack
        Stack astack = new Stack();
  
        // Use push() to add elements into the Stack
        astack.push(7);
        astack.push(2);
        astack.push(9);
        astack.push(6);
        astack.pop(); 
        astack.pop();
        astack.peek(); 
        astack.push(1); 
        astack.push(3); 
        astack.peek(); 
        astack.push(8); 
        astack.pop();
        astack.peek(); 
        astack.pop();
        astack.pop();
        astack.push(5); 
        astack.push(4); 
        astack.pop();
        astack.pop();
        astack.pop();
        astack.push(8); 
        // Displaying the Stack
        int position = astack.search(8);
        System.out.println("Position of C is: " + astack);
        
        // Pop each element
        while(!astack.empty()){
        System.out.println(astack.pop());
        }
        
        
    }
}