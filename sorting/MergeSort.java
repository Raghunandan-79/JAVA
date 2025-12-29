package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    // method to merge arrays
    public static void merge(int[] nums, int low, int mid, int high) {
        // list to store elements
        ArrayList<Integer> mergeList = new ArrayList<>();
        
        // initializing pointer variables
        int left = low, right = mid + 1;

        // iterating till left is less than equal to mid and right is less than equal to high
        while (left <= mid && right <= high) {
            // if element at left index is less than equal to element at right index
            if (nums[left] <= nums[right]) {
                // adding element at left index to list and incrementing the value of left pointer
                mergeList.add(nums[left]);
                left++;
            } else {
                // adding element at right index to list and incrementing the value of right pointer
                mergeList.add(nums[right]); 
                right++;
            }
        }

        // iterating till left is less than equal to mid
        while (left <= mid) {
            // adding element at left index to list and incrementing the value of left pointer
            mergeList.add(nums[left]);
            left++;
        }

        while (right <= high) {
            // adding element at right index to list and incrementing the value of right pointer
            mergeList.add(nums[right]);
            right++;
        }

        // putting elements back to the original array
        for (int i = low; i <= high; i++) {
            nums[i] = mergeList.get(i - low);
        }
    }

    // helper method to perform merge sort
    private static void mergeSortHelper(int[] nums, int low, int high) {
        // if low becomes greater than equal to high return
        if (low >= high) return;

        // calculating mid index
        int mid = low + (high - low) / 2;
        
        // sending the left part i.e from low to mid
        mergeSortHelper(nums, low, mid);

        // sending the right part i.e from mid + 1 to high
        mergeSortHelper(nums, mid + 1, high);

        // merging both parts
        merge(nums, low, mid, high);
    }

    private static int[] mergeSort(int[] nums) {
        int n = nums.length;
        
        // calling the helper method with defaut values of low and high
        mergeSortHelper(nums, 0, n - 1);

        // returning the sorted array
        return nums;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (var num : mergeSort(nums)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
