package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MaxSumContiguousSequence.*;

/**
 * @author Saurabh, Chitransh
 */
public class MaxSumContiguousSequenceTest {

    @Test
    public void testMaxContiguousSequenceSum () throws Exception {
        assertEquals(20, maxContiguousSequenceSum(-2, 11, -4, 13, -5, 2));
        assertEquals(7, maxContiguousSequenceSum(1, -3, 4, -2, -1, 6));
        assertEquals(7, maxContiguousSequenceSum(-2, -3, 4, -1, -2, 1, 5, -3));
    }
}