/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class Exp2C {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack stack=new Stack();
      
       do{
           
           System.out.println("1.push");
           System.out.println("2.pop");
           System.out.println("3.exit");
           System.out.println("Enter choice:");
           int choice=input.nextInt();
           switch(choice){
               case 1:  System.out.println("Enter value:");
                   int value=input.nextInt();
                   stack.push(value);
                   break;
               case 2:int pop=stack.pop();
                        System.out.println("Popped element:"+pop);
                        break;
               case 3:System.exit(0);
               default: System.out.println("wrong choice!!");
           }
       }while(true);
    
    
    
}
}

