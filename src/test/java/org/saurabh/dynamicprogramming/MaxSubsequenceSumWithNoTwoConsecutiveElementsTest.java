package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.saurabh.dynamicprogramming.MaxSubsequenceSumWithNoTwoConsecutiveElements.maxSubSequenceSumNoConsecutive;

/**
 * @author Saurabh, Chitransh
 */
public class MaxSubsequenceSumWithNoTwoConsecutiveElementsTest {

    @Test
    public void testMaxSubSequenceSumNoConsecutive () throws Exception {
        assertEquals(110, maxSubSequenceSumNoConsecutive(new int[]{5, 5, 10, 100, 10, 5}));
        assertEquals(4, maxSubSequenceSumNoConsecutive(new int[]{1, 2, 3}));
        assertEquals(20, maxSubSequenceSumNoConsecutive(new int[]{1, 20, 3}));
    }
}