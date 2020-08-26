// Darek Konopka; CS-101
// This is the client class for the rectangle class
// The purpose is to have fun with super classes and subclasses 

public class RectangleClient {
   public static void main ( String [] args ) {
   
   // Here I define the two rectangle objects 
   Rectangle r1 = new Rectangle(); 
   Rectangle r2 = new Rectangle(); 
   
   // Here I will change the vlaues for r1, but I will keep r2 at the default values
   r1.setColor("red"); 
   r1.setFilled(true); 
   r1.setWidth(5.0); 
   r1.setHeight(6.0);
   
   // Now I will print the two objects 
   System.out.println(r1.toString() + "\n"); 
   System.out.println(r2.toString() + "\n"); 
   
   System.out.println(r1.equals(r2)); // This compares if the colors are different 
   System.out.println(r2.equals(1.0, 1.0)); // this compares the width and heights 
   
   }
}