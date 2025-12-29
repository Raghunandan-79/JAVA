package sorting;

import java.util.Scanner;

public class BubbleSort {
    // helper method to swap values
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    
    private static int[] bubbleSort(int[] nums) {
        int n = nums.length;

        // iterating in the array from last index
        for (int i = n - 1; i >= 0; i--) {
            // variable to maintain the track of swap
            boolean didSwap = false;

            // iterating till 0 to i - 1 index
            for (int j = 0; j < i; j++) {
                // if element at j index is greater than j + 1 index
                if (nums[j] > nums[j + 1]) {
                    // swapping values at j and j + 1 index
                    swap(nums, j, j + 1);

                    // marking the swap to true
                    didSwap = true;
                }
            }

            // if track of swap is false after one iteratin breaking from the loop
            if (didSwap == false) break;
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

        for (var num : bubbleSort(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
