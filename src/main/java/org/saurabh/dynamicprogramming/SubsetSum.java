package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 *
 * @author Saurabh, Chitransh
 */
public class SubsetSum {

    public static boolean isSubsetSumPossible (int sum, int... array) {
        int n = array.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int j = 0; j <= sum; j++) {
            dp[0][j] = false;                    // because we can't use array[0]
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;                     // we can sum to 0 by not using any element
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j >= array[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - array[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }
}
