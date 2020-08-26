// Darek Konopka; CS-101
// This is the client to the product class wer just made

import java.util.*;

public class ProductClient {
   public static void main(String[] args)  { 
   
   // Make the array of objects 
   Product [] products = new Product [5]; 
   
   // Define the parameters of the array 
   for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
      } 
   
   products[0].setName("product 1");  
   products[0].setPrice(24.8); 
   
   products[1].setName("product 2");  
   products[1].setPrice(56.2); 
   
   products[2].setName("product 3");  
   products[2].setPrice(29.7); 
   
   products[3].setName("product 4");  
   products[3].setPrice(3.9); 
   
   products[4].setName("product 5");  
   products[4].setPrice(19.0); 
   
   for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString()); 
         }
   }
}