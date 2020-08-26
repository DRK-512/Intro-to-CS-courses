//Darek Konopka; CS-101; 5/20 programming activity 
//Here we create and play with a rectange class
//This gets a width and height, adn we can output the perimeter and the area from it 

public class RectangleClass {

   // Instance variables fields 
   private double width;        //  which stores the rectangle width
   private double height;       //  which stores the rectangle height
   public static int counter = 0;           //  which counts the number of rectangle objects created by client 

//******************************* Constructors ********************************//

   // Default constructor 
   // Sets default values for width and height 
   public RectangleClass() {
       width = 1;
       height = 1;
       counter++;  //Everytime an object is created, the counter goes up
    }
    
    // Overloaded constructor
    // allows client to set beginning values for width and height 
    public void RectangleClass( double startWidth, double startHeight)   {
       width = startWidth; 
       height = startHeight;  
    }

//******************************* Accessor Methods ********************************//
    // Accessor Method:
    // returns current value of width
    public double getWidth( )
    {
       return width;
    }
    
    // Accessor Method:
    // returns current value of height
    public double getHeight( )
    {
       return height;
    }
    
//******************************* Mutator Methods ********************************//
    // Mutator Method:
    // allows client to set model
    public RectangleClass setWidth( double newWidth )
    {
        this.width = newWidth;
        return this;
    }
    
    // Mutator Method:
    // allows client to set model
    public RectangleClass setHeight( double newHeight )
    {
        this.height = newHeight;
        return this;
    }

//******************************* Overriding Methods ********************************//
    
    // toString: returns a String of instance variable values
    @Override
    public String toString( )
    {
       return "Rectangle width: " + String.valueOf(width)
             + "\nRectangle height: " + String.valueOf(height);      
    }
    
  //An overriding equals(Object objectReference) method 
  
  public boolean equals( Object o ) {
   // if o is not a RectangleClass object, return false
   if ( ! ( o instanceof RectangleClass ) ) {
      return false;
      
   } else {
      // type cast o to a RectangleClass object
      RectangleClass objRect = ( RectangleClass ) o;
      if (( width == objRect.width )  && (height == objRect.height)) {
         return true;
      } else {
         return false;
      }
   }
}

//******************************* Calculated Methods ********************************//    
    public double getArea( )
    {
       return (height*width);
    }
    
    public double getPerimeter( )
    {
       return ((height*2) + (width * 2));
    }
}