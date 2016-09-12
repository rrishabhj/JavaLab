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
public class Exp3D {
    
    public static void main(String[] args) {
        
        Marks marks=new Marks();
        
        System.out.println("Get Total of top 5 students");
        System.out.println("97 89 90 90 87");
        
        float total=marks.getTotal(97,89,90,90,87);
        System.out.println("Total:"+total);
    }    
}

class Marks{
    float total;
    Marks(){
        total=0;
    }
    public float getTotal(int...marks){
        for(int num:marks){
            total+=num;
        }
        return total;
    }
   
    
}
