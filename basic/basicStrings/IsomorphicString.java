package basic.basicStrings;

import java.util.Scanner;

public class IsomorphicString {
    private static boolean isomorphicString(String s, String t) {
        // Arrays to store the last seen positions of characters in s and t
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        // Iterate through each character in the strings
        for (int i = 0; i < sMap.length; i++) {
            // If the last seen positions of the current characters don't match, return false
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]) {
                return false;
            }

            // Update the last seen positions
            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }
        
        // If all characters match, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(), t = scanner.next();

        System.out.println(isomorphicString(s, t));

        scanner.close();
    }
}
