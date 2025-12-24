package basic.basicMaths;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    private static int GCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) n1 %= n2;
            else n2 %= n1;
        }

        return (n2 == 0) ? n1 : n2;
    }

    private static int LCM(int n1, int n2) {
        int lcm = (n1 * n2) / GCD(n1, n2);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();

        System.out.println(LCM(n1, n2));

        scanner.close();
    }
}
