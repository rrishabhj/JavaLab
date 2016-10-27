/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
public class Exp10B {

    private int count=0;
    public static void main(String[] args) {
        
        Exp10B obj=new Exp10B();
        obj.doWork();
    }
    
    public void doWork(){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    increment();
                }
            }
        });
 
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100000;i++){
                    increment();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            
        }
       
        
        System.out.println("count:"+count);
    }
    
    public synchronized  void increment(){
        
        count++;
    }
}
