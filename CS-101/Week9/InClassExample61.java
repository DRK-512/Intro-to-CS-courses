//In Class Example on 2D arrays 

public class InClassExample61
{
 public static void main( String [] args )
 {
      double [] [] a1; 
      int [] [] a3 = new int [4][]; // [][4] will not work 
      a3[0] = new int [2]; 
      a3[1] = new int [3]; 
      a3[2] = new int [1]; 
      a3[3] = new int [3]; 
      
      a1 = new double [3][4]; 
      
      int [][] a2 = { {1, 2, 3}, {4, 5, 6, 9}, {7, 8} }; 
       
      // Prints out length of 2nd row 
      System.out.println(a2[1].length); 
      
      a1[0][0] = 45.24; 
      
      /*
      // Here we make a 2D list using an object, but I do not have a class file 
      Auto [][] cars = new Auto[2][3]; 
      cars[0][0] = new Auto(); 
      cars[1][1] = new Auto("BMW", 100, 15.0); 
      
      System.out.print(cars[0][1]); 
      */
      
      
      // Now we will be summing a 2D list
      int sum = 0; 
      for ( int i = 0; i < a2.length; i++) {
         for (int j = 0; j < a2[i].length; j++) {
            sum += a2[i][j]; 
         }
      }
      System.out.println(sum); 
      
      // First I will get the max collumn size
      int maxC = 0; 
      for ( int i = 0; i < a2.length; i++) {
         if (maxC < a2[i].length) {
            maxC = a2[i].length; 
         }
      }
      
      // Now I will print the whole list 
      for ( int j = 0; j < maxC; j++) {
         for ( int i = 0; i < a2.length; i++) {
            if ( j < a2[i].length ) {
               System.out.println( a2 [i][j] + " "); 
            }
         }
      }
   }
}

/* If in a class 
check the tally class in the source code */ 

