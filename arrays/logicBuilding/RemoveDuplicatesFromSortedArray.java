package arrays.logicBuilding;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        // i to store unique element
        int i = 0;

        // j to iterate in the array
        for (int j = 1; j < n; j++) {
            // if the element is unique
            if (nums[i] != nums[j]) {
                // increment the value of i
                i++;

                // updating i index with the unique element
                nums[i] = nums[j];
            }
        }

        // printing array, remove this part before submitting on any coding platform
        for (int j= 0; j <= i; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        // returning the unique array index
        return i + 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(removeDuplicates(nums));

        scanner.close();
    }
}
