package arrays.logicBuilding;

import java.util.Scanner;

public class FindMissingNumber {
    private static int missingNumber(int[] nums) {
        int n = nums.length;

        // iterating from 0 to n
        for (int i = 0; i <= n; i++) {
            // taking flag as 0 to get missing number
            int flag = 0;

            // iterating the array
            for (int j = 0; j < n; j++) {
                // if element at j index is equal to i
                if (nums[j] == i) {
                    // updating flag as 1 and breaking the loop
                    flag = 1;
                    break;
                }
            }

            // if flag is 0 returning i index
            if (flag == 0) {
                return i;
            }
        }

        // returning 0 at end as 0 is missing
        return 0;
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
