package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.LongestPalindromicSubstring.*;

/**
 * @author Saurabh, Chitransh
 */
public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindromicSubstring () throws Exception {
        assertEquals("geeksskeeg", longestPalindromicSubstring("forgeeksskeegfor"));
    }
}