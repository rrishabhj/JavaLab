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
public class Exp6A implements Animal{
    public static void main(String[] args) {
        
        Exp6A tiger=new Exp6A();
        tiger.eat();
        tiger.travel();
        tiger.type();
    }

    @Override
    public void eat() {
            System.out.println("Animal eats");
    }

    @Override
    public void travel() {
        System.out.println("Animal travels");
    }

    @Override
    public void type() {
        System.out.println("Animal Type: Tiger");
    }
}


