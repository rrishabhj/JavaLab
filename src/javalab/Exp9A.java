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
public class Exp9A {
    
    public static void main(String[] args) {
        
         Thread obj=new Thread(new Runner2());
        Thread obj2=new Thread(new Runner2());
        
        obj.start();
        obj2.start();
    }
    
}

class Runner2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
              
            }
        }
    }
}
