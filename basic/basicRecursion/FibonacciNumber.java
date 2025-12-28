package basic.basicRecursion;

import java.util.Scanner;

public class FibonacciNumber {
    private static int fib(int n) {
        // if n is equal to 0 return 0
        if (n == 0) return 0;

        // if n is equal to 1 return 1
        if (n == 1) return 1;

        // generating next fibonacci number by adding last 2 number
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fib(n));

        scanner.close();
    }
}
