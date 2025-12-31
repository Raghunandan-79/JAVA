package arrays.logicBuilding;

import java.util.Scanner;

public class MoveZerosToEnd {
    private static void moveZeroes(int[] nums) {
        int n = nums.length;

        // temp array to store non zeros
        int[] temp = new int[n];

        // taking count as zero
        int count = 0;

        // iterating through the array
        for (int i = 0; i < n; i++) {
            // if the element is not equal to zero
            if (nums[i] != 0) {
                // adding it to the index temp[count]
                temp[count++] = nums[i];
            }
        }

        // adding elements of temp array back to the array
        for (int i = 0; i < count; i++) {
            nums[i] = temp[i];
        }

        // adding zeros to remaining spaces
        for (int i = count; i < n; i++) {
            nums[i] = 0;
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
