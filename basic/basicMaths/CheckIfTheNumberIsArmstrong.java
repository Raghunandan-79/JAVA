package basic.basicMaths;

import java.util.Scanner;

public class CheckIfTheNumberIsArmstrong {
    private static boolean isArmstrong(int n) {
        int copyN = n, exponential = (int) (Math.log10(n) + 1), sum = 0;

        while (copyN > 0) {
            int base = copyN % 10;
            sum += Math.powExact(base, exponential);
            copyN /= 10;
        }

        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(isArmstrong(n));

        scanner.close();
    }
}
