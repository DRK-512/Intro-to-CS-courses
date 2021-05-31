
// Class including various implementations (iterative/recursive) of math functions.
public final class Math {

   public static int counter; // Counter to perform a simple performance analysis.
   
   // Desc.: Computes a^b (a at the power of b).
   // Input: The base a and the exponent b (assuming b >= 0).
   // Note: Iterative implementation (version 1).
   public static int powIter1( int a, int b ) {
      // Check special cases.
      if( b == 0 ) { return 1; }
      else {
         // Here b is > 0.
         int temp = 1;
         // Loop to perform multiplications as needed.
         for( int i = 0; i < b; i++ ) {
            Math.counter++; 
            temp = temp * a;
         }
         // Return result.
         return temp;
      }
   }
   
   // Desc.: Computes a^b (a at the power of b).
   // Input: The base a and the exponent b (assuming b >= 0).
   // Note: Iterative implementation (version 2).
   public static int powIter2( int a, int b ) {
      // Check special cases.
      if( b == 0 ) { return 1; }
      else {
         // Here b is > 0.
         int temp = a;
         // Loop to perform multiplications as needed.
         for( int i = 1; i < b; i++ ) {
            Math.counter++; 
            temp = temp * a;
         }
         // Return result.
         return temp;
      }
   }
   
   // Desc.: Computes a^b (a at the power of b).
   // Input: The base a and the exponent b (assuming b >= 0).
   // Note: Recursive implementation (version 1).
   public static int powRec1( int a, int b) {
      // Check special cases.
      if( b == 0 ) { return 1; } // Base case.
      else if( b == 1 ) { return a; } // Base case.
      else {
         // Here b > 1.
         Math.counter++; 
         return a * powRec1( a, b-1 ); // Recursive call.
      }
   }
   
   // Desc.: Computes a^b (a at the power of b).
   // Input: The base a and the exponent b (assuming b >= 0).
   // Note: Recursive implementation (version 2).
   public static int powRec2( int a, int b) {
      // Check special cases.
      if( b == 0 ) { return 1; } // Base case.
      else if( b == 1 ) { return a; } // Base case.
      else {
         // Here b > 1.
         // Check if b is odd or even.
         if( b % 2 == 0 ) {
            // Here b > 1 AND even.
            Math.counter++; 
            return powRec2( a, b/2 ) * powRec2( a, b/2 ); // 2 recursive calls.
         }
         else {
            // Here b > 1 AND odd.
            Math.counter++; 
            Math.counter++; 
            return a * powRec2( a, (b-1)/2 ) * powRec2( a, (b-1)/2 ); // 2 recursive calls.
         }
      }
   }
   
   // Desc.: Computes a^b (a at the power of b).
   // Input: The base a and the exponent b (assuming b >= 0).
   // Note: Recursive implementation (version 3).
   public static int powRec3( int a, int b) {
      // Check special cases.
      if( b == 0 ) { return 1; } // Base case.
      else if( b == 1 ) { return a; } // Base case.
      else {
         // Here b > 1.
         // Check if b is odd or even.
         if( b % 2 == 0 ) {
            // Here b > 1 AND even.
            int temp = powRec3( a, b/2 ); // Recursive call.
            Math.counter++; 
            return temp * temp;
         }
         else {
            // Here b > 1 AND odd.
            int temp = powRec3( a, (b-1)/2 ); // Recursive call.
            Math.counter++; 
            Math.counter++; 
            return a * ( temp * temp );
         }
      }
   }
   
   

}
