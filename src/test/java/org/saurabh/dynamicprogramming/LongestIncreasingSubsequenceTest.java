package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestIncreasingSubsequence.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void testLongestIncreasingSubsequence () throws Exception {
        assertEquals(3, longestIncreasingSubsequence(3, 10, 2, 1, 20));
        assertEquals(1, longestIncreasingSubsequence(3, 2));
        assertEquals(4, longestIncreasingSubsequence(50, 3, 10, 7, 40, 80));
    }
}