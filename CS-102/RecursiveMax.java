
class RecursiveMax {

   // this functino gets the min of two numbers
    public static int getMin(int a, int b){ 
       if((a-b)>0){
         return a; 
       }else{
         return b; 
       }
     } 
  
    // function to return minimum element using recursion
    public static int findMaxRec(int []arr, int first, int last)
    { 
      // we are done if last is 0 
      if(last == 1){
        return arr[0];
      }else{
        return getMin(arr[last-1], findMaxRec(arr, first, last-1));
        }
    }
     
    // main function
    public static void main(String args[])
    {
        int A[] = {111, 19, 8, 1, -10, 4, -101, 10};
        int n = A.length;
         
        // recursive function calling
        System.out.println(findMaxRec(A, 1, n));
    }
}
 