package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/binomial-coefficient-dp-9/
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

    public static void main(String[] args) {
        System.out.println(binomialCoefficientDP(5,3));
        System.out.println(binomialCoefficientDP(10, 6));
    }
}
