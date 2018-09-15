package org.saurabh.dynamicprogramming;

import static java.lang.Math.*;

/**
 * Problem Link: https://www.geeksforgeeks.org/ugly-numbers/
 *
 * @author Saurabh, Chitransh
 */
public class UglyNumbers {

    public static int uglyNumber (int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            ugly[i] = min(2 * ugly[i2], min(3 * ugly[i3], 5 * ugly[i5]));

            if (ugly[i] == 2 * ugly[i2]) {
                i2 = i2 + 1;
            }
            if (ugly[i] == 3 * ugly[i3]) {
                i3 = i3 + 1;
            }
            if (ugly[i] == 5 * ugly[i5]) {
                i5 = i5 + 1;
            }
        }

        return ugly[n - 1];
    }
}
