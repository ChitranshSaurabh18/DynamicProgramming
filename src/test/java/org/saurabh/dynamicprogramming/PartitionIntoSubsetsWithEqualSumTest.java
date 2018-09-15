package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.PartitionIntoSubsetsWithEqualSum.*;

/**
 * @author Saurabh, Chitransh
 */
public class PartitionIntoSubsetsWithEqualSumTest {

    @Test
    public void testIsPartitionPossible () throws Exception {
        assertEquals(true, isPartitionPossible(1, 5, 11, 5));
        assertEquals(false, isPartitionPossible(1, 5, 3));
    }
}