package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.NoOfSubsequencesDivisibleByK.*;

/**
 * @author Saurabh, Chitransh
 */
public class NoOfSubsequencesDivisibleByKTest {

    @Test
    public void testNoOfSubSequencesDivisible () throws Exception {
        assertEquals(4, noOfSubSequencesDivisible(4, 1, 2, 3, 4));
        assertEquals(4, noOfSubSequencesDivisible(6, 3, 3, 0));
        assertEquals(3, noOfSubSequencesDivisible(6, 6, 7, 6));
    }
}