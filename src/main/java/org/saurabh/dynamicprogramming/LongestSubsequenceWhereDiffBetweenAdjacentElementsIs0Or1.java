package org.saurabh.dynamicprogramming;

import java.util.Arrays;

/**
 * Problem Link: https://www.geeksforgeeks.org/maximum-length-subsequence-difference-adjacent-elements-either-0-1/
 *
 * @author Saurabh, Chitransh
 */
public class LongestSubsequenceWhereDiffBetweenAdjacentElementsIs0Or1 {

    public static int longestSubsequence011 (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        // setting up base case
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                boolean isDiffValid = (diff == 0) || (diff == 1) || (diff == -1);
                if (isDiffValid && dp[i] < dp[j] + 1) {
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
