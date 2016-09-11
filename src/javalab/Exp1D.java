/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author Jindal
 */
public class Exp1D {
    public static void main(String[] args) {
        /**
         * prints
         *          *
         *         ***
         *        *****
         *       *******
         */
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
            System.out.print(" ");
            }
            
            for(int k=0;k<(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        /**
         *      prints 
         *              *********
         */
        for(int i=0;i<9;i++){
            System.out.print("*");
        }
        /**
         *      prints
         *              *******
         *               *****
         *                ***
         *                 *      
         */
        
        System.out.println();
        for(int i=4;i>0;i--){
            for(int j=4;j>=i;j--){
            System.out.print(" ");
            }
            for(int k=(2*(i-1)+1);k>0;k--){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
       
    }
}
