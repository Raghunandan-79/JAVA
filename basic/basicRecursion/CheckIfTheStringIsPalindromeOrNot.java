package basic.basicRecursion;

import java.util.Scanner;

public class CheckIfTheStringIsPalindromeOrNot {
    private static boolean isPalindrome(String s, int left, int right) {
        // if left pointer becomes greater than or equal to right pointer return true
        if (left >= right) return true;

        // if character at left pointer is not equal to character at right pointer return false
        if (s.charAt(left) != s.charAt(right)) return false;

        // calling the isPalindrome method with updated values of pointers
        return isPalindrome(s, left + 1, right - 1);
    }

    private static boolean palindromeCheck(String s) {
        // returning the value coming from isPalindrome method
        return isPalindrome(s, 0, s.length() - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(palindromeCheck(s));

        scanner.close();
    }
}
