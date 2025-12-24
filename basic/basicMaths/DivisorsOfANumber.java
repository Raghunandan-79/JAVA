package basic.basicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsOfANumber {
    private static int[] divisors(int n) {
        ArrayList<Integer> divisorList = new ArrayList<>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);

                if (i != (n / i)) {
                    divisorList.add(n / i);
                }
            }
        }

        Collections.sort(divisorList);

        int[] divisor = new int[divisorList.size()];
        for (int i = 0; i < divisorList.size(); i++) {
            divisor[i] = divisorList.get(i);
        }

        return divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] ans = divisors(n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        scanner.close();
    }
}
