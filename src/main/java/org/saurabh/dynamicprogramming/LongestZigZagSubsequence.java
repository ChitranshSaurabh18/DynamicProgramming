package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/longest-zig-zag-subsequence/
 *
 * @author Saurabh, Chitransh
 */
public class LongestZigZagSubsequence {

    public static int longestZigZagSubsequenceLength (int... arr) {
        int n = arr.length;
        int[][] dp = new int[n][2];

        // setting up base case
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i][0] < dp[j][1] + 1) {
                    dp[i][0] = dp[j][1] + 1;
                }

                if (arr[i] < arr[j] && dp[i][1] < dp[j][0] + 1) {
                    dp[i][1] = dp[j][0] + 1;
                }
            }
        }

        return maxInArray(dp);
    }

    private static int maxInArray (int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int element = array[i][j];
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }
}
