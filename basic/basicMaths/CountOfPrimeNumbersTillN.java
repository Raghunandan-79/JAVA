package basic.basicMaths;

import java.util.Scanner;

public class CountOfPrimeNumbersTillN {
    private static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    private static int primeUptoN(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(primeUptoN(n));

        scanner.close();
    }
}