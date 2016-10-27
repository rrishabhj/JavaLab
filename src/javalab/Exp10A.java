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
public class Exp10A extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getPriority());
		try {
        		Thread.sleep(1000);
    		}
    		catch(InterruptedException ie) { }
       		System.out.println("r2 ");
  	}
	public static void main(String[] args)
	{
		Exp10A t1=new Exp10A();
		Exp10A t2=new Exp10A();
		
                t1.setPriority(9);
                t2.setPriority(1);
                t1.start(); 
		t2.start();
            try {
                t1.join();
                
            } catch (InterruptedException ex) {
               
            }
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}