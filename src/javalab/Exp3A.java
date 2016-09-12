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
public class Exp3A {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Box box1=new Box();
        
        System.out.println("Enter dimensions of Box1");
        System.out.print("Length:");
        box1.setLength(input.nextFloat());
        System.out.print("Breadth:");
        box1.setBreadth(input.nextFloat());
        System.out.print("Height:");
        box1.setHeight(input.nextFloat());
        
        System.out.println("Volume:"+box1.volume());
        
        
        System.out.println("Enter dimensions of Box2");
        System.out.print("Length:");
        float l=input.nextFloat();
        System.out.print("Breadth:");
        float b=input.nextFloat();
        System.out.print("Height:");
        float h=input.nextFloat();
        
        Box box2=new Box(l,b,h);
        
        System.out.println("Adding box 1 to Box 2");
        Box box3=box1.addBox(box2);
        System.out.println(box3.toString());
        
    }
    
}

class Box{
    float length,breadth,height;

    public Box() {
    }

   //using constructor with this reference  PART (B)
    
    public Box(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float volume(){
        return length*breadth*height;
    }
    
    //using method to take and return arguments PART (C)
    public Box addBox(Box box2){
        
        float len=box2.getLength()+this.length;
        float bre=box2.getBreadth()+this.breadth;
        float hei=box2.getHeight()+this.height;
        
        return new Box(len,bre,hei);
    }  

    @Override
    public String toString() {
        return "Length:"+length+" Breadth:"+breadth
                + " Height:"+height; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
