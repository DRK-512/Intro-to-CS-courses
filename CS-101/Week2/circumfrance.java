//In class exmaple 4/16 part 2
//Here we will find the circumfrance of a circle with 3.85in as the radius

public class circumfrance{

   public static void main (String [] args){
   //Define variables
   final double PI = 3.14159; 
   float radius = 3.85f; 
   
   //Now lets compute the circumefrance and area (we use double since PI is a double) 
   double circumfrance = (2*radius*PI);
   double area = (PI*(radius*radius)); 
   
   //And lastly let's print the the results
   System.out.println("A circle with a radius of " + radius + " inches has");
   System.out.println("a circumefrance of " + circumfrance + " inches and");
   System.out.println("an area of " + area + " square inches");
   
   }
}