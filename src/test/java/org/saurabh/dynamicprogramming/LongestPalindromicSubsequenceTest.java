package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestPalindromicSubsequence.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestPalindromicSubsequenceTest {

    @Test
    public void testLongestPalindromicSubsequence () throws Exception {
        assertEquals(5, longestPalindromicSubsequence("GEEKSFORGEEKS"));
        assertEquals(7, longestPalindromicSubsequence("BBABCBCAB"));
    }
}