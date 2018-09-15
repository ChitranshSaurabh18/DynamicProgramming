package org.saurabh.dynamicprogramming;

/**
 * Problem Link: http://www.algorithmist.com/index.php/UVa_10918
 *
 * @author Saurabh, Chitransh
 */
public class DominoesTiling2XN {

    public static int noOfWaysOfTiling (int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] f = new int[n + 1];
            f[1] = 1;
            f[2] = 2;

            for (int i = 3; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }

            return f[n];
        }
    }
}
