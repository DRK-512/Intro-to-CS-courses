//Darek Konopka; CS-101; Inclass activity Part 2 5/13
//This code is basically making an array with nested loops 

public class NestedLoopfun { 
    public static void main(String[] args)  { 
    
   //i is the number we start with and j is the number of rows needed for it 
   int num = 16; 
   
   for (int j = num/2; j >= 0; j--) {
      for (int i = num; i >=0 ; i = i-2) {
      
         System.out.print(i + " "); //prints numbers for the current line
   
         }
         //decreases number by 2 and makes a new line 
         num = num-2; 
         System.out.println( );
      }
   }
}