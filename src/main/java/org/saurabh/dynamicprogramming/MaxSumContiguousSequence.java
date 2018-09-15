package org.saurabh.dynamicprogramming;

import static java.lang.Math.max;

/**
 * Problem Link: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 *
 * @author Saurabh, Chitransh
 */
public class MaxSumContiguousSequence {

    public static int maxContiguousSequenceSum (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        // setting up base cases
        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = max(arr[i], arr[i] + dp[i - 1]);
        }

        return maxInArray(dp);
    }

    private static int maxInArray (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
