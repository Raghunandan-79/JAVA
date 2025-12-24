package basic.basicMaths;

import java.util.Scanner;

public class ReverseANumber {
    private static int reverseNumber(int n) {
        int reversed = 0;

        while (n > 0) {
            int currentDigit = n % 10;
            n /= 10;
            reversed = (reversed * 10) + currentDigit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(reverseNumber(n));

        scanner.close();
    }
}
