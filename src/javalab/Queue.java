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
public class Queue {
    private static final int SIZE=10;
    private ArrayList<Integer> queue=new ArrayList<>(SIZE);
    private int rear=-1,front=-1;
    
   
    public void insert(int value){
        
        if((rear+1)==SIZE){
            System.out.println("OVERFLOW --->>");
        }else if(rear==-1){
            front=0;
            rear=0;
            queue.add(value);
            System.out.println("INSERTED --->>");
            show();
        
        }else{
            rear++;
            queue.add(value);
            System.out.println("INSERTED --->>");
            show();
        }
    }

    public int remove() {
        int value=-1;
        if(front==-1){
            System.out.println("UNDERFLOW --->>");
        }else if( front == rear){
                front = -1;
                rear = -1;
                queue.remove(0);
                System.out.println("QUEUE IS EMPTY!!");
        }else{
            
            
            value=queue.get(0);
            queue.remove(0);
            front++;
            System.out.println("REMOVED--->>");
            show();
        }
        return value;
    }
    
    public void  show(){
        
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println("-->>"+itr.next());
        }
    }
        
}
