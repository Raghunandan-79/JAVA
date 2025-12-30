package arrays.fundamentals;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
    private static int findMaxConsecutiveOnes(int[] nums) {
        // variables to store max and consecutive ones
        int maxOnes = 0, consecutiveOnes = 0;
        
        // iterating through the array
        for (int i = 0; i < nums.length; i++) {
            // if current element of array is equal to 1
            if (nums[i] == 1) {
                // updating the count of consecutive ones and updating maxOnes with max of maxOnes and consecutiveOnes 
                consecutiveOnes++;
                maxOnes = Math.max(maxOnes, consecutiveOnes);
            } else { // if current element is not equal to 1
                // updating consecutiveOnes to 0
                consecutiveOnes = 0;
            }
        }

        // returning the number of maximum consecutive ones
        return maxOnes;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(nums));

        scanner.close();
    }
}
