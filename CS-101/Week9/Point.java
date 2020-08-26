// Darek Konopka; CS-101; Programming activity 6/1
// Here is a class that creates an x and y value, then spits it back out like (1.4, 3.2) if x = 1.4 and y = 3.2

public class Point {

   // instance variables
   private double x;
   private double y; 

   // Constructor 
   public Point( )   {
       x = 0;
       y = 0;    
   }
   
   // Two accessor methods 
   // This returns the x value
   public double getX( )   {
       return x;
   }
   
   // This returns the x value
   public double getY( )   {
       return y;
   }

   // Mutator Methods:
   // allows client to set x
   public Point setX( double x )   {
       this.x = x;
       return this;
   }
   
   // allows client to set y
   public Point setY( double y )   {
       this.y = y;
       return this;
   }
   
   // toString: returns a String with values of instance variable
   public String toString( )  {
       return "(" + x + ", " + y + ")"; 
    }
}