package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
 *
 * @author Saurabh, Chitransh
 */
public class LongestCommonSubsequence {

    public static int longestCommonSubsequence (String X, String Y) {
        return longestCommonSubsequence(X.toCharArray(), Y.toCharArray());
    }

    private static int longestCommonSubsequence (char[] X, char[] Y) {
        int m = X.length;
        int n = Y.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

}
