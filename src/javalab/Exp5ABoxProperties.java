/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @author rishabh
 */
public class Exp5ABoxProperties extends Box1{

    public Exp5ABoxProperties(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter Length:");
        double length=input.nextInt();
        
        System.out.print("Enter Breadth:");
        double breadth=input.nextInt();
        
        System.out.print("Enter Height:");
        double height=input.nextInt();
        
        
        Exp5ABoxProperties box=new Exp5ABoxProperties(length, breadth, height);
        
        double volume=box.getVolume();
        System.out.println("Volume:"+volume);
    }
    
    double getVolume(){
        double vol=0;
        double length=getLength();
        double breadth=getBreadth();
        double height=getHeight();
        
        vol=length*breadth*height;
        
        return vol;
    }
    
}
