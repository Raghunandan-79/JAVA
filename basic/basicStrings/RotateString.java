package basic.basicStrings;

import java.util.Scanner;

public class RotateString {
    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // adding string s to string s
        String doubledString = s + s;   

        // returning true if doubled string contains goals else false
        return doubledString.contains(goal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(), goal = scanner.next();

        System.out.println(rotateString(s, goal));

        scanner.close();
    }
}
