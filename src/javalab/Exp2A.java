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
public class Exp2A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]:");
            arr[i] = input.nextInt();
        }

        int large = largest(arr, size);
        int small = smallest(arr, size);
        System.out.println("Largest:" + large + "\nSmallest:" + small);
    }

    private static int largest(int[] arr, int size) {

        int temp = arr[0];
        for (int i = 0; i < size; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    private static int smallest(int[] arr, int size) {

        int temp = arr[0];
        for (int i = 0; i < size; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
