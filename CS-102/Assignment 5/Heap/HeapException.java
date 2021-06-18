package Heap;

import java.lang.Exception;

// Exception (critical) for runtime errors of heap operations.
public class HeapException extends Exception {

   // Constructor.
   public HeapException( String s ) { 
      super(s);
   }
}