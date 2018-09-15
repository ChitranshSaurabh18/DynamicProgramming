package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.ibm.com/developerworks/library/j-seqalign/index.html
 *
 * @author Saurabh, Chitransh
 */
public class SequenceAlignment {

    public static int alignmentCost (String X, String Y, int matchReward, int mismatchPenalty, int gapPenalty) {
        return alignmentCost(X.toCharArray(), Y.toCharArray(), matchReward, mismatchPenalty, gapPenalty);
    }

    private static int alignmentCost (char[] X, char[] Y, int matchReward, int mismatchPenalty, int gapPenalty) {
        int m = X.length;
        int n = Y.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i * gapPenalty;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j * gapPenalty;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + matchReward, Math.max(dp[i - 1][j] + gapPenalty, dp[i][j - 1] + gapPenalty));
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + mismatchPenalty, Math.max(dp[i - 1][j] + gapPenalty, dp[i][j - 1] + gapPenalty));
                }
            }
        }

        return dp[m][n];
    }
}
