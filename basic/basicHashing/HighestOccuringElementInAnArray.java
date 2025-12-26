package basic.basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccuringElementInAnArray {
    private static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxElement = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey(), freq = entry.getValue();

            if (freq > maxFreq) {
                maxElement = element;
                maxFreq = freq;
            } else if (freq == maxFreq) {
                maxElement = Math.min(maxElement, element);
            }
        }

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
