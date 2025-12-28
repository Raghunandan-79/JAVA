package basic.basicRecursion;

import java.util.Scanner;

public class FactorialOfAGivenNumber {
    private static long factorial(int n) {
        if (n <= 1) return 1;

        // multiplying every value of n to the factorial untill it becomes less than or equal to 1
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));

        scanner.close();
    }
}
