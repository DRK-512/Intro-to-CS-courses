// In class notes 6/4 on super classes 

public class SavingsAccount extends BankAccount    {
   public final double DEFAULT_RATE = 0.03; 
   private double interestRate; 
   
   // Default constructor
   public SavingsAccount() {
      interestRate = DEFAULT_RATE; 
   }
   
   // Overloaded constcutor
   public SavingsAccount (double balance, double interestRate) {
      super ( balance ); 
      this.interestRate = interestRate; 
   }
   
   // Accessor method 
   public double getInterestRate() {
      return interestRate; 
   }
   
   // Mutator method 
   public SavingsAccount setInterestRate( double interestRate ) {
      
      if (interestRate >= 0.0) {
         this.interestRate = interestRate; 
      }
      return this; 
   }
   
   public SavingsAccount applyInterestRate() {
   
      deposit( getBalance() * interestRate ); 
      return this; 
   }
   
   @Override
   public String toString() {
   
   return super.toString() + 
          "\nInterest rate is $" + (interestRate); 
   }
 }