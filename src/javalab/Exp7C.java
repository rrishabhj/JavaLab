/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.io.*;
/**
 *
 * @author rishabh
 */
public class Exp7C {
    
    private double balance;
   private int number;
   
   public Exp7C(int number) {
      this.number = number;
   }
   
   public static void main(String [] args) {
      Exp7C c = new Exp7C(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      }catch(InsufficientFundException e) {
         System.out.println("Sorry, but you are short $" + e.getAmount());
         System.out.println("Error!! Rolling back changes...");
         e.printStackTrace();
      }finally{
          
          System.gc();
      }

   }
   
    public void finalize(){
        System.out.println("cleaning garbage!");
    }
    
    public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) throws InsufficientFundException {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double needs = amount - balance;
         throw new InsufficientFundException(needs);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
   public int getNumber() {
      return number;
   }
}