public class CheckingAccount extends BankAccount
{
   public final double DEFAULT_FEE = 5.00;
   private double monthlyFee;
   
   public CheckingAccount( )
   {
      super( );
      monthlyFee = DEFAULT_FEE;
   }

   public CheckingAccount( double balance, double monthlyFee )
   {
      super( balance );
      setMonthlyFee( monthlyFee );
   }

   public CheckingAccount applyMonthlyFee( )
   {
      withdraw( monthlyFee );
      return this;
   }

   public double getMonthlyFee( )
   {
      return monthlyFee;
   }

   public CheckingAccount setMonthlyFee( double monthlyFee )
   {
      if ( monthlyFee >= 0.0 )
         this.monthlyFee = monthlyFee;    
      return this;
   }

   @Override
   public String toString( )
   {
      return super.toString( )
             + "; monthly fee is " + monthlyFee;
   }
   
}