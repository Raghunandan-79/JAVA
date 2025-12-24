package basic.basicMaths;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    private static int GCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) n1 %= n2;
            else n2 %= n1;
        }

        return (n2 == 0) ? n1 : n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();

        System.out.println(GCD(n1, n2));

        scanner.close();
    }
}
