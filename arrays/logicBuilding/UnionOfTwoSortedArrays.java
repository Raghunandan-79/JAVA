package arrays.logicBuilding;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    private static int[] unionArray(int[] nums1, int[] nums2) {
        // TreeSet to store unique elements
        Set<Integer> set = new TreeSet<>();

        // adding all elements of array 1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // adding all elements of array 2 to the set
        for (int num : nums2) {
            set.add(num);
        }

        // union array to store elements back 
        int[] unionArray = new int[set.size()];

        // idx to keep track 
        int idx = 0;

        // iterating the set and adding elements of set to the union array
        for (int num : set) {
            unionArray[idx++] = num;
        }

        // returning the union array
        return unionArray;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(), n2 = scanner.nextInt();
        int[] nums1 = new int[n1], nums2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        for (int num : unionArray(nums1, nums2)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
