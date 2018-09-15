package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestCommonSubsequence.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestCommonSubsequenceTest {

    @Test
    public void testLongestCommonSubsequence () throws Exception {
        assertEquals(3, longestCommonSubsequence("ABCDGH", "AEDFHR"));
        assertEquals(4, longestCommonSubsequence("AGGTAB", "GXTXAYB"));
    }
}