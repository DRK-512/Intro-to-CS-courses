// Darek Konopka; CS-101; 6/4 excersice
// This is a subclass of the Shape Class
// We use this to make the shape always a rectangle 


public class Rectangle extends Shape {

   // feilds 
   private double width; 
   private double height; 
   
   // default constructor 
   public Rectangle () {
     
      super(); // this calls the shape constructor 
      width = 1; 
      height = 1; 
   }
   
   // Overload constuctor 
   public Rectangle (String color, boolean filled, double width, double height) {
      super ( color, filled ); 
      this.width = width; 
      this.height = height;  
   }
   
   // accessor method 
   public double getWidth() {
      return width; 
   }
   
   // accessor method
   public double getHeight() {
      return height; 
   }
   
   // mutator method 
   public Rectangle setWidth( double width ) {
   
      this.width = width; 
      return this; 
   }
   
   // mutator method 
   public Rectangle setHeight( double height ) {
   
      this.height = height; 
      return this; 
   }
   
   // toString override method 
   @Override
   public String toString() {
   
      return super.toString() + 
            "\nWidth: " + width + 
            "\nHeight: " + height; 
   }
   
   //An overriding equals(Object objectReference) method 
   public boolean equals( double inputWidth, double inputHeight ) {
      
      // Here we compare the values of the input with the values in the class
      if (( width == inputWidth )  && (height == inputHeight)) {
         return true;
      } else {
         return false;
      }
   }
} 
 