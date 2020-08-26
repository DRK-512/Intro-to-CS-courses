// Darek Konopka; CS-101; 6/4 excersice
// This is the super class to the shape example
// We use this class to define a shape

public class Shape {

   private String color; 
   private boolean filled; 
   
   // default constuctor
   public Shape() {
   
      color = "white"; 
      filled = false;  
   }
   
   // Overload constructor 
   public Shape (String color, boolean filled) {
      this.color = color; 
      this.filled = filled; 
   }
   
   // Accessor method 
   public String getColor() {
      return color; 
   }
   
   // Accessor method
   public boolean getFilled() {
      return filled; 
   }
   
   // Mutator method 
   public Shape setColor( String color ) {
      this.color = color; 
      return this; 
   }
   
   // Mutator method 
   public Shape setFilled( boolean filled ) {
      this.filled = filled; 
      return this; 
   }
   
   // toString method 
   @Override
   public String toString() {

      return "Color: " + color + 
          "\nFilled: " + filled; 
   }
   
  //An overriding equals(Object objectReference) method 
  public boolean equals( Object o ) {
      // if o is not a RectangleClass object, return false
      if ( ! ( o instanceof Shape ) ) {
         return false;
         
      } else {
         // type cast o to a RectangleClass object
         Shape myShape = ( Shape ) o;
         if (( color == myShape.color )  && (color == myShape.color)) {
            return true;
         } else {
            return false;
         }
      }
   }
}