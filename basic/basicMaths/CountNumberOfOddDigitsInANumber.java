package basic.basicMaths;

import java.util.Scanner;

public class CountNumberOfOddDigitsInANumber {
    private static int countOddDigit(int n) {
        int count = 0;

        while (n > 0) {
            int currentDigit = n % 10;
            
            if (currentDigit % 2 == 1) {
                count++;
            }
            
            n /= 10;
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(countOddDigit(n));

        scanner.close();
    }
}
