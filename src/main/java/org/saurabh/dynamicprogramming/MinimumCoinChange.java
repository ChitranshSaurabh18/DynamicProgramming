package org.saurabh.dynamicprogramming;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * Problem Link: https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
 *
 * @author Saurabh, Chitransh
 */
public class MinimumCoinChange {

    public static int minCoinChanges (int note, int... coins) {
        int[] dp = new int[note + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= note; i++) {
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];
                if (coin <= i) {
                    dp[i] = min(dp[i - coin] + 1, dp[i]);
                }
            }
        }

        return dp[note];
    }
}
