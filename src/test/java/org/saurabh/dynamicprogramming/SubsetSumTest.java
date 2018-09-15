package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.SubsetSum.*;

/**
 * @author Saurabh, Chitransh
 */
public class SubsetSumTest {

    @Test
    public void testIsSubsetSumPossible () throws Exception {
        assertEquals(true, isSubsetSumPossible(9, 3, 34, 4, 12, 5, 2));
        assertEquals(true, isSubsetSumPossible(0, -7, -3, -2, 5, 8));
    }
}