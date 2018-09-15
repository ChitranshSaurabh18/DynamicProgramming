package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.DominoesTiling2XN.*;

/**
 * @author Saurabh, Chitransh
 */
public class DominoesTiling2XNTest {

    @Test
    public void testNoOfWaysOfTiling () throws Exception {
        assertEquals(3, noOfWaysOfTiling(3));
        assertEquals(5, noOfWaysOfTiling(4));
    }
}