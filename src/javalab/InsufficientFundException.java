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
public class InsufficientFundException extends Exception {
   private double amount;
   
   public InsufficientFundException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}