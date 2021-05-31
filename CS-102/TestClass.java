/*
I am making this to test random code from a quiz
*/

public class TestClass {
   protected double cost;
   protected String color;
   public String jacketType(){
      return "Jacket" + color;
   }
   
   public double price(){
      return cost;
   }
   public double price(double discount){
      return (1.0 -discount) * cost;}// remainder of Coat class omitted
   }
   
   // file Coat.java
   
   public class Leather extends Jacket{
      public double price (double extraCost){
      // code omitted
   }
   
   public String jacketType(){
      return "Leather  " + color;
   }
   // remainder of Leather class omitted.}
}
/*
public class TestClass {
   public static void main( String [] args ) {
   if("Sarah" == "Sarah"){
   System.out.println("1"); 
   }
   if("Sarah".equals("Sarah")){
   System.out.println("2"); 
   }
   if("Sarah" == "Sarah") {
   System.out.println("3"); 
   }
   }
}
*/