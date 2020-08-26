//Darek Konopka; CS-101; 5/20 programming activity 
//Here is the client for the Rectangle class we made

public class RectangleClassClient {
   public static void main(String[] args)  { 
   
      // Now I create the two objects
      RectangleClass rectangle1 = new RectangleClass();
      RectangleClass rectangle2 = new RectangleClass();

      // Use any object reference to get and output its width and height values.
      rectangle1.getWidth();
      rectangle1.getHeight();
      
      System.out.println("The parameters of the first Rectangle Object are:\n" + rectangle1.toString() + "\n"); 
       
      // Set new values for any object and output the new width and height values. 
      rectangle2.setWidth(5.0);
      rectangle2.setHeight(6.0);
      
      System.out.println("The parameters of the second Rectangle Object are:\n" + rectangle2.toString() + "\n"); 
      
      // Compare the data values of any two Rectangle objects you created by calling the equals method and output the return value
       if ( rectangle1.equals( rectangle2 ) ) {
        System.out.println( "Rectangle Object 1 and Rectangle Object 2 are equal" );
      } else { 
        System.out.println( "Rectangle Object 1 and Rectangle Object 2 are not equal" );
      }
      
     
      // Find the number of Rectangle objects you created by calling the static method and output the return value.
      System.out.println("There were " + rectangle1.counter + " objects created\n"); //I added a third object to test if it worked, and it did

      // Use any object reference to find and output the area and perimeter of the rectangle by calling the last two methods.
      
      System.out.println("The area of the second rectangle object is: " + rectangle2.getArea());
      System.out.println("The perimeter of the second rectangle object is: " + rectangle2.getPerimeter()); 
      
  }
}
