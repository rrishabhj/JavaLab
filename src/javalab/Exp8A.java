/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.StringTokenizer;

/**
 *
 * @author rishabh
 */
public class Exp8A {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is jindal"," ");  
        
        int count=st.countTokens();
        System.out.println("no. of times nextToken method can be called:"+count);
        
        while (st.hasMoreTokens()) {  
        System.out.println(st.nextToken());  
     }
        // creating string tokenizer with delimeter
         StringTokenizer st2 = new StringTokenizer("keep/moving/forward");
      
         // checking next token
        System.out.println("Next token is : " + st2.nextToken("/"));
    }
    
}
