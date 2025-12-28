package basic.basicRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfTheArrayIsSorted {
    // helper method to check if the array is sorted
    private static boolean sorted(ArrayList<Integer> nums, int i) {
        // if i becomes greater than equal to size of array return true
        if (i >= nums.size()) return true;

        // if value at i - 1 index is greater than value at i index return false
        if (nums.get(i - 1) > nums.get(i)) return false;

        // calling the sorted method again with updated value of i
        return sorted(nums, i + 1);
    }
    
    private static boolean isSorted(ArrayList<Integer> nums) {
        // retuning the result coming from sorted method
        return sorted(nums, 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        System.out.println(isSorted(nums));

        scanner.close();
    }
}
