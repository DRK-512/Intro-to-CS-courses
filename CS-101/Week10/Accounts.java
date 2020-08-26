// Darek Konopka; CS-101; Sample Final
// Here we take an array of accounts and we play with the banking classes

import java.io.*;
import java.util.*;

public class Accounts {
   public static void main(String[] args)  { 
      
      // Define varibles
      BankAccount accounts[] = new BankAccount[5];     
      double temp; 
      
      // Prompt user for data
      for (int i=0; i<accounts.length; i++) {
         Scanner input = new Scanner(System.in); 
         System.out.print("Enter your balance: ");
         double balance = input.nextDouble();
         System.out.print("Enter a monthly fee: ");
         double monthlyFee = input.nextDouble();
         
         CheckingAccount var = new CheckingAccount(balance, monthlyFee); 
         accounts[i] = var; 
      }
   
      // Now we sort the array, I used bubble sort
      for (int i = 0; i < (accounts.length - 1 ); i++) {
         for (int j = 0; j < accounts.length - i - 1; j++) {
           if (accounts[j].getBalance() < accounts[j+1].getBalance()) 
           {
             temp = accounts[j].getBalance();
             accounts[j].deposit(accounts[j+1].getBalance());
             accounts[j+1].deposit(temp);
           }
         }
       }
       
      // Now I output the results after the sort
      for (int i=0; i<accounts.length; i++) {
         System.out.println(accounts[i].toString()); 
         
      }
   }
}