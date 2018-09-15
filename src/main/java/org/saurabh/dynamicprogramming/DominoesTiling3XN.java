package org.saurabh.dynamicprogramming;

/**
 * @author Saurabh, Chitransh
 */
public class DominoesTiling3XN {

    public static int noOfWaysOfTiling (int n) {
        if (n == 0) {
            return 1;               // by not placing any brick at all
        } else if (n == 1) {
            return 0;
        } else if (n % 2 == 1) {
            return 0;
        } else {
            int[] f = new int[n + 1];
            int[] g = new int[n + 1];

            f[0] = 1;
            f[1] = 0;

            g[0] = 0;
            g[1] = 1;

            for (int i = 2; i <= n; i++) {
                f[i] = f[i - 2] + 2 * g[i - 1];
                g[i] = f[i - 1] + g[i - 2];
            }

            return f[n];
        }
    }
}
