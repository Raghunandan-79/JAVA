package basic.basicStrings;

import java.util.Scanner;

public class ValidAnagram {
    private static boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) return false;

        // To store the count of each character
        int[] count = new int[26];

        // Count occurrence of each character in first string 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Decrement the count for each character in the second string
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // Check for count of every character
        for (int i : count) {
            // if the count is not zero returning false
            if (i != 0) return false;
        }

        // Otherwise strings are anagram
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(), t = scanner.next();

        System.out.println(anagramStrings(s, t));

        scanner.close();
    }
}
