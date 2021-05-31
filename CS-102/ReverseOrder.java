/*
   *Name: Darek Konopka
   *Date: 04/28/2021
   *Question: Number 4
   *Description: This program uses recursion to print a string backwards
*/

public class ReverseOrder {

   // Method that reverses the order of the string
   public static String reverseString(String str)
    {
        // If the input is null, then we just return the string
        if (str.isEmpty())
        {
            return str;
        }
        // Call the function again and again until we are done
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    public static void main(String[] args) {
         
        // Here we create a string, then call the reverse string function
        String str = "Lets make this backwards";
        String reversed = reverseString(str);
        System.out.println("The input string is: " + str); 
        System.out.println("The reversed string is: " + reversed);
    }
}