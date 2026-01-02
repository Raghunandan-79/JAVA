package arrays.logicBuilding;

import java.util.Scanner;

public class FindMissingNumber {
    private static int missingNumber(int[] nums) {
        int n = nums.length;

        // finding sum of n natural numbers
        int sumOfNNaturalNumbers = (n * (n + 1)) / 2;

        // variable to calculate sum of array elements
        int sumOfArray = 0;

        // loop to calculate sum of array elements
        for (int num : nums) {
            sumOfArray += num;
        }

        // returning the missing number
        return sumOfNNaturalNumbers - sumOfArray;
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
