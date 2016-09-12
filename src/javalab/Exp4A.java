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
public class Exp4A {
  public static void main(String args[]){  
  TestOuter1.Inner obj=new TestOuter1.Inner();  
  obj.msg(); 
  obj.msg2();
  }   
}
class TestOuter1{  
  static int data=30; 
  static final int data2=50;
   
  static class Inner{  
   void msg(){
       System.out.println("static data is "+data);
   }  
   void msg2(){
      System.out.println("final static data is "+ data2 );
  }
  }  
  
   
}  
