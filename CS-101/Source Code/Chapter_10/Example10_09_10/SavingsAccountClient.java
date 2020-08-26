// In class notes 6/4 on super classes 

public class SavingsAccountClient {
   public static void main ( String [] args ) {
   
   SavingsAccount s1 = new SavingsAccount(200, 0.05); 
   
   System.out.println(s1.getBalance());  
   s1.applyInterestRate();
   System.out.println(s1);
   s1.deposit(100); 
   System.out.println(s1); 
   s1.withdraw(50); 
   System.out.println(s1);  
   
   }
}