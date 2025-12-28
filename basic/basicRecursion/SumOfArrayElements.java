package basic.basicRecursion;

import java.util.Scanner;

public class SumOfArrayElements {
    private static int sum(int[] nums, int i) {
        if (i >= nums.length) return 0;

        // adding every index value to the sum
        return nums[i] + sum(nums, i + 1);
    }
    
    private static int arraySum(int[] nums) {
        return sum(nums, 0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(arraySum(nums));

        scanner.close();
    }
}
