package basic.basicRecursion;

import java.util.Scanner;

public class ReverseAnArray {
    // helper method to swap values
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        // if left pointer becomes greater than equal to right pointer return
        if (left >= right) return;

        // swapping the vaues at left pointer and right pointer
        swap(nums, left, right);

        // calling reverse method with updated value of pointers
        reverse(nums, left + 1, right - 1);
    }
    
    private static int[] reverseArray(int[] nums) {
        // calling the reverse function with values of pointers
        reverse(nums, 0, nums.length - 1);

        // returning the reversed array
        return nums;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int num : reverseArray(nums)) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
