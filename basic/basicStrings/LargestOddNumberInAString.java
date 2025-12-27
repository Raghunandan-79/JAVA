package basic.basicStrings;

import java.util.Scanner;

public class LargestOddNumberInAString {
    private static String largeOddNum(String s) {
        int n = s.length();

        // variable to get the occurence of last odd number in a string
        int lastOddIndex = -1;

        // iterating the string from the last index
        for (int i = n - 1; i >= 0; i--) {
            // if character at index i is odd
            if ((s.charAt(i) - '0') % 2 == 1) {
                // updating the last odd index and breaking from the loop
                lastOddIndex = i;
                break;
            }
        }

        // if there is no odd number returning empty string
        if (lastOddIndex == -1) return "";

        // variable to get the first index where value is non zero
        int firstNonZero = -1;

        // iterating the string
        for (int i = 0; i < n; i++) {
            // if characteer at index i in non zero
            if ((s.charAt(i) - '0') > 0) {
                // updating value of first non zero index and breaking from the loop
                firstNonZero = i;
                break;
            }
        }

        // return the string from first non zero index to last non zero index
        return s.substring(firstNonZero, lastOddIndex + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(largeOddNum(s));

        scanner.close();
    }
}
