package basic.basicRecursion;

import java.util.Scanner;

public class CheckIfANumberIsPrimeOrNot {
    private static boolean isPrime(int num, int x) {
        // if square of x becomes greater than num return true
        if (x * x > num) return true;

        // if any value of x when dividing it by x gives remainder 0 return false
        if (num % x == 0) return false;

        // calling the isPrime function with updated value of x
        return isPrime(num, x + 1);
    }
    
    private static boolean checkPrime(int num) {
        // if num <= 1 return false
        if (num <= 1) return false;

        // returning the result coming from isPrime function
        return isPrime(num, 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        System.out.println(checkPrime(num));

        scanner.close();
    }
}
