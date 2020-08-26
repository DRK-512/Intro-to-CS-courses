public class BankAccount
{
   private double balance;

   public BankAccount( )
   {
      balance = 0.0;
   }

   public BankAccount( double balance )
   {
      deposit( balance );
   }

   public double getBalance( )
   {
      return balance;
   }

   public BankAccount deposit( double amount )
   {
      if ( amount >= 0.0 )
         balance += amount;  
      return this;
  }

   public BankAccount withdraw( double amount )
   {
      if ( amount >= 0.0 && amount <= balance )
         balance -= amount; 
      return this;
   }

   @Override
   public String toString( )
   {
      return "balance is " + balance;
   }
  
}