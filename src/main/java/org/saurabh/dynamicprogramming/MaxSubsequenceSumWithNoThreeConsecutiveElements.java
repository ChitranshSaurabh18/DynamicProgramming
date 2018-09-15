package org.saurabh.dynamicprogramming;

import static java.lang.Math.max;

/**
 * Problem Link: https://www.geeksforgeeks.org/maximum-subsequence-sum-such-that-no-three-are-consecutive/
 *
 * @author Saurabh, Chitransh
 */
public class MaxSubsequenceSumWithNoThreeConsecutiveElements {

    public static int maxSubSequenceSumNoThreeConsecutive (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0] > 0 ? arr[0] : 0;
        dp[1] = max(arr[0] + arr[1], max(arr[1], dp[0]));
        dp[2] = max(arr[2] + arr[1], max(arr[2] + dp[0], dp[1]));

        for (int i = 3; i < n; i++) {
            dp[i] = max(arr[i] + arr[i - 1] + dp[i - 3], max(arr[i] + dp[i - 2], dp[i - 1]));
        }

        return dp[n - 1];
    }
}
