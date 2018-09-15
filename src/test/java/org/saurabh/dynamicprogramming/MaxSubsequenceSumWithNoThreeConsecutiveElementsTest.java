package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MaxSubsequenceSumWithNoThreeConsecutiveElements.*;

/**
 * @author Saurabh, Chitransh
 */
public class MaxSubsequenceSumWithNoThreeConsecutiveElementsTest {

    @Test
    public void testMaxSubSequenceSumNoThreeConsecutive () throws Exception {
        assertEquals(5, maxSubSequenceSumNoThreeConsecutive(1, 2, 3));
        assertEquals(5013, maxSubSequenceSumNoThreeConsecutive(3000, 2000, 1000, 3, 10));
        assertEquals(2101, maxSubSequenceSumNoThreeConsecutive(100, 1000, 100, 1000, 1));
        assertEquals(4, maxSubSequenceSumNoThreeConsecutive(1, 1, 1, 1, 1));
        assertEquals(27, maxSubSequenceSumNoThreeConsecutive(1, 2, 3, 4, 5, 6, 7, 8));
    }
}