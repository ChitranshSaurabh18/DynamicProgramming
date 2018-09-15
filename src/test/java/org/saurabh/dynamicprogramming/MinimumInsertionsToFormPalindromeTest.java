package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MinimumInsertionsToFormPalindrome.*;

/**
 * @author Saurabh, Chitransh
 */
public class MinimumInsertionsToFormPalindromeTest {

    @Test
    public void testMinInsertions () throws Exception {
        assertEquals(1, minInsertions("ab"));
        assertEquals(0, minInsertions("aa"));
        assertEquals(3, minInsertions("abcd"));
        assertEquals(2, minInsertions("abcda"));
        assertEquals(4, minInsertions("abcde"));
    }
}