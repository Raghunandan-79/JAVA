package arrays.fundamentals;

import java.util.Scanner;

public class LinearSearch {
    private static int linearSearch(int[] nums, int target) {
        // iterating through the array
        for (int i = 0; i < nums.length; i++) {
            // if element of array is equal to target return the index of the element
            if (nums[i] == target) return i;
        }

        // if element is not found return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        System.out.println(linearSearch(nums, target));

        scanner.close();
    }
}
