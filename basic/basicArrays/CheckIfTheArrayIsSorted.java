package basic.basicArrays;

import java.util.Scanner;

public class CheckIfTheArrayIsSorted {
    private static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(arraySortedOrNot(arr, n));

        scanner.close();
    }
}
