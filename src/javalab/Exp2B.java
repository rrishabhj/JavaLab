/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class Exp2B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter String:");
        String str=input.nextLine();
        do{
        initMenu();
        System.out.println("Enter the choice:");
        int choice=input.nextInt();
        switch(choice){
            case 1: System.out.println("Length:"+str.length());
                    break;
            case 2:str=str.toLowerCase();
                System.out.println("ToLowerCase:"+str);
                break;
            case 3:str=str.toUpperCase();
                System.out.println("ToUpperCase:"+str);
                break;
            case 4:System.out.print("Enter String:");
                    String two=input.nextLine();
                    str=str+two;
                    //using stringbuilder
                   System.out.println("Concatinated string:"+str);
                   break;
            case 5:str=str.trim();
                    System.out.println("Trim:"+str);
                    break;
            case 6:System.out.println("Enter beg and end index");
                    int beg=input.nextInt();
                    int end=input.nextInt();
                    System.out.println("Substring("+beg+","+end+"):"+str.substring(beg,end));
                    break;
            case 7:System.out.println("Enter Index:");
                    int index=input.nextInt();
                    System.out.println("char At:"+str.charAt(index));
                    break;
            case 8:System.out.println("Enter String:");
                    
            case 9:System.exit(0);
            default:System.out.println("wrong choice!!\nTry Again!");
        
        }
        }while(true);
        
        
    }

    private static void initMenu() {
       System.out.println("1.Length");
        System.out.println("2.ToLowerCase");
        System.out.println("3.ToUpperCase");
        System.out.println("4.Concatination");
        System.out.println("5.Trim");
        System.out.println("6.SubString");
        System.out.println("7.CharAt");
        System.out.println("8.Change String");
        System.out.println("9.exit");
        System.out.println();
        
    }
    
}
