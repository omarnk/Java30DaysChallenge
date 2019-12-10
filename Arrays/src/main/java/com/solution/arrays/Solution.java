package com.solution.arrays;
/**
 *
 * @author omaribrahim
 */
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.nextLine();
        char[] myCharArray = S.toCharArray();
        for(int i = 0; i < S.length() - 1; i++){
            // Print each sequential character on the same line
            System.out.print(myCharArray[i]); 
        }
        // Print a newline
        System.out.println(); 

    }
}

