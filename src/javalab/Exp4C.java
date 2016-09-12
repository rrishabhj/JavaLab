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
public class Exp4C {
    
    public static void main(String[] args) {
        
        if(!args.toString().isEmpty()){
         System.out.println("enter arguments at command line");
        
        }else{
           
            System.out.println("Command line arguments are");
        
        
        for(String str:args){
            System.out.println(str);
        }
        
        System.out.println("Converting arguments into uppercase");
        for(String str:args){
            System.out.println(str.toUpperCase());
        }
        
        
    }

    }
}

