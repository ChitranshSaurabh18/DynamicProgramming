package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestSubsequenceWhereDiffBetweenAdjacentElementsIs0Or1.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestSubsequenceWhereDiffBetweenAdjacentElementsIs0Or1Test {

    @Test
    public void testLongestSubsequence011 () throws Exception {
        assertEquals(5, longestSubsequence011(2, 5, 6, 3, 7, 6, 5, 8));
        assertEquals(4, longestSubsequence011(-2, -1, 5, -1, 4, 0, 3));
    }
}