package arrays.fundamentals;

import java.util.Scanner;

public class LargestElement {
    private static int largestElement(int[] nums) {
        // taking first element of array as largest
        int largest = nums[0];

        // iterating through the array
        for (int i = 1; i < nums.length; i++) {
            // if element of array is greater than largest
            if (nums[i] > largest) {
                // update the largest with that element
                largest = nums[i];
            }
        }

        // return the largest element
        return largest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(largestElement(nums));

        scanner.close();
    }
}
