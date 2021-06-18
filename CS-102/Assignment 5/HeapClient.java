/*
   * Name:  Darek Konopka  
   * Date:  6/8/2021
   * Question Number: 1 & 2
   * Description: In this assignment I will be designing and implementing
   * heapInsert and heapDelete  

*/

import Heap.HeapException; 
import Heap.HeapMethods; 

public class HeapClient {
   public static void main(String[] args) {
   
      // create input array and Heap object
      int inputArray[] = {25, 12, 8, 32, 46, 17, 15, 30, 27, 10, 11, 9 ,52, 55, 50, 39};
      HeapMethods heap = new HeapMethods();
      
      // insert new number into heap
      try{
      
      // set the array of the heap with inserts
         for(int i = 0; i < inputArray.length; i++ ) {
            
            heap.heapInsert( inputArray[i] );
         }
      } catch (HeapException e) {
         System.out.println("The array cannot have more than 10 elements in your array");
      }
     
      // delete largest number from heap
      heap.heapDelete(); 
   
   }
}

