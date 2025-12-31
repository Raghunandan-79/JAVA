package arrays.logicBuilding;

import java.util.Scanner;

public class MoveZerosToEnd {
    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    
    private static void moveZeroes(int[] nums) {
        int n = nums.length;

        // taking a variable j
        int j = 0;

        for (int i = 0; i < n; i++) {
            // if current element of array is non zero
            if (nums[i] != 0) {
                // swap non zero element with zero element
                swap(nums, i, j);

                // increment value of j
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
