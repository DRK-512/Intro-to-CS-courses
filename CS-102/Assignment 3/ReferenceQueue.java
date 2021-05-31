/*  

* Name: Darek Konopka     
* Date: 5/5/2021
* Question number: 1
* Description: In this code we will do the following:

1)(20 points) Write a reference-based implementation of a queue that uses a linear linked list to represent the items in the queue. 
You will need both a head reference and a tail reference. 
When you are done, compare your implementation to the circular linked list
with one external reference. Which implementation is easier to write? Which is easier to understand? Which is more efficient?
*/

  
import java.util.*;
import Queue.*; 

public class ReferenceQueue {
    public static void main(String args[])   {
    
         // Create a queue
        QueueReferenceBased q1 = new QueueReferenceBased();
  
        // enqueue some stuff into the queue
        q1.enqueue(new String("A")); // Head
        q1.enqueue(new String("B"));
        q1.enqueue(new String("C"));
        q1.enqueue(new String("D")); // Tail
        
        System.out.println(q1.peek()); 
        
        // dequeue some stuff
        String s1 = (String) q1.dequeue(); 
        String s2 = (String) q1.dequeue(); 
        String s3 = (String) q1.dequeue(); 
       
        // here I check if you actually dequeued correctly 
        System.out.println(s1); 
        System.out.println(s2); 
        System.out.println(s3);
        
        // check if the peek works as well
        System.out.println(q1.peek());  
    }
}

