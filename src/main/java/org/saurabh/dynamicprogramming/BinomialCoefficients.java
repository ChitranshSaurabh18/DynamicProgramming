package org.saurabh.dynamicprogramming;

/**
 * Problem: Given positive integers n and k, compute nCk
 * nCk represents the number of ways of selecting k items from n items
 * The formula for nCk is given as, nCk = n! / k! x (n-k)!, where n! denotes factorial of n
 *
 * @author Saurabh, Chitransh
 */
public class BinomialCoefficients {

    /**
     * Naive approach: Directly use the above formula
     * Issue with this approach: the intermediary results may overflow even if the end result does not
     */
    public static long binomialCoefficient (int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static long factorial (int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * DP Approach: Use the property nCk = n-1Ck + n-1Ck-1
     * Define sub-problem: dp[i][j] = no of ways of selecting j items from i items
     * End result = dp[n][k], so we need a 2D array of size n+1 and k+1
     * Recurrence: dp[i][j] = dp[i-1][j] + dp[i-1][j-1]
     *
     * Base case:
     *      a) dp[i][0] = 1, as no of ways of selecting 0 items from any no of items = 1
     *      b) dp[0][j] = 0, as no of ways of selecting any no of items from 0 items = 0
     *      c) dp[0][0] = 1, as no of ways of selecting 0 items from 0 items = 1
     */
    public static long binomialCoefficientDP (int n, int k) {
        long[][] dp = new long[n + 1][k + 1];

        // setting up base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i <= k; i++) {
            dp[0][i] = 0;
        }

        dp[0][0] = 1;

        // recurrence
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
            }
        }

        return dp[n][k];
    }
}
