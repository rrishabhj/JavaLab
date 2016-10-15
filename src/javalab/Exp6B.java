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
public class Exp6B implements Showable{

    
    public static void main(String[] args) {
        Exp6B obj=new Exp6B();
        obj.show();
        obj.print();
    }
    
    @Override
    public void show() {
        System.out.println("show function from Showable interface!");
    }

    @Override
    public void print() {
        System.out.println("print function from Printable interface!");
    }

    
}
