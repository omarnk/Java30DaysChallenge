package com.solution.outputformat;

/**
 *
 * @author omaribrahim
 * This is a formatting example using printf() method in Java.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                //System.out.print(s1);
                if (10 >= s1.length() && x <= 999){
                    System.out.printf("%-15s%03d%n", s1, x);
                }
                else {
                    System.out.println("Invalid Input!");
                }
                //System.out.format("%03d%n", x);               
            }
            System.out.println("================================");
             //scanner.close();
    }
}