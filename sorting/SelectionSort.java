package sorting;

import java.util.Scanner;

public class SelectionSort {
    // helper method to swap values
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    private static int[] selectionSort(int[] nums) {
        int n = nums.length;

        // iterating through the array
        for (int i = 0; i < n - 1; i++) {
            // selecting i index to be the index with minimum value
            int mini = i;

            // inner loop iteraing from index i + 1 to n - 1
            for (int j = i + 1; j < n; j++) {
                // if element at j index is less than element at mini index
                if (nums[j] < nums[mini]) {
                    // updating the mini index
                    mini = j;
                }
            }

            // swapping the values at i and mini index 
            swap(nums, i, mini);
        }

        // returning the sorted array
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : selectionSort(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
