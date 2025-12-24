package basic.basicMaths;

import java.util.Scanner;

public class CheckForPerfectNumber {
    private static boolean isPerfect(int n) {
        if (n == 1) return false;

        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (n / i != n) {
                    sum += (n / i);
                }
            }
        }

        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPerfect(n));

        scanner.close();
    }
}
