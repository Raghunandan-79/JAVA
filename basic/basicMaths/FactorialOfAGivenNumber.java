package basic.basicMaths;

import java.util.Scanner;

public class FactorialOfAGivenNumber {
    private static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));

        scanner.close();
    }
}
