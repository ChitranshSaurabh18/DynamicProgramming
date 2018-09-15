package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestZigZagSubsequence.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestZigZagSubsequenceTest {

    @Test
    public void testLongestZigZagSubsequenceLength () throws Exception {
        assertEquals(3, longestZigZagSubsequenceLength(1, 5, 4));
        assertEquals(2, longestZigZagSubsequenceLength(1, 4, 5));
        assertEquals(6, longestZigZagSubsequenceLength(10, 22, 9, 33, 49, 50, 31, 60));
    }
}