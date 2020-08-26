//Print class example

public class Print
{
   private String s;
   public Print ( )
   { }
   public Print ( String s ) 
   { 
      this.s = s;
   }
   public void print ( )
   {  
      System.out.println( s );
   }
   @Override
   public String toString ( )
   {
      return s;
   }  
}