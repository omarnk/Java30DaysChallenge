package solution.recursion;

public class Recursion {
    public static int Summation(int n){
        //Base Case: We are at the end!
        if (n <= 0){
            return 0;
        }
        //Recursive case: 
        else{
        // 3 + Summation(2)
        // 3 + 2 + Summation(1)
        // 3 + 2 + 1 + summation(0)
        // 3 + 2 + 1 + 0
        return n + Summation(n -1);
        }
    }
    
    public static int Factorial(int n){
        //Base Case:
        if(n <= 1){
            return 1;
        }
        //Recursive Case:
        else{
          return n * Factorial(n - 1); 
        }
    }
    
    public static int Exponentiation(int n, int p){
        //Base Case:
        if (p <= 0){
            return 1;
        }
        //Recursive Case:
        else{
            // 5 * Exponentiation(2)
            // 5 * 5 * Exponentiation(1)
            // 5 * 5 * 5 * Exponentiation(0)
            // 5 * 5 * 5 * 1
            return n * Exponentiation (n, p-1);
        }
    }
    
    public static int Multiplication(int n, int k){
        //Base Case:
        if (k <= 0){
            return 0;
        }
        //Recursive Case:
        else{
            return n + Multiplication(n, k -1);
        }
    }
    
    public static void main(String[] args){
        System.out.println(Summation(3));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5, 3));
        System.out.println(Multiplication(5, 5));
    }
}
