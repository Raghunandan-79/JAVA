package basic.basicArrays;

import java.util.Scanner;

public class CountOfOddNumbersInArray {
    private static int countOdd(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(countOdd(arr, n));

        scanner.close();
    }
}
