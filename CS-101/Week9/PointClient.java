// Darek Konopka; CS-101; Programming activity 6/1
// Here is the client class to out Point Class
// Here we create a 2D array of objects, and print the values

public class PointClient {
   public static void main( String [] args )   {

      // Create two dimensional array 
      Point [][] twoDimensinalArray = new Point [6][4]; // 6 rows, 4 collumns 
   
      for ( int i = 0; i < twoDimensinalArray.length; i++) {
         for (int j = 0; j < twoDimensinalArray[i].length; j++) {
            twoDimensinalArray[i][j] = new Point();
         }
      }
   
      /* x = a + 0.1*b and y = 5x if the point is
      in the b-th column of the a-th row. Note that the element arrayName[0][0] is considered in
      the first column of the first row  */ 
   
      for ( int i = 1; i < twoDimensinalArray.length+1; i++) {
         for (int j = 1; j < twoDimensinalArray[i-1].length+1; j++) {
            
            // i and j start at 1, but an array starts at [0][0] 
            twoDimensinalArray[i-1][j-1].setX( i + 0.1 * j ); 
            twoDimensinalArray[i-1][j-1].setY( 5 * ( i + 0.1 * j )); 
         }
      }
            
      // Output the results
      for ( int i = 0; i < twoDimensinalArray.length; i++) {
         for (int j = 0; j < twoDimensinalArray[i].length; j++) {
            System.out.print(twoDimensinalArray[i][j].toString()); 
         }
         System.out.println(""); 
      }
   }
}