//Darek Konopka; CS-101; 6/11
//Here we make a nestedloop 

public class NestedLoop { 
    public static void main(String[] args)  { 
    
   //i is the number we start with and j is the number of rows needed for it 
   int num = 16; 

   for (int j = num; j >= 1; j = j/2) {
      for (int i = 1; i <=num ; i = i*2) {
      
         System.out.print(i + " "); //prints numbers for the current line
   
         }
         //divides number by 2 and makes a new line 
         num = num/2; 
         System.out.println( );
      }
   }
}