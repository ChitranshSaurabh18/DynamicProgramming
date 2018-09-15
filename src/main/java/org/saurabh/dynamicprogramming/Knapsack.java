package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
 *
 * @author Saurabh, Chitransh
 */
public class Knapsack {

    public static int knapsack (int[] values, int[] weights, int capacity) {
        assert values.length == weights.length;
        int n = values.length;

        int[][] dp = new int[n][capacity + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= capacity; j++) {
                int weight = weights[i];
                int value = values[i];

                if (i == 0) {
                    if (j > weight) {
                        dp[i][j] = value;
                    }
                } else {
                    if (j < weight) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                    }
                }
            }
        }

        return dp[n - 1][capacity];
    }
}
