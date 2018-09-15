package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/number-subsequences-string-divisible-n/
 *
 * @author Saurabh, Chitransh
 */
public class NoOfSubsequencesDivisibleByK {

    public static int noOfSubSequencesDivisible (int k, int... arr) {
        int n = arr.length;
        int[][] dp = new int[n][k];

        for (int j = 0; j < k; j++) {
            dp[0][j] = (arr[0] % k == j) ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            int d = arr[i];
            dp[i][d % k]++;                     // start a new subsequence consisting of arr[i] only

            for (int j = 0; j < k; j++) {
                dp[i][j] += dp[i - 1][j];
                dp[i][(j * 10 + d) % k] += dp[i - 1][j];
            }
        }
        return dp[n - 1][0];
    }
}
