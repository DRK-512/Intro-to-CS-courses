// Darek Konopka; CS-101
// This is a subclass of the person class
// Here we define a faculty member of the school 

// Data: 
// rank; char; This is the rank the professor is
// tempRank; String; This is used as a temporoary varible for defining the rank later EX: t = assistant professor

public class Faculty extends Employee {

   // Fields 
   private char rank; // either ‘t’ for assistant professor, ‘c’ for associate professor, ‘p’ for full professor, ‘l’ for lecturer, or ‘r’ for researcher
   private String tempRank; 
  
   public Faculty(String firstName, String lastName, String email, String office, int hiringYear, char rank)   {

      super(firstName, lastName, email, office, hiringYear);
      this.rank = rank;
   }
   
   // accessor methods:
   public char getRank(){
      
      return rank; 
   }
   
   // mutator method:
   public void setRank (char rank)   {

      this.rank  = rank;
   } 
   
   // Overriding toString method 
   @Override
   public String toString()   {
   
      switch(rank)   {
      
         case 't':
            tempRank = "assistant professor";
            break;
         case 'c':
            tempRank = "associate professor"; 
            break;
         case 'p':
            tempRank = "full professor"; 
            break;
         case 'l':
            tempRank = "lecturer";
            break; 
         case 'r':
            tempRank = "researcher"; 
            break;
         
         default:
            tempRank = "The input is invalid";
            break;
      }
      
      return "\nFaculty" + super.toString() + "\n\tRank: " + tempRank + "\n"; 
   }  




}