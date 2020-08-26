//Darek Konopka; CS-101; 5/18/2020 assignment
//Here we edit the televisionchannel.java and we make a clinet for it 

import java.util.*;

public class TelevisionChannelClient {
   public static void main(String[] args)  { 
      
      //Now I create the two objects for the television Sets
      TelevisionChannel televisionSet1 = new TelevisionChannel();
      TelevisionChannel televisionSet2 = new TelevisionChannel();
      
      //Set new values for any object you created by chaining the three mutator method calls
      televisionSet1.setName("NBC"); 
      televisionSet1.setNumber(24);
      televisionSet1.setCable(false);
      
      //output these new values by calling the toString method.
      System.out.println( televisionSet1.toString( ) + "\n");
      
      //Now repeat with the second object 
      televisionSet2.setName("FOX NEWS"); 
      televisionSet2.setNumber(38);
      televisionSet2.setCable(true);
      
      //output these new values by calling the toString method.
      System.out.println( televisionSet2.toString( ) );
      
      //Now I will call the typeOfChannel method for the second object
      System.out.println( "\nThe channel type for the second object is: " + televisionSet2.typeOfChannel()); 
      
      //********************** Additions past here are made on 5/28 **************************//
      System.out.println("\n****************************************************************************************");
      System.out.println("********************* Here we start the second edit to this code ***********************"); 
      System.out.println("****************************************************************************************");
      
      // Here I make an array for 4 objects 
      TelevisionChannel myObjList[] = new TelevisionChannel[4];
      
      // Since I already have two objects above, I will make 2 more
      TelevisionChannel televisionSet3 = new TelevisionChannel();
      TelevisionChannel televisionSet4 = new TelevisionChannel();
      
      // Then I will assign them some values 
      televisionSet3.setName("Cartoon Network"); 
      televisionSet3.setNumber(64);
      televisionSet3.setCable(false);
      
      televisionSet4.setName("Disney Channel"); 
      televisionSet4.setNumber(3);
      televisionSet4.setCable(true);
      
      // Now I will add all the objects to the array 
      myObjList[0] = televisionSet1; 
      myObjList[1] = televisionSet2;
      myObjList[2] = televisionSet3;
      myObjList[3] = televisionSet4;
      
      System.out.println("\nHere is the array before any sorting \n"); 
      
      // Here I output the list to check so we can prove the selection sort actually works 
      for (int i = 0; i <= myObjList.length-1; i++) {
         System.out.println(myObjList[i] + "\n"); 
      }

      // Here I call the selection sort method with respect to the channel names and output the sorted array
      System.out.println("\nNow here is the array after the selection sort using the Channel names\n");
      TelevisionChannel.selectionSort(myObjList); 
      
      for (int i = 0; i <= myObjList.length-1; i++) {
         System.out.println(myObjList[i] + "\n"); 
      }
      
      // Here I call the bubble sort method that sort the array with respect to the channel numbers and output the sorted array
      System.out.println("\nNow here is the array after the bubble sort using the Channel numbers\n");
      TelevisionChannel.bubbleSort(myObjList);
      
      for (int i = 0; i <= myObjList.length-1; i++) {
         System.out.println(myObjList[i] + "\n"); 
      }
      
   }
}