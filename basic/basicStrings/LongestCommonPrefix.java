package basic.basicStrings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String[] str) {
        int n = str.length;

        // sorting the array
        Arrays.sort(str);

        // taking first and last string
        String first = str[0], last = str[n - 1];

        // string builder to make a new string
        StringBuilder ans = new StringBuilder();
        
        // iterating in the first and last string
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            // if character of first string is not equal to character of last string returning the ans string
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            // appending the character to ans string
            ans.append(first.charAt(i));
        }

        // returning ans string
        return ans.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }

        System.out.println(longestCommonPrefix(str));

        scanner.close();
    }
}
