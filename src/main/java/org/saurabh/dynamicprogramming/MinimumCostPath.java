package org.saurabh.dynamicprogramming;

import static java.lang.Math.*;

/**
 * Problem Link: https://www.geeksforgeeks.org/min-cost-path-dp-6/
 *
 * @author Saurabh, Chitransh
 */
public class MinimumCostPath {

    public static int minCostPathSum (int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        int[][] dp = new int[rows][columns];

        // setting up base cases
        dp[0][0] = arr[0][0];

        for (int j = 1; j < columns; j++) {
            dp[0][j] = arr[0][j] + dp[0][j - 1];
        }

        for (int i = 1; i < rows; i++) {
            dp[i][0] = arr[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = arr[i][j] + min(dp[i - 1][j], min(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }

        return dp[rows - 1][columns - 1];
    }
}


