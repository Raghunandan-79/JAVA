package basic.basicRecursion;

import java.util.Scanner;

public class SumOfDigitsInAGivenNumber {    
    private static int addDigits(int num) {
        // if num is less than 10 returning the num
        if (num < 10) return num;

        // variable to store sum
        int sum = 0;

        // looping untill num is greater than 0
        while (num > 0) {
            // getting the last digit of the num
            int currentDigit = num % 10;

            // adding last digit to the sum
            sum += currentDigit;

            // removing last digit from the num
            num /= 10;
        }

        // calling addDigits method again with updated num
        return addDigits(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(addDigits(num));

        scanner.close();
    }
}
