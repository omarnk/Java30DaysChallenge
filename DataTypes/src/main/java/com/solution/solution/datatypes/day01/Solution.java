package com.solution.solution.datatypes.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        //int a;
        //double b;
        String c = null;
        int a = scan.nextInt();
        double b = scan.nextDouble();
        //String c = scan.next();
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        try {
            c = ob.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
       //a = 12;
       //b = 4.0;
       //c = "is the best place to learn and practice coding!";
        /* Print the sum of both integer variables on a new line. */
        int intSum = i + a;
        double o = b + d;
        String stSum = s.concat(c);
        /* Print the sum of the double variables on a new line. */
        System.out.println(intSum);
        System.out.println(o);
        System.out.println(stSum);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}