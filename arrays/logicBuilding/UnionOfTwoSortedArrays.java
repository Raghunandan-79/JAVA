package arrays.logicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
    private static int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> unionList = new ArrayList<>();
        int n1 = nums1.length, n2 = nums2.length;

        // pointers to traverse arrays
        int i = 0, j = 0;

        // traversing both arrays simultaneously
        while (i < n1 && j < n2) {
            // if element of array 1 is less than equal to element of array 2
            if (nums1[i] <= nums2[j]) {
                /*  
                * if union list is empty or last element of union list is not equal to current element
                * of array 1 adding it to union list
                */
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                    unionList.add(nums1[i]);
                }

                // moving to next index of array 1
                i++;
            } else {
                /*
                * if union list is empty or last element of union list is not equal to current element 
                * of array 2 adding it to the union list
                */
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                    unionList.add(nums2[j]);
                }

                // moving to next index of array 2
                j++;
            }
        }

        // adding remaining elements of array 1 to the union list
        while (i < n1) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i]) {
                unionList.add(nums1[i]);
            }

            i++;
        }

        // adding remaining elements of array 2 to the union list
        while (j < n2) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j]) {
                unionList.add(nums2[j]);
            }

            j++;
        }

        // putting elements of union list to array
        int[] union = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) {
            union[k] = unionList.get(k);
        }

        return union;
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
