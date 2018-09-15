package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 *
 * @author Saurabh, Chitransh
 */
public class MaximumSizeSquareMatrixWithAll1 {

    public static int maxSubSquareSize (int[][] array) {
        int m = array.length;
        int n = array[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = array[i][0];
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = array[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (array[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
            }
        }

        return maxInArray(dp);
    }

    private static int maxInArray (int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int element = array[i][j];
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }
}
