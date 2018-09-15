package org.saurabh.dynamicprogramming;

/**
 * Given a M x N grid. You need to move from lower-left corner to upper right corner.
 * Each step you can only move right or up. Calculate the number of distinct paths through the grid.
 *
 * @author Saurabh, Chitransh
 */
public class NoOfWaysToTraverse2DArray {

    public static int noOfWays (int m, int n) {
        int[][] dp = new int[m][n];

        // Base cases
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[m - 1][i] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i + 1][j] + dp[i][j - 1];
            }
        }

        return dp[0][n - 1];
    }
}
