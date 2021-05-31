/* CheckingAccount Client 

  Name: Darek Konopka     
* Date: 4/7/2021
* Question number: 1
* Description: This code is used for testing the CheckingAccount an SavingAccount classes
*/

public class CheckingAccountClient
{
   public static void main( String [] args )
   {
   
   // Testing CheckingAccount class
     CheckingAccount c3 = new CheckingAccount( 100.00, 7.50 );
     System.out.println( "New checking account:\n"
                          + c3.toString( )
                          + "; monthly fee is "
                          + c3.getMonthlyFee( ) );

     c3.applyMonthlyFee( );  // charge the fee to the account
     System.out.println( "\nAfter charging monthly fee:\n"
                          + c3.toString( )// supper class, is a method of BankAccount
                          + "; monthly fee is "
                          + c3.getMonthlyFee( ) ); // subclass, is a method of checkingAccount
                          
   // Testing SavingsAccount class     
      SavingsAccount s3 = new SavingsAccount ( 100.00, 6 ); // initial balance, %interest 
      System.out.println( "\nNew savings account:\n"
                          + s3.toString( )
                          + "; monthly fee is "
                          + s3.getMonthlyInterest( ) );

     s3.applyInterestRate( );  // charge the fee to the account
     System.out.println( "\nAfter adding monthly interest:\n"
                          + s3.toString( )// supper class, is a method of BankAccount
                          + "; interest rate is "
                          + s3.getInterestRate( ) ); // subclass, is a method of checkingAccount
                      
   }
}
