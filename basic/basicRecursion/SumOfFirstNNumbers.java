package basic.basicRecursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    private static int nNumbersSum(int N) {
        if (N == 0) return 0;
        
        // Adding every value of n to the sum till it becomes zero
        return N + nNumbersSum(N - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(nNumbersSum(N));

        scanner.close();
    }
}