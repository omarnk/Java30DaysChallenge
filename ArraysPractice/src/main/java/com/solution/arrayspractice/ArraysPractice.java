/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solution.arrayspractice;

import java.util.Arrays;

/**
 *
 * @author omaribrahim
 */
public class ArraysPractice {
    
    //Custom method to print out array.
    public static void printArray(int[] array){
      System.out.print("[");
        for (int i = 0; i < array.length; i++){
           int item = array[i];
           System.out.print(item);
           if (i < array.length -1 ){
               System.out.print(",");
           }
        }
      System.out.println("]");
}
    
    public static void main(String[] args) {
        int[] intArray1;
        // Allocating the Array.
        int[] intArray2 = new int[4];
        //Initializing the array.
        int[] intArray3 = {2, 3, 5, 4, 6};
        String[] stringArray1 = {"Bananas", "Apples", "Pears"};
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        
        intArray2[0] = 10;
        intArray2[1] = 5;
        intArray2[2] = 4;
        intArray2[3] = 3;
        
        printArray(intArray2);
        printArray(intArray3);
        
        //Retreive Objects.
        System.out.println(intArray2[2]);
        
        //Methods related to Arrays.
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        //For each loop.
        for (String s : stringArray1){
            System.out.println(s);
        }
    }
    
    
}
