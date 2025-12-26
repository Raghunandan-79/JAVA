package basic.basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondHighestOccuringElement {
    private static int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // putting elements into map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // variables to store element and frequency
        int maxOccuring = -1, maxFreq = -1;
        int secondMaxOccuring = -1, secondMaxFreq = -1;

        // iterating through the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // variables to store current element and its frequency
            int element = entry.getKey(), freq = entry.getValue();

            // checking if frequency is greater than max frequency
            if (freq > maxFreq) {
                secondMaxOccuring = maxOccuring;
                secondMaxFreq = maxFreq;
                maxOccuring = element;
                maxFreq = freq;
            } else if (freq == maxFreq) { // checking if frequency is equal to max frequency
                maxOccuring = Math.min(maxOccuring, element);
            } else if (freq > secondMaxFreq && freq != maxFreq) { // checking if frequency is greater than second max frequency
                secondMaxOccuring = element;
                secondMaxFreq = freq;
            } else if (freq == secondMaxFreq) { // checking if frequency is equal to second max frequency
                secondMaxOccuring = Math.min(secondMaxOccuring, element);
            }
        }

        // returning the second max occuring element
        return secondMaxOccuring;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(secondMostFrequentElement(nums));

        scanner.close();
    }
}
