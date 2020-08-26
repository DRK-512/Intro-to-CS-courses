import java.io.*;
import java.util.*;

public class CSMidterm{
   static int[] getSumAndSub(int a, int b) 
    { 
        int[] ans = new int[2]; 
        ans[0] = a + b; 
        ans[1] = a - b; 
  
        // returning array of elements 
        return ans; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int[] ans = getSumAndSub(100, 50); 
        System.out.println("Sum = " + ans[0]); 
        System.out.println("Sub = " + ans[1]); 
    } 
} 