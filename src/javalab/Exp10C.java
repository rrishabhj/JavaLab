/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author rishabh
 */
public class Exp10C {
    
    public static void main(String[] args) {
        
          
    final String resource1 = "RIshabh JIndal";  
    final String resource2 = "Ankit Jindal";  
    
    Thread t1 = new Thread() {  
      public void run() {  
          synchronized (resource1) {  
           System.out.println("Thread 1: locked resource 1");  
  
           try { Thread.sleep(100);} catch (Exception e) {}  
  
           synchronized (resource2) {  
            System.out.println("Thread 1: locked resource 2");  
           }  
         }  
      }  
    };
    
    Thread t2 = new Thread() {  
      public void run() {  
        synchronized (resource2) {  
          System.out.println("Thread 2: locked resource 2");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource1) {  
            System.out.println("Thread 2: locked resource 1");  
          }  
        }  
      }  
    };  
  
      
    t1.start();  
    t2.start();  
    }
    
}
