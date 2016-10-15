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
public class Exp5C extends Game{
 
    public void type()
 {  System.out.println("outdoor game"); }

 public static void main(String[] args)
 {
   Game gm = new Game();
   Exp5C ck = new Exp5C();
   gm.type();
   ck.type();
   gm=ck;
   gm.type();  
 }
}


