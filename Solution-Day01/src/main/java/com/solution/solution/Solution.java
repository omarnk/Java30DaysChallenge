package com.solution.solution;

import java.util.Scanner;

/**
 *
 * @author omaribrahim
 */

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in); 
        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();
        //inputString = "Welcome to 30 Days of Code!";
        inputString = "HackerRank is the best!";
        // Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
        scan.close(); 
      
        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World." + inputString);
        System.out.println(inputString);

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
    }
}