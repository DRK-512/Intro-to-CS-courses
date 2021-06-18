package Heap; 
import java.lang.Exception;

/*
This class is going to be used to create the heapInsert and heapDelete methods
*/

public class HeapMethods {

   /* Global Varibles */
   private int items[];
   private int itemSize;
   private final int arraySize = 20;  
 
   /* Defualt Constructor */
   public HeapMethods() {
      this.items = new int[arraySize+1]; // add 1 since element 0 is used as a placeholder for the parents of 1
      this.itemSize = 0;  
      items[0] = Integer.MAX_VALUE;   
   }
   
   /* returns true if the array is empty */
   private boolean isEmpty() {
      return(itemSize==0); 
   }
  
    /* return position of parent */
    private int parent(int pos) { return pos / 2; }
  
    /* return leftChild */
   private int leftChild(int pos) { 
      return (2 * pos); 
   }
    
    /* return rightChild */
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }
  
   /* Inserts a new element to max heap */
   public void heapInsert(int newKey) throws HeapException {
    
      // if we go over the max, we throw an exception 
      if(itemSize > arraySize) {
        throw new HeapException("ERROR"); 
      
      } else {

         // set element in items array 
         items[++itemSize] = newKey;
         int current = itemSize; 
         
         //element 0 is used as a placeholder for the parents of 1, so the Heap can be fit correctly but the items list will not
         while (items[current] > items[parent(current)]) {
             swap(current, parent(current));
             current = parent(current);
            
         }
         
      }
   }
      
   /* retrieves and then deletes a heap’s root
   item. This item has the largest search key */
   public void heapDelete() {

      // check if empty array
      if(isEmpty())
         return; 
      else{
        // heapDeleteRec(1); // 0 should be the largest element in the heap
         items[1] = items[itemSize--];
         heapDeleteRec(1);
      }
   }
     
   /* A recursive function to for heapDelete */
   private void heapDeleteRec(int pos) {
   
      if (isLeaf(pos))
         return;
  
      if (items[pos] < items[leftChild(pos)] || items[pos] < items[rightChild(pos)]) {
  
         if (items[leftChild(pos)] > items[rightChild(pos)]) {
            swap(pos, leftChild(pos));
            heapDeleteRec(leftChild(pos));
         } else {
            swap(pos, rightChild(pos));
            heapDeleteRec(rightChild(pos));
         }
      }
   }

   /* checks if current element is a leaf */
   private boolean isLeaf(int pos) {
      if (pos > (itemSize / 2) && pos <= itemSize) 
         return true;
   
      return false;
   }
  
 /* switches position of first and second element */
    private void swap(int fpos, int spos)
    {
        int temp;
        temp = items[fpos];
        items[fpos] = items[spos];
        items[spos] = temp;
    }
}