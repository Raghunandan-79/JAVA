package basic.basicMaths;

import java.util.Scanner;

public class ReturnTheLargestDigitInANumber {
    private static int largestNumber(int n) {
        if (n == 0) return 0;

        int largest = Integer.MIN_VALUE;

        while (n > 0) {
            int currentDigit = n % 10;
            
            if (currentDigit > largest) {
                largest = currentDigit;
            }

            n /= 10;
        }

        return largest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(largestNumber(n));

        scanner.close();
    }   
}
