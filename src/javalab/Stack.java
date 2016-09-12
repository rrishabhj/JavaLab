/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Jindal
 */
public class Stack {
    private ArrayList<Integer> stack=new ArrayList<>();
    private int top=-1;
    private static final int SIZE=10;
   
    public void push(int value){
        
        if(top==SIZE){
            System.out.println("OVERFLOW --->>");
        }else{
            top++;
            stack.add(value);
            System.out.println("PUSHED --->>");
            show();
        }
    }

    public int pop() {
        int value=-1;
        if(top==-1){
            System.out.println("UNDERFLOW --->>");
        }else{
            value=stack.get(top);
           
            stack.remove(top);
            top--;
            System.out.println("POPPED--->>");
            show();
        }
        return value;
    }
    
    public void  show(){
        ListIterator itr=stack.listIterator(stack.size());
        
        while(itr.hasPrevious()){
                System.out.println("--->>"+itr.previous());
        }
        
    }
    
    
}
