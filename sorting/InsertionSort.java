package sorting;

import java.util.Scanner;

public class InsertionSort {
    // helper method to swap values
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    private static int[] insertionSort(int[] nums) {
        int n = nums.length;

        // iterating through the array
        for (int i = 0; i < n; i++) {
            // taking value of j as i
            int j = i;

            // looping untill j is greater than 0 and element at j - 1 index is greater than element at j index
            while (j > 0 && nums[j - 1] > nums[j]) {
                // swapping the values at j - 1 index and j index
                swap(nums, j - 1, j);

                // decrementing the value of j index
                j--;
            }
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

        for (var num : insertionSort(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
