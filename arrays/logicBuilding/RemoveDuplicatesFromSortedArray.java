package arrays.logicBuilding;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        // adding elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // taking j as 0
        int j = 0;

        // putting elements of set back to array
        for (int val : set) {
            nums[j++] = val;
        }

        // printing array make sure to remove this before submitting on any platform
        for (int i = 0; i < set.size(); i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // returning the size of array with unique elements
        return set.size();
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
