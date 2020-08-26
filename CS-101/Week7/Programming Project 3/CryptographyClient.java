//Darek Konopka; CS-101; Programming project 3 
//This encrypts/decrypts text from a file using the cryptography class

import java.io.*;
import java.util.*;

/*/ ****************** DATA TABLE ******************* //
         FORMAT: name; data type; purpose
         
         num; int; integer placeholder for reading the files 
         counter; int; this is a counter that counts itteration
         str; String; String key
         str2; String; Encrypted version of key
         str3; String; Decrypted version of key 
         stringBuilder1; StringBuilder; Used to build string from key file 
         stringBuilder2; StringBuilder; Used to build string from encrypt file
         stringBuilder3; StringBuilder; Used to build string from decrypt file
         String [] newList1; 
         String [] newList2; 
         String [] stringList; 
         int [] numberList; 
         char charecter; 
         myObj; Object; Holds value of key and whether the key will be encrypted or decrypted
         
         keyFile; FileReader; KeyFile.txt
         encryptFile; FileReader; AwaitngEncryption.txt  
         encryptedOutput; FileWriter; Encrypted.txt
         decryptedOutput; FileWriter; Decrypted.txt
         
*/
public class CryptographyClient {
   public static void main(String[] args)  { 
   
      try {
      
         // Declare varibles 
         int num;
         int counter = 0;
         String str; 
         String str2; 
         String str3; 
         StringBuilder stringBuilder1 = new StringBuilder();
         StringBuilder stringBuilder2 = new StringBuilder();
         StringBuilder stringBuilder3 = new StringBuilder();
         String [] newList1; 
         String [] newList2; 
         String [] stringList; 
         int [] numberList; 
         char charecter; 
         
         // Create the files  
         FileReader keyFile = new FileReader("KeyFile.txt"); 
         FileReader encryptFile = new FileReader("AwaitngEncryption.txt");  
         FileWriter encryptedOutput = new FileWriter("Encrypted.txt"); 
         FileWriter decryptedOutput = new FileWriter("Decrypted.txt");
         
         // Here I take the string from the files, then I will redefine so I can use them in my code  
         while ((num=keyFile.read()) != -1) { 
            stringBuilder1.append((char) num);  
         } 
         
         while ((num=encryptFile.read()) != -1) { 
            stringBuilder2.append((char) num);  
         }
         str = stringBuilder1.toString(); 
         str2 = stringBuilder2.toString(); 
         
         // Create objects using the input from the files 
         Cryptography myObj = new Cryptography();
         newList1 = new String [str2.length()];
         newList2 = new String [str2.length()]; 
         
         // First I will make the string into a list of charecters
         stringList = myObj.stringToList(str); 
         
         // Now using that list, we will translate it to a list of integers with respect to the charecters (A=0,a=0, Z=25, z=25) 
         numberList = myObj.listToIntegers(stringList); 
         
         myObj.setEncryption(true);
         
         // Here we get each charecter from str2 and then run it through the cipher with respect to the number list 
         for (int i=0; i<str2.length();i++)  {  
           
           charecter = str2.charAt(i);  
           myObj.setKey(String.valueOf(charecter));
           newList1[i] = myObj.cipher(myObj, numberList[counter]);
           
           // This results the counter for the 
           counter++; 
            if (counter>=10) {
               counter = 0; 
            } 
         } 
         
         
         // newList1 is now our encrypted text      
         for (int i = 0; i < newList1.length; i++) {
            encryptedOutput.write(newList1[i]); 
         }
         
         // Now we will do the decryption on the key file 
         myObj.setEncryption(false);
         counter = 0;
         
         // Here we get each charecter from str2 and then run it through the cipher with respect to the number list 
         for (int i=0; i<str2.length();i++)  {  
           
           charecter = str2.charAt(i);  
           myObj.setKey(String.valueOf(charecter));
           newList2[i] = myObj.cipher(myObj, numberList[counter]);
           
           // This results the counter for the 
           counter++; 
            if (counter>=10) {
               counter = 0; 
            } 
         } 
        
         // newList1 is now our encrypted text      
         for (int i = 0; i < newList2.length; i++) {
            decryptedOutput.write(newList2[i]); 
         }
         
         // Finally we close the two files we wrote too
         encryptedOutput.close(); 
         decryptedOutput.close(); 
          
      }catch (IOException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }
}