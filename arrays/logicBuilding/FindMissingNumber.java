package arrays.logicBuilding;

import java.util.Scanner;

public class FindMissingNumber {
    private static int missingNumber(int[] nums) {
        int n = nums.length;

        // variables to store xor
        int xorr1 = 0, xorr2 = 0;

        // iterating from 0 to n - 1
        for (int i = 0; i < n; i++) {
            // calculating xor with all array elements
            xorr1 ^= nums[i];

            // calculating xor with number from 1 to n
            xorr2 ^= (i + 1);
        }

        // doing xor of both xor to get the missing number
        return xorr1 ^ xorr2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(missingNumber(nums));
    
        scanner.close();
    }
}
