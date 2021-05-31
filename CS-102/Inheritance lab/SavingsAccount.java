/* SavingsAccount class
* 
* Name: Darek Konopka     
* Date: 4/7/2021
* Question number: 1
* Description: This code acts as a savings account for a users bank account when using the CheckingAccountClient .java file
* I do want to inform you that I modifed the code for checkingAccountClient to test this code, and it runs as expected
*
*/

import java.text.DecimalFormat;

// 1. ***** indicate that SavingsAccount inherits from BankAccount

public class SavingsAccount extends BankAccount
{
/****************************** Question 2 ********************************/
   public final double DEFAULT_RATE = .03;
   // 2. ****** define the private interestRate instance variable
   // interestRate, a double, represents an annual rate
   private double interestRate; // This represents an annual rate
   private double monthlyInterestRate; 

/****************************** Question 3 ********************************/
   // 3 ***** write the default constructor
   /** default constructor
   *   explicitly calls the BankAccount default constructor
   *   set interestRate to default value DEFAULT_RATE
   *   print a message to System.out indicating that this
   *     constructor is called
   */
   
   public SavingsAccount( )
   {
       super( ); // optional
       interestRate = DEFAULT_RATE;
       System.out.println("The default constructor was called");
        
   }
  
  /****************************** Question 4 ********************************/
 
   // 4 ***** write the overloaded constructor
   /** overloaded constructor
   *   explicitly call BankAccount overloaded constructor
   *   call setInterestRate method, passing interestRate
   *   print a message to System.out indicating that this
   *     constructor is called
   *  @param  balance      starting balance
   *  @param  interestRate starting interest rate
   */
   
   public SavingsAccount( double balance,
                           double interestRate )
   {
      super( balance ); // call BankAccount constructor
      setInterestRate( interestRate );
      System.out.println("The overload constructor has been called");
      monthlyInterestRate = interestRate / 12;
   }
   
  /****************************** Question 5 ********************************/
   // 5 ****** write this method:
   /** applyInterest method, no parameters.
   *   call the deposit method, passing a month's worth of interest
   *   remember that the interestRate instance variable is the annual rate
   *   
   *   @return a reference to this object 
   */
   public SavingsAccount applyInterestRate( )
   {
      
     deposit( monthlyInterestRate ); // Since we pass a months worth of interest, and interestRate is for 12 months, 
    
     return this;
   }

   /** accessor method for interestRate
   *  @return  interestRate
   */
   public double getInterestRate( )
   {
     return interestRate;
   }
   
   public double getMonthlyInterest ()
   {
      return monthlyInterestRate; 
   }

   /** mutator method for interestRate
   *  @param  interestRate new value for interestRate
   *          interestRate must be >= 0.0
   *            if not, do not change the value
   *          stores interestRate as input value / 100
   *          that is, 3.5 is stored as .035
   *  @return  a reference to this object
   */
   public SavingsAccount setInterestRate( double interestRate )
   {
     if ( interestRate >= 0.0 )
        this.interestRate = interestRate / 100;
        
     return this;
   }

/****************************** Question 6 ********************************/
   // 6 *****  write this method
   /* toString method
   *  @return a String containing formatted balance and interestRate
   *    invokes superclass toString to format balance
   *    formats interestRate as percent using a DecimalFormat object
   *    To create a DecimalFormat object for formatting percentages
   *    use this pattern in the constructor: "0.00%"
   */
   
   @Override
   public String toString() {
   
   return super.toString() + 
          "\nInterest rate is " + (interestRate) + "%"; 
   }
   
   
}
