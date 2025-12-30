package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    // helper method to swap values of array
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    // helper method to reverse array
    private static void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        // to avoid unnecessary rotations
        k %= n;

        // reversing the array from index 0 to k
        reverseArray(nums, 0, k);

        // reversing the array from index k + 1 to n - 1
        reverseArray(nums, k + 1, n - 1);

        // reversing the array from index 0 to n - 1
        reverseArray(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
