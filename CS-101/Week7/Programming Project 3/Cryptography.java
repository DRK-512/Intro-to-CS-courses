//Darek Konopka; CS-101; Programming project 3 
//This class is used to encrypt and decrypt the input of an object 

import java.util.*;
import java.io.*;

/*/ ****************** DATA TABLE ******************* //
FORMAT: name; data type; purpose
key; String; stores the string that is part of the object
encryption; boolean; states whether or not we are encrypting or decrypting the following key that is part of the object
*/

public class Cryptography {

   // Instance variables fields 
   public String key;            //  which stores the String 
   public boolean encryption;   //  which stores whether or not it is an encryption or decryption 
   
   //******************************* Constructors ********************************//
   
   // Default Constructor
   // Sets default values for instance variables  
   public Cryptography() {
       key = "";
       encryption = true;
   }
   
   // Overloaded constructor
   // Allows client to set beginning values for instance varibles  
   public void Cryptography(String startKey, boolean startEncryption)   {
       key = startKey; 
       encryption = startEncryption;  
    }
    
    //******************************* Methods ********************************//
    
    // Accessor Method:
    // returns current value of key
    public String getKey( )
    {
       return key;
    }
    
    // Accessor Method:
    // returns current value of encryption
    public boolean getEncryption( )
    {
       return encryption;
    }
    
    // Mutator Method:
    // allows client to set model
    public Cryptography setKey( String newKey )
    {
        this.key = newKey;
        return this;
    }
    
    // Mutator Method:
    // allows client to set model
    public Cryptography setEncryption( boolean newEncryption )
    {
        this.encryption = newEncryption;
        return this;
    }
    
    // Mutator Method:
    // encrypts the text 
    
    /*/ ****************** DATA TABLE ******************* //
    FORMAT: name; data type; purpose
    results; Stringbuffer; This is a list of the encrypted values
    text; String; input string which will be encrypted
    shifter; int; This is amount we shift the input
    ch; charecter; this is used as a placeholder for charecters 
    */
    public static StringBuffer encrypt(String text, int shifter) {
     
        StringBuffer result= new StringBuffer(); 
        
        // This iterates through each charecter of the input 
        for (int i=0; i<text.length(); i++) { 
        
            // If upper case, we will keep it an upper case if after the shift the number is too high, it wraps back to 65 (ASSCI number for A) 
            if (Character.isUpperCase(text.charAt(i))) { 
                char ch = (char)(((int)text.charAt(i) + shifter - 65) % 26 + 65); 
                result.append(ch); 
            } 
            
            // If lower case, we will also wrap it back to a and add it to our result
            else if (Character.isLowerCase(text.charAt(i))) { 
                char ch = (char)(((int)text.charAt(i) + shifter - 97) % 26 + 97); 
                result.append(ch); 
                
            } else {
            
               // If the charecter is a space, then we replace that with a zero 
               char ch = (char) (((int)text.charAt(i))); 
               if (ch==' '){
                  result.append('0');
               } else {
                   result.append(ch); 
            }    
         }  
      } 
      text = result.toString(); 
      return result;
   }
   // Mutator Method:
   // decrypts the text 
   
   /*/ ****************** DATA TABLE ******************* //
   FORMAT: name; data type; purpose
   results; Stringbuffer; This is a list of the encrypted values
   text; String; input string which will be encrypted
   shifter; int; This is amount we shift the input
   ch; char; this is used as a placeholder for charecters 
   */
    public static StringBuffer decrypt(String key, int shifter) {
     
        StringBuffer result= new StringBuffer(); 
        
        // This iterates through each charecter of the input 
         for (int i=0; i<key.length(); i++) { 
            
            // If upper case, we will keep it an upper case if after the shift the number is low high, it wraps back to 90 (ASSCI number for Z) 
            if (Character.isUpperCase(key.charAt(i))) { 
               int ascii = ((int)key.charAt(i) - shifter - 65);
               
               if (ascii>=65) {
                  char ch = (char)(ascii % 26 + 65); 
                  result.append(ch); 
                } else {
                ascii= ascii + 26;
                char ch = (char)(ascii % 26 + 65); 
                result.append(ch); 
                }
            } 
            
            // If lower case, we will also wrap it back to z and add it to our result
             else if (Character.isLowerCase(key.charAt(i))) { 
                  int ascii = ((int)key.charAt(i) - shifter - 97);
               
               if (ascii>=65) {
                  char ch = (char)(ascii % 26 + 97); 
                  result.append(ch); 
                } else {
                ascii= ascii + 26;
                char ch = (char)(ascii % 26 + 97); 
                result.append(ch); 
                }
            } else {
            
               // If the charecter is a space, then we replace that with a zero 
               char ch = (char) (((int)key.charAt(i))); 
               if (ch=='0'){
                  result.append(' ');
               } else {
                   result.append(ch); 
            }    
         }  
      } key = result.toString(); 
        return result;
   } 
    
    // returns a String of instance variable values
    @Override
    public String toString( )  {
       return "Current value of key: " + key
             + "\nThis is being encrypted: " + String.valueOf(encryption);      
    }
    
    // The method will encrypt or decrypt the parameter String according to which
    // type of this object is (value of the boolean instance variable). 

    /*/ ****************** DATA TABLE ******************* //
   FORMAT: name; data type; purpose
   o; Object; this is your input object which gives the string and tells whether or not you are encrypting or decrypting
   shifter; int; how much we shift the string from the object 
   myObj; Object; this just renames the o but as a Cryptograghy object 
   text; String; input string which will be encrypted
   */
    public String cipher ( Object o, int shifter ) {
    
    // if o is not a Cryptography object, return a blank stirng since there wasnt an input of one 
    StringBuffer text; 
    if ( ! ( o instanceof Cryptography ) ) {
      return "";
      
      } else {

      Cryptography myObj = ( Cryptography ) o;

      // If we are encrypting we will run an encryption method
      if (encryption==true) {   
         text = myObj.encrypt(myObj.key, shifter);
       
      // If encryption is false, then we will be decrypting the string 
      }else {  
         text = myObj.decrypt(myObj.key, shifter);
         
         }  return text.toString(); 
      }  
   }
   
   //*********** Additional Classes to make my life easier *****************//
   
   // This converts the input stirng into a list of charecters 
   
   /*/ ****************** DATA TABLE ******************* //
   FORMAT: name; data type; purpose
   myList; String[]; this is the list that will hold all the charecters of the stirng 
   ch; char; this is used as a placeholder for charecters 
   strl Stirng; input string that will be put into list 
   */
   public String[] stringToList (String str) {
   
      // Define Varibles 
      String [] myList = new String [str.length()]; 
      char charecter; 
      
      // Now we will take each charecter from the string and add it to the list of strings 
      for(int i=0; i<str.length();i++){  
      
         charecter = str.charAt(i);  
         myList[i] = String.valueOf(charecter);
      }      
      return myList; 
   }
   
   // This converts the input stirng array into an array of integers 
   
   /*/ ****************** DATA TABLE ******************* //
   FORMAT: name; data type; purpose
   myList; int[]; this is the list that will hold all the ascii values of the charecters from the string array
   temp; int; the ascii value of the charecter
   str; String[]; The input string array 
   */
   public int[] listToIntegers(String[] str) {
   
      // Define varibles 
      int [] myList = new int [str.length]; 
      
      for (int i = 0; i < str.length; i++) {
         
         // here I convert the charecter to ASCII
         int temp = (int) str[i].charAt(0);

         // Then I figure out if it is a capital or lowercase number
         // I know z in ascii is 90, so if it is greater, than it is a lower case number
         if ( temp > 91 ) {
            // a = 97 so after this a = 0
            temp = temp - 97; 
         } else {
            // A = 65 so after this A = 0
            temp = temp - 65; 
         }
         myList[i] = temp; 
         
         } return myList; 
   
   } 
}