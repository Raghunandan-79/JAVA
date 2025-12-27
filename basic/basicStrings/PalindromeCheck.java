package basic.basicStrings;

import java.util.Scanner;

public class PalindromeCheck {
    private static boolean palindromeCheck(String s) {
        // pointer variables to traverse the string
        int left = 0, right = s.length() - 1;

        // traversing the string
        while (left < right) {
            // if character at left is not equal to character at right return false
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // updating the value of pointer variables
            left++;
            right--;
        }

        // returning that the string is palindrome
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(palindromeCheck(s));

        scanner.close();
    }
}
