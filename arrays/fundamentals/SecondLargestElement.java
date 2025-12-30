package arrays.fundamentals;

import java.util.Scanner;

public class SecondLargestElement {
    private static int secondLargestElement(int[] nums) {
        // initializing variables to store largest and second largest
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // iterating through the array
        for (int i = 0; i < nums.length; i++) {
            // if element of array is greater than largest
            if (nums[i] > largest) {
                // updating the second largest with largest and largest with current element of array
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) { // if element is greater than second largest
                // updating second largest with current element of array
                secondLargest = nums[i];
            }
        }

        // returning the second largest element
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(secondLargestElement(nums));

        scanner.close();
    }
}
