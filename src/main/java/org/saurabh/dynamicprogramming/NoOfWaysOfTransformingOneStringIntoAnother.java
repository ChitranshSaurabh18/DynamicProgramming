package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/ways-transforming-one-string-removing-0-characters/
 *
 * @author Saurabh, Chitransh
 */
public class NoOfWaysOfTransformingOneStringIntoAnother {

    public static int noOfWaysToTransform (String X, String Y) {
        return noOfWaysToTransform(X.toCharArray(), Y.toCharArray());
    }

    private static int noOfWaysToTransform (char[] X, char[] Y) {
        int m = X.length;
        int n = Y.length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                if (i == 0) {
                    if (X[j] == Y[i] && j == 0) {
                        dp[i][j] = 1;
                    } else if (X[j] == Y[i]) {
                        dp[i][j] = dp[i][j - 1] + 1;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else {
                    if (X[j] == Y[i]) {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}
