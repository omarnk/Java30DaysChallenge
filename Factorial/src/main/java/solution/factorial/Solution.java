package solution.factorial;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n) {
    
        //Base Case:
        if(n <= 1){
            return 1;
        }
        // Recursive Case:
        else{
            return n * factorial(n - 1);
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
