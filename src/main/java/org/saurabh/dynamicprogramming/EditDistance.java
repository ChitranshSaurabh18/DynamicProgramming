package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/edit-distance-dp-5/
 *
 * @author Saurabh, Chitransh
 */
public class EditDistance {

    public static int editDistance (String X, String Y, int insertionCost, int deletionCost, int replaceCost) {
        return editDistance(X.toCharArray(), Y.toCharArray(), insertionCost, deletionCost, replaceCost);
    }

    private static int editDistance (char[] X, char[] Y, int insertionCost, int deletionCost, int replaceCost) {
        int m = X.length;
        int n = Y.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + insertionCost, Math.min(dp[i][j - 1] + deletionCost, dp[i - 1][j - 1] + replaceCost));
                }
            }
        }

        return dp[m][n];
    }
}
