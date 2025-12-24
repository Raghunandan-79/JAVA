package basic.basicMaths;

import java.util.Scanner;

public class PalindromeNumber {
    private static int reverseNumber(int n) {
        int reversed = 0;

        while (n > 0) {
            int currentDigit = n % 10;
            n /= 10;
            reversed = (reversed * 10) + currentDigit;
        }

        return reversed;
    }

    private static boolean isPalindrome(int n) {
        return reverseNumber(n) == n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isPalindrome(n));

        scanner.close();
    }
}
