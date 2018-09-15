package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/paper-cut-minimum-number-squares-set-2/
 *
 * @author Saurabh, Chitransh
 */
public class PaperCutIntoMinSquares {

    private static int[][] dp = new int[300][300];

    public static int minSquares (int m, int n) {
        if (m == n) {
            return 1;
        }

        if (dp[m][n] != 0) {
            return dp[m][n];
        }

        int verticalMin = Integer.MAX_VALUE;
        int horizontalMin = Integer.MAX_VALUE;

        for (int i = 1; i <= m / 2; i++) {
            horizontalMin = Math.min(minSquares(i, n) + minSquares(m - i, n), horizontalMin);
        }

        for (int j = 1; j <= n / 2; j++) {
            verticalMin = Math.min(minSquares(m, j) + minSquares(m, n - j), verticalMin);
        }

        dp[m][n] = Math.min(verticalMin, horizontalMin);
        return dp[m][n];
    }
}
