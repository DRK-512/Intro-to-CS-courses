//Darek Konopka; CS-101; 5/14 in class activity
//The purpose of this is to create a class for Television sets 

import java.util.*;

public class TelevisionChannel {
    
    //instance variables/ fields 
    public String name;       //  which stores the channel name
    public int number;       //  which stores the channel number
    public boolean cable;   //  which represents whether the channel is a cable channel.

    // A default constructor with the following initial values: empty String for name, 0 for
    // number, and false for cable.
    public TelevisionChannel() {
       name = "";
       number = 0; 
       cable = false; 
    }    

    // Overloaded constructor:
    // allows client to set beginning values for
    // name, number, cable 
    public TelevisionChannel( String startName, int startNumber, boolean startCable)   {
       name = startName; 
       number = startNumber; 
       cable = startCable; 
    }
//******************************* Accessor Method ********************************//    
    // Accessor Method:
    // returns current value of name
    public String getChannelName( )
    {
       return name;
    }
    // Accessor Method:
    // returns current value of number
    public int getChannelNumber( )
    {
       return number;
    }
    // Accessor Method:
    // returns current value of cable 
    public boolean getChannelCable( )
    {
       return cable;
    }
    
//******************************* Mutator Method ********************************//     
    // Mutator Method:
    // allows client to set model
    public TelevisionChannel setName( String newName )
    {
        this.name = newName;
        return this;
    }
    // Mutator Method:
    // allows client to set model
    public TelevisionChannel setNumber( int newNumber )
    {
        this.number = newNumber;
        return this;
    }
    // Mutator Method:
    // allows client to set model
    public TelevisionChannel setCable( boolean newCable )
    {
        this.cable = newCable;
        return this;
    }
    
    // Determines if we are using network or cable
    public String typeOfChannel( )
    {
       if ( cable == true )
           return "cable";
       else
           return "network";
    }
    
    // toString: returns a String of instance variable values
    @Override
    public String toString( )
    {
       
       return "Channel Name: " + name
             + "\nChannel Number : " + number
             + "\nType of Channel: "
             + typeOfChannel();
    }
    
    //************************************** Classes made 5/28 *************************************//
    
    // This is a selection sort method that I use to sort the Channel names 
    public static void selectionSort( TelevisionChannel[] array )   {
   
    // Here we find the string reference that should go in each cell of the array, from 0 to the end
    for ( int j=0; j < array.length-1; j++ )    {
    
         // This is the index of the string reference that should go into cell j.
         int min = j;
         
         // Here is where we iterate to sort
         for ( int k=j+1; k < array.length; k++ ) {
            if ( array[k].getChannelName().compareTo( array[min].getChannelName() ) < 0 ) min = k;  
         }
         
         // Swap the reference at j with the reference at min 
         TelevisionChannel temp = array[j];
         array[j] = array[min]; 
         array[min] = (temp); 
      }  
   }
   
   // This is a Bubble Sort method used to sort the  
   public static void bubbleSort(TelevisionChannel[] array) { 
      int n = array.length; 
      TelevisionChannel temp; 
      
      // Here we locate where the integers are higher, then move it to the coresponding spot 
      for (int i = 0; i < n-1; i++) {
         for (int j = 0; j < n-i-1; j++) {
            if (array[j].getChannelNumber() > array[j+1].getChannelNumber()) {
                 
                    // swap array[j+1] and array[j] 
                    temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] =(temp); 
            } 
         }
      }
   } 
}    
      
