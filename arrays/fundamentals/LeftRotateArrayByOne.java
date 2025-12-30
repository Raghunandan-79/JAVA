package arrays.fundamentals;

import java.util.Scanner;

public class LeftRotateArrayByOne {
    private static void rotateArrayByOne(int[] nums) {
        // taking rotate element as first element of array
        int rotateElement = nums[0];

        // iterating through the array
        for (int i = 1; i < nums.length; i++) {
            // updating previous element of array with current element
            nums[i - 1] = nums[i];
        }

        // updating the element at last index with rotate element
        nums[nums.length - 1] = rotateElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        rotateArrayByOne(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
