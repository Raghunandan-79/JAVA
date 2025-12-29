package sorting;

import java.util.Scanner;

public class QuickSort {
    // helper method to swap values
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    // helper method to find partititon index
    private static int partition(int[] nums, int low, int high) {
        // taking pivot as the first element of array
        int pivot = nums[low];

        // taking left and right pointers
        int left = low, right = high;

        // iterating till left is less than right
        while (left < right) {
            // iterating till element at left is less than pivot and left is less than high - 1
            while (nums[left] <= pivot && left <= high - 1) {
                left++;
            }

            // iterating till element at right is greater than pivot and right is greater than equal to low + 1
            while (nums[right] > pivot && right >= low + 1) {
                right--;
            }

            // if left is less than right
            if (left < right) {
                // swap values at left and right index
                swap(nums, left, right);
            }
        }

        // swap values at low index and right index
        swap(nums, low, right);

        // returning the pivot index
        return right;
    }

    // helper method to perform quick sort
    private static void quickSortHelper(int[] nums, int low, int high) {
        // if low is less than equal to high
        if (low <= high) {
            // getting the partiiton index
            int partitionIndex = partition(nums, low, high);

            // calling helper method from low to partition index - 1
            quickSortHelper(nums, low, partitionIndex - 1);

            // calling helper method from partition index + 1 to high
            quickSortHelper(nums, partitionIndex + 1, high);
        }
    }

    private static int[] quickSort(int[] nums) {
        int n = nums.length;

        // calling helper method with values of low and high
        quickSortHelper(nums, 0, n - 1);

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

        for (var num : quickSort(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
