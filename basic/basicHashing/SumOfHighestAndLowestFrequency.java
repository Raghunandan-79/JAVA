package basic.basicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfHighestAndLowestFrequency {
    private static int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = Integer.MIN_VALUE, minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxFrequency = Math.max(maxFrequency, entry.getValue());
            minFrequency = Math.min(minFrequency, entry.getValue());
        }

        return maxFrequency + minFrequency;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(sumHighestAndLowestFrequency(nums));

        scanner.close();
    }
}
