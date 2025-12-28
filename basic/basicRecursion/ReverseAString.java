package basic.basicRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAString {
    // method to swap values
    private static void swap(ArrayList<Character> s, int left, int right) {
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
    }

    private static void reverse(ArrayList<Character> s, int left, int right) {
        // if left pointer becomes equal to or greater to right pointer return
        if (left >= right) return;

        // swapping the values at right and left pointer
        swap(s, left, right);

        // calling the reverse method again with updated values of pointers
        reverse(s, left + 1, right - 1);
    }

    private static ArrayList<Character> reverseString(ArrayList<Character> s) {
        // calling the reverse method with values of pointers
        reverse(s, 0, s.size() - 1);

        // returning the reversed string
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Character> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            s.add(ch);
        }

        System.out.println(reverseString(s));

        scanner.close();
    }
}
