package basic.basicMaths;

import java.util.Scanner;

public class CountAllDigitsOfANumber {
    private static int countDigit(int n) {
        if (n == 0) return 1;

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(countDigit(n));

        scanner.close();
    }
}
