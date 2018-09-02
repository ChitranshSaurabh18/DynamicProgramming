package org.saurabh.dynamicprogramming;

import static java.lang.Math.max;

/**
 * Problem: Given an array of numbers, find the maximum possible sum of a contiguous sequence.
 * Examples:
 *
 *      a) Input: {-2, 11, -4, 13, -5, 2}
 *         Max contiguous sum = 20, using {11, -4, 13}
 *
 *      b) Input: {1, -3, 4, -2, -1, 6}
 *         Max contiguous sum = 7, using {4, -2, -1, 6}
 *
 * @author Saurabh, Chitransh
 */
public class MaxSumContiguousSequence {

    /**
     * DP Approach: Define sub-problem as the following
     *      dp[i] = max contiguous sum consisting of elements from index 0 to i, which necessarily includes arr[i]
     *
     * Then, we can use recursion: dp[i] = max (arr[i], arr[i] + dp[i-1])
     *
     * Base Case:  dp[0] = arr[0], as there is no other option
     * The end result would be max over the dp[] array
     */
    public static int maxContiguousSequenceSum (int[] arr) {
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
