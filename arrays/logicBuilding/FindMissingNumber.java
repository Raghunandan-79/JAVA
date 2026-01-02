package arrays.logicBuilding;

import java.util.Scanner;

public class FindMissingNumber {
    private static int missingNumber(int[] nums) {
        int n = nums.length;

        // Array to store frequencies, initialized to 0
        int[] freq = new int[n + 1];

        // Storing the frequencies in the array
        for (int num : nums) {
            freq[num]++;
        }

        // Checking the frequencies for numbers 0 to N
        for (int i = 0; i <= n; i++) {
            if (freq[i] == 0) {
                return i;
            }
        }

        // This line will never execute, it is just to avoid warnings
        return -1;
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
