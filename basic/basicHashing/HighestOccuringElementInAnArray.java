package basic.basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccuringElementInAnArray {
    private static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // adding elements to map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // initializing varibles to store max occuring element and max frequency
        int maxElement = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE;

        // iterating through the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // variables to check for current element and frequency
            int element = entry.getKey(), freq = entry.getValue();

            // checking if frequency is greater than max frequency
            if (freq > maxFreq) {
                maxElement = element;
                maxFreq = freq;
            } else if (freq == maxFreq) { // checking if the frequency is equal to max frequency
                maxElement = Math.min(maxElement, element);
            }
        }

        // return the most occuring element
        return maxElement;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(mostFrequentElement(nums));

        scanner.close();
    }
}
