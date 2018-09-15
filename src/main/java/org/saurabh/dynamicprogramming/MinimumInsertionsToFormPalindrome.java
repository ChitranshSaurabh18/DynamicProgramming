package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/
 *
 * @author Saurabh, Chitransh
 */
public class MinimumInsertionsToFormPalindrome {

    public static int minInsertions (String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 1; len < n; len++) {
            for (int i = 0, j = len; j < n; i++, j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }
}
