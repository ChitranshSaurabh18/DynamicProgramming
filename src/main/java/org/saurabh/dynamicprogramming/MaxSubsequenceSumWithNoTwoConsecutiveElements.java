package org.saurabh.dynamicprogramming;

import static java.lang.Math.max;

/**
 * Problem Link: https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 *
 * @author Saurabh, Chitransh
 */
public class MaxSubsequenceSumWithNoTwoConsecutiveElements {

    public static int maxSubSequenceSumNoConsecutive (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0] > 0 ? arr[0] : 0;
        dp[1] = max(0, max(arr[0], arr[1]));

        for (int i = 2; i < n; i++) {
            dp[i] = max(dp[i - 1], arr[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}
