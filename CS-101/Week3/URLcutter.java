//Darek Konopka; CS-101; In class activity 4/22/2020
//What this code does is you type a URL and it tells you the name of the site
//EX: I type in www.kettering.edu then it would output kettering

//Import Libraries
import java.util.Scanner;

public class URLcutter{ 
   public static void main ( String [] args ) {
   
   //Define varibales 
   Scanner input = new Scanner(System.in); //Here I define an input
   System.out.println("Please enter a university website URL \nstarting with www. and ending with .edu" );
   String URL = input.next(); //Now URL is the string of the input
   
   //Now we will cut the URL to find the name of the university
   int index1 = URL.indexOf("."); //Finds where the www. ends
   int index2 = URL.indexOf("edu");//finds where .edu starts
   
   String endOfURL = URL.substring(index1+1, index2); //slices the string
   System.out.println("The unveristy name is " + endOfURL); //prints it
   
   }
} 