//Darek Konopka; CS-101
//Question 9 on quiz 1

public class AreaAndPerimeter {
   public static void main ( String [] args ) { 
   
   //Declare variables
   int WidthFoot = 3; 
   int WidthInch = 10; 
   int HeightFoot = 5; 
   int HeightInch = 6; 
   
   //Convert into cm
   double WidthFootCm = (WidthFoot*12*2.54); 
   double WidthInchCm = (WidthInch*2.54);
   double HeightFootCm = (HeightFoot*12*2.54);
   double HeightInchCm = (HeightInch*12*2.54);
   
   //Calculate Area and Perimeter
   float Perimeter =(float) (2*(WidthFootCm + WidthInchCm + HeightFootCm + HeightInchCm)); 
   float Area = (float)((WidthFootCm + WidthInchCm) * (HeightFootCm + HeightInchCm));
   System.out.println("The perimeter is: " + Perimeter + "\nThe area is: " + Area);  
   }
}