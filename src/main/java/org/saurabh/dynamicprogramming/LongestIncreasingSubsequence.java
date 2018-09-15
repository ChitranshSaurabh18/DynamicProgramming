package org.saurabh.dynamicprogramming;

import java.util.Arrays;

/**
 * Problem Link: https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 * @author Saurabh, Chitransh
 */
public class LongestIncreasingSubsequence {

    public static int longestIncreasingSubsequence (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        // setting up base case
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        return maxInArray(dp);
    }

    private static int maxInArray (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}
