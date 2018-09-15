package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 *
 * @author Saurabh, Chitransh
 */
public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring (String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];

        int start = 0;                         // start index of the longest palindrome substring
        int longest = 1;                       // length of the longest palindrome substring

        // all substrings of length 1 are always palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }


        // check for substrings of length 2
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                longest = 2;
            }
        }


        // check for substrings of length 3 and greater
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;

                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;

                    if (longest < k) {
                        start = i;
                        longest = k;
                    }
                }
            }
        }

        return str.substring(start, start + longest);
    }
}
