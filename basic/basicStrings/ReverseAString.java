package basic.basicStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAString {
    // helper method to swap the values
    private static void swap(List<Character> s, int left, int right) {
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
    }

    private static void reverseString(List<Character> s) {
        // initializing pointers to perform swapping
        int left = 0, right = s.size() - 1;

        // iterating till left pointer is less than right pointer
        while (left < right) {
            // swapping the values at left pointer and right pointer
            swap(s, left, right);

            // updating the values of pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Character> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            s.add(ch);
        }

        reverseString(s);
        System.out.println(s);

        scanner.close();
    }
}
