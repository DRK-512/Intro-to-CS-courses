//Darek Konopka; CS-101; Inclass activity Part 1 5/13
//This code check whether or not the user input is a palindrome 

import java.io.*;
import java.util.*;

public class PalindromeCheck { 
    public static void main(String[] args)  { 
        
        String Input;  
        boolean Match = true; 
        int Start = 0;
        int Finish = 0; 
        
        //First we input the users string
        Scanner scan = new Scanner( System.in ); 
        System.out.print("Please enter a string: "); 
        Input = scan.nextLine(); 
        
        //Since this should be case insesative we make all the letters lowercase while running out code 
        Input = Input.toLowerCase(); 
        
        // now J points to the end 
        Finish = Input.length() - 1; 
  
        // While there are characters toc compare 
        while (Start < Finish) { 

            // If there is a mismatch 
            if (Input.charAt(Start) != Input.charAt(Finish)) { 
                Match=false;
                break;   
            }
            // Increase first pointer and decrease second until the while loop no longer is true 
            Start++; 
            Finish--; 
            
        }
        
        //If we do have a match, then it is a palindorme, however if in the while loop we saw it was not a palindrome, we print no
        if (Match==true) {
            System.out.print("Yes "+ Input + " is a palindrome"); 
        } else {
            System.out.print("No " + Input + " is not a palindrome");
        }  
    } 
}