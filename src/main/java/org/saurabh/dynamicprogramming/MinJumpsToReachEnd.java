package org.saurabh.dynamicprogramming;

import java.util.Arrays;

/**
 * Problem Link: https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
 *
 * @author Saurabh, Chitransh
 */
public class MinJumpsToReachEnd {

    public static int minJumps (int... arr) {
        int n = arr.length;
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] >= (i - j) && dp[i] > dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        return dp[n - 1];
    }
}
