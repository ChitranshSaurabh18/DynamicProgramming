package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/count-ofdifferent-ways-express-n-sum-1-3-4/
 *
 * @author Saurabh, Chitransh
 */
public class NoOfWaysToWriteAsSumOf134 {

    public static int noOfWays (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n == 4) {
            return 4;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;                              // not possible
        dp[1] = 1;                              // [1]
        dp[2] = 1;                              // [1,1]
        dp[3] = 2;                              // [1,1,1] and [3]
        dp[4] = 4;                              // [1,3], [1,1,1,1], [3,1] and [4]

        for (int i = 5; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }

        return dp[n];
    }
}
